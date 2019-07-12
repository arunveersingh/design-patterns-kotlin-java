package structural.adapter.output

class FileWriter : WriterInterface {
    override fun write(output: String) {
        // code to write in a file
        println("Using ${this.javaClass.name} : text")
    }
}