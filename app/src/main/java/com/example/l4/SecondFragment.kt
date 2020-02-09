package com.example.l4


import android.icu.text.CaseMap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.l4.databinding.FragmentSecondBinding
import kotlinx.android.synthetic.*

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSecondBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)

        binding.commentButton.setOnClickListener{
            val action = SecondFragmentDirections.actionSecondFragmentToCommentFragment2().setComment(binding.commentText.text.toString())
            it.findNavController().navigate(action)
        }

        /*binding.commentButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_secondFragment))*/
        arguments?.let {
            val args  =  SecondFragmentArgs.fromBundle(it)
            binding.titleText.text = args.name
            binding.descriptionText.text = args.description
            binding.subTitleText.text = args.phrase
        }
        return binding.root /*inflater.inflate(R.layout.fragment_second, container, false)*/

    }



}
