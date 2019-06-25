package behavioral.chainofresponsibility

class FrontDesk(private val next : SupportService) : SupportService {

    override fun handleRequest(serviceRequest: ServiceRequest) {
        if(serviceRequest.level == Level.ONE){
            serviceRequest.remark = "front desk solved the ticked"
            println(serviceRequest)
        }else {
            next.handleRequest(serviceRequest)
        }
    }
}