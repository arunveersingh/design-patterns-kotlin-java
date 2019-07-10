package structural.proxy

interface ZipCodeLocationService {
    fun getCityByZipCode(zipCode: String): String
}