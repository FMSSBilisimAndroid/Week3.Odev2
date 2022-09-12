package com.example.week3odev2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.week3odev2.databinding.FragmentSignUpBinding

class SignFragment : Fragment() {
    private lateinit var fragmentSignUpBinding: FragmentSignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       fragmentSignUpBinding=FragmentSignUpBinding.inflate(inflater)
        return fragmentSignUpBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*signfragmentten mainaactivitye geri dönüş
         */
        fragmentSignUpBinding.apply {
            btn.setOnClickListener {
                findNavController().navigate(R.id.action_signUpFragment_to_mainActivity)
            }

        }
    }
}