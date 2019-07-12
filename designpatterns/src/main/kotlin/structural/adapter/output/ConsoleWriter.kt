package structural.adapter.output

open class ConsoleWriter : ConsoleInterface {
    override fun out(text: String) {
        println("Using ${this.javaClass.name} : text")
    }
}