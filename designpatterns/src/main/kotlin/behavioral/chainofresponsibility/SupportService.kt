package behavioral.chainofresponsibility

interface SupportService {
    fun handleRequest(serviceRequest: ServiceRequest)
}