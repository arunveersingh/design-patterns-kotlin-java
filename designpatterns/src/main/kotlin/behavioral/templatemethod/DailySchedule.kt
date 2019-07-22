package behavioral.templatemethod

abstract class DailySchedule {

    open fun preWakeUp(){
        // I feel that everyone do not have an implementation for this
        // so making an abstract method will force to provide the implementation
        // which is not suitable, so created a blank method
    }
    abstract fun wakeUp()
    abstract fun freshenUp()
    abstract fun ready()

    abstract fun commuteToOffice()

    private fun scheduleInOffice(){
        meetings()
        actualWork()
        teaBreaks()
        lunch()
        actualWork()
    }

    abstract fun meetings()
    abstract fun teaBreaks()
    abstract fun lunch()
    abstract fun actualWork()

    abstract fun commuteToHome()

    open fun dinner(){
        // Have the served food.
        println("enjoying the dinner")

        // if anyone do not want to have the serve food
        // override this default implementation and change
        // the behavior
    }

    private fun sleep(){
        println("Good Night!")
    }

    fun executeSchedule(){
        preWakeUp()
        wakeUp()
        freshenUp()
        ready()
        commuteToOffice()
        scheduleInOffice()
        commuteToHome()
        dinner()
        sleep()
    }

}