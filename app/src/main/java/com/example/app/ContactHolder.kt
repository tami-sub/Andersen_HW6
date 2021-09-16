package com.example.app

import android.content.Context
import android.content.res.Resources
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app.contacts.Contact
import com.example.app.contacts.Contacts
import com.example.app.databinding.ContactItemBinding
import com.squareup.picasso.Picasso

class ContactHolder(item: View) : RecyclerView.ViewHolder(item), View.OnClickListener {

    private lateinit var resources:  Resources
    private lateinit var parentFragmentManager:androidx.fragment.app.FragmentManager
    private lateinit var contacts: Contacts
    private val binding = ContactItemBinding.bind(item)

    fun bind(contact: Contact) = with (binding){
        contactName.text = contact.name
        contactSurname.text = contact.surname
        contactNumber.text = contact.number
//        Picasso.with(parent.context).load("https://picsum.photos/300/300").into(imageView)

    }

    init{
        item.setOnClickListener(this)
    }

    override fun onClick(p0: View?): Unit = with(binding){
        println(contactName.text)
        val result = Bundle()

        result.putString("data", position.toString())
        result.putParcelable("allContacts", contacts)

        if (resources.configuration?.smallestScreenWidthDp!! >= 600) {
            parentFragmentManager.setFragmentResult("dataFrag1", result)
            parentFragmentManager.beginTransaction().replace(R.id.flFragment2,
                ContactDetails.newInstance()).commit()
        } else {
            parentFragmentManager.setFragmentResult("dataFrag1", result)
            parentFragmentManager.beginTransaction().replace(R.id.flFragment,
                ContactDetails.newInstance()).commit()
        }
    }

    fun sendData(
        position: Int,
        resources: Resources, contacts: Contacts,
        parentFragmentManager: ContactListFragment,
        parent:ViewGroup
    ){
        this.resources = resources
        this.parentFragmentManager = parentFragmentManager.parentFragmentManager
        this.contacts = contacts
    }
    fun getContext(parent:ViewGroup) {

    }

}