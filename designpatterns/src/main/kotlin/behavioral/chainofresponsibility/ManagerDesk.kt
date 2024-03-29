package behavioral.chainofresponsibility

class ManagerDesk(private val next: SupportService) : SupportService {

    override fun handleRequest(serviceRequest: ServiceRequest) {
        if(serviceRequest.level == Level.THREE){
            serviceRequest.remark = "manager desk solved the ticked"
            println(serviceRequest)
        }else {
            next.handleRequest(serviceRequest)
        }
    }

}