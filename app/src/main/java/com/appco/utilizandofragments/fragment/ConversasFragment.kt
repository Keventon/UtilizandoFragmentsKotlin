package com.appco.utilizandofragments.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appco.utilizandofragments.R
import com.appco.utilizandofragments.databinding.FragmentConversasBinding

class ConversasFragment : Fragment() {

    private var _binding: FragmentConversasBinding? = null
    private val binding get() = _binding!!

    private var nome: String? = null
    private var senha: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        nome = arguments?.getString("nome")
        senha = arguments?.getString("email")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentConversasBinding.inflate(inflater, container, false)

        with(binding) {
            inputNome.setText(nome)
            inputEmail.setText(senha)
        }

        return binding.root
    }
}