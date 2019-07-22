package behavioral.templatemethod

class UnorganizedSchedule : DailySchedule() {

    override fun preWakeUp() {
        println("Snoozing alarm 20th time!")
    }

    override fun wakeUp() {
        println("Already 1 hour LATE per schedule!")
    }

    override fun freshenUp() {
        println("Consuming a THIN CYLINDER of finely cut tobacco rolled in paper for soaking!")
    }

    override fun ready() {
        println("Really? Is it even required? Where is my favorite shirt which I am wearing for last 4 days!")
    }

    override fun commuteToOffice() {
        println("Hmm .... Sorry team I am late will be in 2 hours late of course with no reason!")
    }

    override fun meetings() {
        println("Good part of being late. All the meetings are already over so no need to hear the teammates who do nothing but talk")
    }

    override fun teaBreaks() {
        println("That's life!")
    }

    override fun lunch() {
        println("Let's feast!")
    }

    override fun actualWork() {
        println("I am unorganized but when it comes to coding I am just awesome. My friends say so!")
    }

    override fun commuteToHome() {
        println("Leaving late has it's own advantage! No traffic, enjoy the drive!")
    }

    override fun dinner() {
        println("Already had something in office cafeteria!")
    }
}