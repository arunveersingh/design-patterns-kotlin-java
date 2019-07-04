package creational.factorymethod.docs

class MansionHouseDoc : AbstractHouseDoc() {

    private var documentation : String = ""

    fun addToDoc(documentation: String){
        this.documentation += documentation
    }

    override fun getDocumentationPerAuthority() : DocumentationForAuthority {
        return DocumentationForAuthority(
            "===========================================\n" +
                    "This is to that this Mansion House with below details \n" +
                    "is in compliance with the Mansion Authority. \n" +
                    "-------------------------------------------------\n" +
                    "$documentation \n" +
                    "-------------------------------------------------\n" +
                    "                                                 \n" +
                    "                                                 \n" +
                    "Signing Authority                                \n" +
                    "Date \n" +
                    ""
        )
    }

}