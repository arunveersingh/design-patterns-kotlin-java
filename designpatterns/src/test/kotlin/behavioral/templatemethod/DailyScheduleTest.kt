package behavioral.templatemethod

import org.junit.Test

class DailyScheduleTest {

    @Test
    fun `active schedule`(){
        println("#####################")
        val person: Person = Person(ActiveSchedule(), "Mohit")
        person.schedule.executeSchedule()
        println("#####################")
    }

    @Test
    fun `unorganized schedule`(){
        println("#####################")
        val person: Person = Person(ActiveSchedule(), "Rahul")
        person.schedule.executeSchedule()
        println("#####################")
    }
}