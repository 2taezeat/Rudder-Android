package com.rudder.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.rudder.R
import com.rudder.databinding.FragmentAddPostHeaderBinding
import com.rudder.databinding.FragmentShowPostHeaderBinding
import com.rudder.viewModel.MainViewModel

class AddPostHeaderFragment : Fragment() {
    private val viewModel = MainViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val header = DataBindingUtil.inflate<FragmentAddPostHeaderBinding>(inflater,
            R.layout.fragment_add_post_header,container,false)
        header.mainVM = viewModel
        return header.root
    }
}