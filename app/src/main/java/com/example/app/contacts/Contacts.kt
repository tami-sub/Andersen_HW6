package com.example.app.contacts

import android.os.Parcel
import android.os.Parcelable

open class Contacts() : Parcelable {
    private val contacts = mutableMapOf<Int, Contact>(
        0 to Contact("Jokler", "Bokler", "88005553535"),
        1 to Contact("Joka", "Boka", "89882431686"),
        2 to Contact("Biba", "Boba", "88005553535"),
        3 to Contact("Pupa", "Lupa", "89004076723"),
        3 to Contact("Ayan", "Mao", "88127515430"),
        4 to Contact("Bober", "Grey", "88124355268"),
        5 to Contact("John", "Farto", "88120202036"),
        6 to Contact("Dillan", "Goou", "88120053813"),
        7 to Contact("Bob", "Deal", "88127421735"),
        8 to Contact("Johan", "Zlatop", "88126079753"),
        9 to Contact("Frey", "Kfc", "88128408764"),
        10 to Contact("Fray", "Future", "88127025252"),
        11 to Contact("Pup", "Noy", "88129407759"),
        12 to Contact("Kate", "Nee", "88126744373"),
        13 to Contact("Zohan", "Lust", "88123917360"),
        14 to Contact("Braden", "Wasser", "88121345976"),
        15 to Contact("Brad", "Chandski", "88129529078"),
        16 to Contact("Dean", "Summer", "88125130214"),
        17 to Contact("Sam", "Winter", "88120543256"),
        18 to Contact("Aaron", "Ne", "89004076723"),
        19 to Contact("Miki", "Matsubara", "88122472268"),
        20 to Contact("Yan", "Borowski", "88127280337")
    )

    constructor(parcel: Parcel) : this() {
    }

    fun getContacts(): MutableMap<Int, Contact> {
        return contacts
    }

    fun replace(id: Int, contact: Contact) {
        contacts[id] = contact
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Contacts> {
        override fun createFromParcel(parcel: Parcel): Contacts {
            return Contacts(parcel)
        }

        override fun newArray(size: Int): Array<Contacts?> {
            return arrayOfNulls(size)
        }
    }
}