package creational.factorymethod.factory

import creational.factorymethod.docs.DocumentationForAuthority
import creational.factorymethod.service.OldAgeHouseService

class OldAgeAuthorityDocumentationFactory : AbstractAuthorityDocumentationFactory() {
    override fun getDocForAuthority(): DocumentationForAuthority =
        OldAgeHouseService().build().getDocumentationPerAuthority()
}