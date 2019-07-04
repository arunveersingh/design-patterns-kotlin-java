package creational.factorymethod.factory

import creational.factorymethod.docs.DocumentationForAuthority
import creational.factorymethod.service.OldageHomeService

class OldAgeAuthorityDocumentationFactory : AbstractAuthorityDocumentationFactory() {
    override fun getDocForAuthority(): DocumentationForAuthority =
        OldageHomeService().build().getDocumentationPerAuthority()
}