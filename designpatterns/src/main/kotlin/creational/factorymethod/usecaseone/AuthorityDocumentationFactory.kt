package creational.factorymethod.usecaseone

import creational.factorymethod.usecaseone.builders.MansionHouseDocBuilder
import creational.factorymethod.usecaseone.docs.AbstractHouseDoc
import creational.factorymethod.usecaseone.docs.DocumentationForAuthority

class AuthorityDocumentationFactory {

    fun getDocForAuthority(type: HouseType) : DocumentationForAuthority {

        return MansionHouseDocBuilder().addWindows(3).addAmphiTheater().build().getDocumentationPerAuthority()

    }

}

fun main(){
    println(AuthorityDocumentationFactory().getDocForAuthority(HouseType.MANSION).description)
}