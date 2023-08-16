package com.appco.utilizandofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.appco.utilizandofragments.databinding.ActivityMainBinding
import com.appco.utilizandofragments.fragment.ChamadasFragment
import com.appco.utilizandofragments.fragment.ConversasFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            buttonConversas.setOnClickListener {

                val conversasFragment = ConversasFragment()

                val bundle = bundleOf(
                    "nome" to "Keventon Rian",
                    "email" to "kevertonguimaraes19@gmail.com"
                )
                conversasFragment.arguments = bundle

                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragmentContainerView, conversasFragment)
                    .commit()

                supportFragmentManager.commit {
                    replace<ConversasFragment>(R.id.fragmentContainerView, args = bundle)
                }
            }

            buttonChamadas.setOnClickListener {
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, ChamadasFragment()).commit()
            }
        }
    }
}