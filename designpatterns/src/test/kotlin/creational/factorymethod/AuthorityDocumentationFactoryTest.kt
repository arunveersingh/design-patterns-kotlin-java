package creational.factorymethod

import creational.factorymethod.usecaseone.factory.AuthorityDocumentationFactory
import creational.factorymethod.usecaseone.enums.HouseType
import org.junit.Test

class AuthorityDocumentationFactoryTest {

    @Test
    fun `test getDocForAuthority for a Mansion`(){
        assert(
            AuthorityDocumentationFactory.Companion.getDocForAuthority(HouseType.MANSION).description
            .equals("===========================================\n" +
                "This is to that this Mansion House with below details \n" +
                "is in compliance with the Mansion Authority. \n" +
                "-------------------------------------------------\n" +
                "This house has mansion quality italian finished rooms \n" +
                "This house has mansion quality wood doors \n" +
                "This house has mansion quality wood finished amphitheater \n" +
                "This house has mansion quality helipad \n" +
                "This house has mansion quality multi vehicle garage \n" +
                "This house has mansion quality wooden tennis court \n" +
                " \n" +
                "-------------------------------------------------\n" +
                "                                                 \n" +
                "                                                 \n" +
                "Signing Authority                                \n" +
                "Date \n"))
    }

    @Test
    fun `test getDocForAuthority for a MudHouse`(){
        assert(
            AuthorityDocumentationFactory.Companion.getDocForAuthority(HouseType.MUD).description
            .equals("===========================================\n" +
                    " This is to that this Mud House with below details \n" +
                    "is in compliance with the MudHouse Authority. \n" +
                    "-------------------------------------------------\n" +
                    "This house has mud quality italian finished rooms \n" +
                    "This house has mud quality wood doors \n" +
                    " \n" +
                    "-------------------------------------------------\n" +
                    "                                                 \n" +
                    "                                                 \n" +
                    "Signing Authority                                \n" +
                    "Date \n"))
    }

    @Test
    fun `test getDocForAuthority for a MultiStoreyHouse`(){
        assert(
            AuthorityDocumentationFactory.Companion.getDocForAuthority(HouseType.MULTISTOREY).description
            .equals("===========================================\n" +
                    " This is to certify that this MultiStorey House with below details \n" +
                    "is in compliance with the MultiHouse Authority. \n" +
                    "-------------------------------------------------\n" +
                    "This house has multistorey quality italian finished rooms \n" +
                    "This house has multistorey quality wood doors \n" +
                    "This house has multistorey quality wood finished amphitheater \n" +
                    "This house has multistorey quality multi vehicle garage \n" +
                    "This house has multistorey quality wooden tennis court \n" +
                    " \n" +
                    "-------------------------------------------------\n" +
                    "                                                 \n" +
                    "                                                 \n" +
                    "Signing Authority                                \n" +
                    "Date \n"))
    }

    @Test
    fun `test getDocForAuthority for an OldAgeHouse`(){
        assert(
            AuthorityDocumentationFactory.Companion.getDocForAuthority(HouseType.OLDAGE).description
                .equals("===========================================\n" +
                        " This is to certify that this MultiStorey House with below details \n" +
                        "is in compliance with the MultiHouse Authority. \n" +
                        "-------------------------------------------------\n" +
                        "This is a house specially designed for theold age people, to assist them with their daily routines. It has activities to keep themactive. Keep them relaxed, calm, and happy. \n" +
                        "----------- NOTE ------------\n" +
                        "At time writing this it reminded me of a book which I have read some time, its a good read, try some timehttp://atulgawande.com/book/being-mortal/  \n" +
                        " Being Mortal by Atul Gawande \n" +
                        " Have fun. :) \n" +
                        "-------------------------------------------------\n" +
                        "                                                 \n" +
                        "                                                 \n" +
                        "Signing Authority                                \n" +
                        "Date \n"))
    }
}