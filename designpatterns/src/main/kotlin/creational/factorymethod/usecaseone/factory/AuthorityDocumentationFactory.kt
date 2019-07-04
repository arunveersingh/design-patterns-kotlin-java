package creational.factorymethod.usecaseone.factory

import creational.factorymethod.usecaseone.builders.MansionHouseDocBuilder
import creational.factorymethod.usecaseone.builders.MudHouseDocBuilder
import creational.factorymethod.usecaseone.builders.MultiStoreyHouseDocBuilder
import creational.factorymethod.usecaseone.docs.DocumentationForAuthority
import creational.factorymethod.usecaseone.enums.HouseType

class AuthorityDocumentationFactory {

    companion object {
        fun getDocForAuthority(type: HouseType): DocumentationForAuthority {
            return when (type) {
                HouseType.MANSION -> MansionHouseDocBuilder().buildStandard().getDocumentationPerAuthority()
                HouseType.MUD -> MudHouseDocBuilder().buildStandard().getDocumentationPerAuthority()
                HouseType.MULTISTOREY -> MultiStoreyHouseDocBuilder().buildStandard().getDocumentationPerAuthority()
            }
        }
    }

}

fun main() {
   /* println(AuthorityDocumentationFactory().getDocForAuthority(HouseType.MANSION).description)
    println(AuthorityDocumentationFactory().getDocForAuthority(HouseType.MULTISTOREY).description)
    println(AuthorityDocumentationFactory().getDocForAuthority(HouseType.MUD).description)*/
}