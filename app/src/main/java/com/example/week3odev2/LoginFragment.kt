package com.example.week3odev2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.week3odev2.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private lateinit var fragmentLoginBinding: FragmentLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       fragmentLoginBinding=FragmentLoginBinding.inflate(inflater)
        return fragmentLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*loginfragementten signfragmente geçmek için btnlogin ile
         */
        fragmentLoginBinding.apply {
            btnlogin.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_signFragment)
            }

        }
    }


}