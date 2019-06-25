package behavioral.chainofresponsibility

class SupportServiceEntryPoint(private val handler : SupportService) : SupportService {

    override fun handleRequest(serviceRequest: ServiceRequest) {

        // do something something ... some stuff before actually processing the call
        // ...
        // ...
        // -- play a message "this call will be recorded for analytics purpose but we will call it
        // for quality reasons to make it sound as if we are doing so much for you" :P
        //

        // start processing
        handler.handleRequest(serviceRequest)
    }
}