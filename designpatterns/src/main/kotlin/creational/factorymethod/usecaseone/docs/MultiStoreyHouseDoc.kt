package creational.factorymethod.usecaseone.docs

class MultiStoreyHouseDoc : AbstractHouseDoc() {
    private var documentation : String = ""

    fun addToDoc(documentation: String){
        this.documentation += documentation
    }

    override fun getDocumentationPerAuthority() : DocumentationForAuthority {
        return DocumentationForAuthority(
            "===========================================\n" +
                    " This is to certify that this MultiStorey House with below details \n" +
                    "is in compliance with the MultiHouse Authority. \n" +
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