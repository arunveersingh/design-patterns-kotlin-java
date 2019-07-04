package creational.factorymethod.factory

import creational.factorymethod.builders.MultiStoreyHouseDocBuilder
import creational.factorymethod.docs.DocumentationForAuthority

class MultiStoreyAuthorityDocumentationFactory : AbstractAuthorityDocumentationFactory() {
    override fun getDocForAuthority(): DocumentationForAuthority =
        MultiStoreyHouseDocBuilder().buildStandard().getDocumentationPerAuthority()
}