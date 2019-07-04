package creational.factorymethod.factory

import creational.factorymethod.builders.MudHouseDocBuilder
import creational.factorymethod.docs.DocumentationForAuthority

class MudAuthorityDocumentationFactory : AbstractAuthorityDocumentationFactory() {
    override fun getDocForAuthority(): DocumentationForAuthority =
        MudHouseDocBuilder().buildStandard().getDocumentationPerAuthority()
}