package behavioral.chainofresponsibility

import org.junit.Test

class SupportServiceImplTest {

    private val supportService = SupportServiceImpl(FrontDesk(SupervisorDesk(ManagerDesk(DirectorDesk()))))

    @Test
    fun testHandleRequest(){

        val levelOneRequest = ServiceRequest(Level.ONE)
        val levelTwoRequest = ServiceRequest(Level.TWO)
        val levelThreeRequest = ServiceRequest(Level.THREE)
        val levelFourRequest = ServiceRequest(Level.FOUR)
        val levelInvalidRequest = ServiceRequest(Level.INVALID)

        supportService.handleRequest(levelOneRequest)
        supportService.handleRequest(levelTwoRequest)
        supportService.handleRequest(levelThreeRequest)
        supportService.handleRequest(levelFourRequest)
        supportService.handleRequest(levelInvalidRequest)

    }
}