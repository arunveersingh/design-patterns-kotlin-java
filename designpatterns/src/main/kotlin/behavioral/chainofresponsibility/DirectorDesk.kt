package behavioral.chainofresponsibility

class DirectorDesk : SupportService {

    override fun handleRequest(serviceRequest: ServiceRequest) {
        if(serviceRequest.level == Level.FOUR){
            serviceRequest.remark = "director desk solved the ticked"
            println(serviceRequest)
        }else {
            serviceRequest.remark = "Invalid request level: ${Level.INVALID_REQUEST}"
            println(serviceRequest)
        }
    }

}