package com.example.app

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.findFragment
import androidx.recyclerview.widget.RecyclerView
import com.example.app.contacts.Contact
import com.example.app.contacts.Contacts

class ContactAdapter(private var contacts: Contacts) :
    RecyclerView.Adapter<ContactHolder>() {

    private var contactList = arrayListOf<Contact>()
    private lateinit var parent: ViewGroup

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        val holder = ContactHolder(view)
        this.parent = parent
        return holder
    }

    override fun onBindViewHolder(holder: ContactHolder, position: Int) {
        for (i in contacts.getContacts().values) {
            contactList.add(i)
        }
        holder.bind(contactList[position])
        holder.sendData(position,
            holder.itemView.context.resources,
            contacts,
            parentFragmentManager = parent.findFragment<ContactListFragment>(),parent)
    }

    override fun getItemCount(): Int {
        return contacts.getContacts().size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addPlant(contact: Contact) {
        contactList.add(contact)
        notifyDataSetChanged()
    }
}