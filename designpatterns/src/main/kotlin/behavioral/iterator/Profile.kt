package behavioral.iterator

import kotlin.collections.HashMap

class Profile(val email: String, val name: String, vararg contacts: String) {
    private val contacts = HashMap<String, MutableList<String>>()

    init {
        // Parse contact list from a set of "friend:email@gmail.com" pairs.
        for (contact in contacts) {
            val parts = contact.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            var contactType = "friend"
            val contactEmail: String
            if (parts.size == 1) {
                contactEmail = parts[0]
            } else {
                contactType = parts[0]
                contactEmail = parts[1]
            }
            if (!this.contacts.containsKey(contactType)) {
                this.contacts[contactType] = mutableListOf()
            }
            this.contacts[contactType]?.add(contactEmail)
        }
    }

    fun getContacts(contactType: String): List<String> {

        var list = this.contacts[contactType]?.toList()
        var emptyList = listOf<String>()

        return if (list == null){
             emptyList
        }else {
            list
        }
    }
}