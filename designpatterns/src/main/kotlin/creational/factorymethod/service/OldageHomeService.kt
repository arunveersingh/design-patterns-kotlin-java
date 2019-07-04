package creational.factorymethod.service

import creational.factorymethod.docs.DocumentationForAuthority
import creational.factorymethod.docs.OldageHouseDoc

class OldageHomeService {

    fun build() : OldageHouseDoc {
        val doc = OldageHouseDoc()
        doc.addToDoc(fetchDetailsFromRemoteServer())
        return doc
    }

    /**
     * Mimicking external server call
     */
    private fun fetchDetailsFromRemoteServer() : String = "This is a house specially designed for the" +
            "old age people, to assist them with their daily routines. It has activities to keep them" +
            "active. Keep them relaxed, calm, and happy. \n" +
            "----------- NOTE ------------\n" +
            "At time writing this it reminded me of a book which I have read some time," +
            " its a good read, try some time" +
            "http://atulgawande.com/book/being-mortal/  \n" +
            " Being Mortal by Atul Gawande \n" +
            " Have fun. :)"
}