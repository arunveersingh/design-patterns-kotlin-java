package behavioral.chainofresponsibility


class SupervisorDesk(var next: SupportService) : SupportService {

    override fun handleRequest(serviceRequest: ServiceRequest) {
        if(serviceRequest.level == Level.TWO){
            serviceRequest.remark = "supervisor desk solved the ticked"
            println(serviceRequest)
        }else {
            next.handleRequest(serviceRequest)
        }
    }

}