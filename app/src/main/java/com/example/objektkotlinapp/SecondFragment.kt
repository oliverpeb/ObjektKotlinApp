package com.example.objektkotlinapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.objektkotlinapp.databinding.FragmentSecondBinding
import androidx.navigation.fragment.navArgs


/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {
    val args: SecondFragmentArgs by navArgs()

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val personReceived = args.person
        binding.textViewPersonName.text = personReceived.name
        binding.textViewPersonAge.text = personReceived.age.toString()


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}