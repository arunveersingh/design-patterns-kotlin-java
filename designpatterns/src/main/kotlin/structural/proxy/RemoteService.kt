package structural.proxy

import java.util.concurrent.TimeUnit

class RemoteService {
    private val database =
        mapOf("123456" to "London", "123457" to "Paris", "1234568" to "Abu Dhabi", "110001" to "Delhi")

    fun fetchCityByZipCode(zipCode: String): String {
        TimeUnit.MILLISECONDS.sleep(10000)
        return database.getOrDefault(zipCode, "Not found with remote service.")
    }
}