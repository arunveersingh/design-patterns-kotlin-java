package structural.proxy

import org.junit.Assert
import org.junit.Test
import java.util.*

class ZipCodeLocationServiceImplTest {

    @Test
    fun `testGetCityByZipCode for time reduction because of caching`() {
        val zipCodeLocationService: ZipCodeLocationService = CachedZipCodeLocationServiceImpl()
        var dateTime = Date()
        Assert.assertEquals("London", zipCodeLocationService.getCityByZipCode(zipCode = "123456"))
        assert(-dateTime.time + Date().time > 10000)

        // coming from cache so it will take less time
        dateTime = Date()
        Assert.assertEquals("London", zipCodeLocationService.getCityByZipCode(zipCode = "123456"))
        assert(-dateTime.time + Date().time < 10000)


        /*dateTime = Date()
        Assert.assertEquals("Paris", zipCodeLocationService.getCityByZipCode(zipCode = "123457"))
        assert(-dateTime.time + Date().time > 10000)

        dateTime = Date()
        Assert.assertEquals("Paris", zipCodeLocationService.getCityByZipCode(zipCode = "123457"))
        assert(-dateTime.time + Date().time < 10000)*/
    }


    @Test
    fun `testGetCityByZipCode for time reduction because of caching with invalid code`() {
        val zipCodeLocationService: ZipCodeLocationService = CachedZipCodeLocationServiceImpl()
        var dateTime = Date()
        Assert.assertEquals(
            "Not found with remote service.",
            zipCodeLocationService.getCityByZipCode(zipCode = "1234599999")
        )
        assert(-dateTime.time + Date().time > 10000)

        // coming from cache so it will take less time
        dateTime = Date()
        Assert.assertEquals(
            "Not found with remote service.",
            zipCodeLocationService.getCityByZipCode(zipCode = "1234599999")
        )
        assert(-dateTime.time + Date().time < 10000)
    }
}