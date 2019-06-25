package behavioral.chainofresponsibility

import org.junit.Test

class SupportServiceEntryPointTest {

    // Support Service Chain Setup
    private val supportService = SupportServiceEntryPoint(FrontDesk(SupervisorDesk(ManagerDesk(DirectorDesk()))))

    @Test
    fun testHandleRequest(){

        val levelOneRequest = ServiceRequest(Level.ONE)
        val levelTwoRequest = ServiceRequest(Level.TWO)
        val levelThreeRequest = ServiceRequest(Level.THREE)
        val levelFourRequest = ServiceRequest(Level.FOUR)
        val levelInvalidRequest = ServiceRequest(Level.INVALID)

        // handleRequest method is invoked multiple times to handle the ServiceRequest.
        // But see the console output of this class to observe that each request is handled by
        // different implementation.
        supportService.handleRequest(levelOneRequest)
        supportService.handleRequest(levelTwoRequest)
        supportService.handleRequest(levelThreeRequest)
        supportService.handleRequest(levelFourRequest)
        supportService.handleRequest(levelInvalidRequest)

        /**
         * -- ACCEPTING THE CRIME MOMENT --
         * (Don't be distracted by this note, completely safe to even ignore it.)
         * 1. In this test I have misused a Level to keep INVALID status.
         * There are many ways to pass/handle the INVALID values but since we
         * are focusing on Chain of Responsibility so please ignore these things.
         *
         * 2. I am not using assertions in this Junit, so a test case without a
         * Junit assertions is nothing but almost a piece of crap. Yeah, SupportService#handleRequest
         * is a void method but still there are ways it can be tested. Will do it sometime. :)
         *
         */
    }
}