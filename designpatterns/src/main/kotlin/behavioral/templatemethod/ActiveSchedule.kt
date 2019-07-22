package behavioral.templatemethod

class ActiveSchedule : DailySchedule() {

    override fun wakeUp() {
        println("Good Morning! What a nice day.")
    }

    override fun freshenUp() {
        println("Honey Lemon Water!")
        println("Yoga!")
    }

    override fun ready() {
        println("Clean and ironed clothes with clean socks!")
    }

    override fun commuteToOffice() {
        println("Just before peak hours so no traffic!")
    }

    override fun meetings() {
        println("Quick Crisp and Short stand up  - with no one cribbing about technical details too much as an excuse!")
    }

    override fun teaBreaks() {
        // do nothing
    }

    override fun lunch() {
        println("Enjoying the burger in nearby Burger Junction!")
    }

    override fun actualWork() {
        println("Writing the Junit Test cases! We follow TDD!")
    }

    override fun commuteToHome() {
        println("Just for office on time. No manager has taunted #SoEarly :P ")
    }
}