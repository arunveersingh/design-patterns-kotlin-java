package structural.proxy

class CachedZipCodeLocationServiceImpl : ZipCodeLocationService {

    private val zipCodeLocationCache = mutableMapOf<String, String>()

    // Instead of initializing it can be injected
    private val zipCodeLocationService = ZipCodeLocationServiceImpl()

    override fun getCityByZipCode(zipCode: String): String {
        return if (zipCodeLocationCache.containsKey(zipCode)) {
            zipCodeLocationCache.getValue(zipCode)
        } else {
            val location = zipCodeLocationService.getCityByZipCode(zipCode)
            zipCodeLocationCache.putIfAbsent(zipCode, location)
            location
        }
    }
}