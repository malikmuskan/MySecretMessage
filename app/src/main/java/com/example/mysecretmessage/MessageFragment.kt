package com.example.mysecretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class MessageFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view_new =inflater.inflate(R.layout.fragment_message, container, false)
        val nextButton = view_new.findViewById<Button>(R.id.next)

        nextButton.setOnClickListener {
            view_new.findNavController().navigate(R.id.action_messageFragment_to_welcomeFragment)
        }





        return view_new
    }
}