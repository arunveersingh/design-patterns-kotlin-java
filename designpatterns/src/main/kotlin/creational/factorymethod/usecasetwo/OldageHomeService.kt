package creational.factorymethod.usecasetwo

import creational.factorymethod.usecaseone.docs.AbstractHouseDoc
import creational.factorymethod.usecaseone.docs.DocumentationForAuthority

class OldageHomeService : AbstractHouseDoc() {

    override fun getDocumentationPerAuthority(): DocumentationForAuthority {
        return DocumentationForAuthority(
            "===========================================\n" +
                    " This is to certify that this MultiStorey House with below details \n" +
                    "is in compliance with the MultiHouse Authority. \n" +
                    "-------------------------------------------------\n" +
                    "${fetchDetailsFromRemoteServer()} \n" +
                    "-------------------------------------------------\n" +
                    "                                                 \n" +
                    "                                                 \n" +
                    "Signing Authority                                \n" +
                    "Date \n" +
                    ""
        )
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