package creational.factorymethod.factory

import creational.factorymethod.docs.DocumentationForAuthority

abstract class AbstractAuthorityDocumentationFactory {
    abstract fun getDocForAuthority(): DocumentationForAuthority
}