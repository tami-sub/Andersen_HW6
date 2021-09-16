package com.example.app

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app.contacts.Contacts
import com.example.app.databinding.ContactListFragmentBinding

class ContactListFragment : Fragment() {

    private lateinit var binding: ContactListFragmentBinding
    private var contacts = Contacts()
    private var adapter = ContactAdapter(contacts)


    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        binding = ContactListFragmentBinding.inflate(inflater)
        init()
        parentFragmentManager.setFragmentResultListener("dataFrag2", this, { _, result ->
            this.contacts = result.getParcelable("getAllContacts")!!
            adapter = ContactAdapter(contacts)
            init()
        })
        return binding.root

    }

    private fun init() {
        binding.apply {
            rcView.layoutManager = LinearLayoutManager(context)
            rcView.adapter = adapter
            val list = contacts.getContacts().values
            for (i in list) {
                adapter.addPlant(i)
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    }

    companion object {
        fun newInstance() = ContactListFragment()
    }
}