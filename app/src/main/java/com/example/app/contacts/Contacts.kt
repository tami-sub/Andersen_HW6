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
        20 to Contact("Yan", "Borowski", "88127280337"),
        21 to Contact("Frey", "Kfc", "88128408764"),
        22 to Contact("Fray", "Future", "88127025252"),
        23 to Contact("Pup", "Noy", "88129407759"),
        24 to Contact("Kate", "Nee", "88126744373"),
        25 to Contact("Zohan", "Lust", "88123917360"),
        26 to Contact("Braden", "Wasser", "88121345976"),
        27 to Contact("Brad", "Chandski", "88129529078"),
        28 to Contact("Dean", "Summer", "88125130214"),
        29 to Contact("Sam", "Winter", "88120543256"),
        30 to Contact("Aaron", "Ne", "89004076723"),
        31 to Contact("Miki", "Matsubara", "88122472268"),
        32 to Contact("Frey", "Kfc", "88128408764"),
        33 to Contact("Fray", "Future", "88127025252"),
        34 to Contact("Pup", "Noy", "88129407759"),
        35 to Contact("Kate", "Nee", "88126744373"),
        36 to Contact("Zohan", "Lust", "88123917360"),
        37 to Contact("Braden", "Wasser", "88121345976"),
        38 to Contact("Brad", "Chandski", "88129529078"),
        39 to Contact("Dean", "Summer", "88125130214"),
        40 to Contact("Sam", "Winter", "88120543256"),
        41 to Contact("Aaron", "Ne", "89004076723"),
        42 to Contact("Miki", "Matsubara", "88122472268"),
        43 to Contact("Fray", "Future", "88127025252"),
        44 to Contact("Pup", "Noy", "88129407759"),
        45 to Contact("Kate", "Nee", "88126744373"),
        46 to Contact("Zohan", "Lust", "88123917360"),
        47 to Contact("Braden", "Wasser", "88121345976"),
        48 to Contact("Brad", "Chandski", "88129529078"),
        49 to Contact("Dean", "Summer", "88125130214"),
        50 to Contact("Sam", "Winter", "88120543256"),
        51 to Contact("Aaron", "Ne", "89004076723"),
        52 to Contact("Miki", "Matsubara", "88122472268"),
        53 to Contact("Yan", "Borowski", "88127280337"),
        54 to Contact("Frey", "Kfc", "88128408764"),
        55 to Contact("Fray", "Future", "88127025252"),
        56 to Contact("Pup", "Noy", "88129407759"),
        57 to Contact("Kate", "Nee", "88126744373"),
        58 to Contact("Zohan", "Lust", "88123917360"),
        59 to Contact("Braden", "Wasser", "88121345976"),
        60 to Contact("Brad", "Chandski", "88129529078"),
        61 to Contact("Dean", "Summer", "88125130214"),
        62 to Contact("Sam", "Winter", "88120543256"),
        63 to Contact("Aaron", "Ne", "89004076723"),
        64 to Contact("Miki", "Matsubara", "88122472268"),
        65 to Contact("Frey", "Kfc", "88128408764"),
        66 to Contact("Fray", "Future", "88127025252"),
        67 to Contact("Pup", "Noy", "88129407759"),
        68 to Contact("Kate", "Nee", "88126744373"),
        69 to Contact("Zohan", "Lust", "88123917360"),
        70 to Contact("Braden", "Wasser", "88121345976"),
        71 to Contact("Brad", "Chandski", "88129529078"),
        72 to Contact("Dean", "Summer", "88125130214"),
        73 to Contact("Sam", "Winter", "88120543256"),
        74 to Contact("Aaron", "Ne", "89004076723"),
        75 to Contact("Miki", "Matsubara", "88122472268"),
        76 to Contact("Fray", "Future", "88127025252"),
        77 to Contact("Pup", "Noy", "88129407759"),
        78 to Contact("Kate", "Nee", "88126744373"),
        79 to Contact("Zohan", "Lust", "88123917360"),
        80 to Contact("Braden", "Wasser", "88121345976"),
        81 to Contact("Brad", "Chandski", "88129529078"),
        82 to Contact("Dean", "Summer", "88125130214"),
        83 to Contact("Sam", "Winter", "88120543256"),
        84 to Contact("Aaron", "Ne", "89004076723"),
        85 to Contact("Miki", "Matsubara", "88122472268"),
        86 to Contact("Yan", "Borowski", "88127280337"),
        87 to Contact("Frey", "Kfc", "88128408764"),
        88 to Contact("Fray", "Future", "88127025252"),
        89 to Contact("Pup", "Noy", "88129407759"),
        90 to Contact("Kate", "Nee", "88126744373"),
        91 to Contact("Zohan", "Lust", "88123917360"),
        92 to Contact("Braden", "Wasser", "88121345976"),
        93 to Contact("Brad", "Chandski", "88129529078"),
        94 to Contact("Dean", "Summer", "88125130214"),
        95 to Contact("Sam", "Winter", "88120543256"),
        96 to Contact("Aaron", "Ne", "89004076723"),
        97 to Contact("Miki", "Matsubara", "88122472268"),
        98 to Contact("Frey", "Kfc", "88128408764"),
        99 to Contact("Fray", "Future", "88127025252")
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