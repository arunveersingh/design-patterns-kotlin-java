package structural.proxy

class ZipCodeLocationServiceImpl : ZipCodeLocationService {
    override fun getCityByZipCode(zipCode: String): String =
        RemoteService().fetchCityByZipCode(zipCode)
}