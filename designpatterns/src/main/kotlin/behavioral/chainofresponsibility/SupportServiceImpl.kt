package behavioral.chainofresponsibility

class SupportServiceImpl(val handler : SupportService) : SupportService {

    override fun handleRequest(serviceRequest: ServiceRequest) {
        handler.handleRequest(serviceRequest)
    }
}