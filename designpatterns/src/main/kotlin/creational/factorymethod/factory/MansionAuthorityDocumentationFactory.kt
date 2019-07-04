package creational.factorymethod.factory

import creational.factorymethod.builders.MansionHouseDocBuilder
import creational.factorymethod.docs.DocumentationForAuthority

class MansionAuthorityDocumentationFactory : AbstractAuthorityDocumentationFactory() {
    override fun getDocForAuthority(): DocumentationForAuthority =
        MansionHouseDocBuilder().buildStandard().getDocumentationPerAuthority()
}