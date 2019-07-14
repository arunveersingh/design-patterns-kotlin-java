package structural.adapter.adapter.compositionway

import structural.adapter.output.ConsoleInterface
import structural.adapter.output.ConsoleWriter
import structural.adapter.output.WriterInterface

class ConsoleToWriterAdapterUsingComposition : WriterInterface {

    // Composition
    private val console: ConsoleInterface = ConsoleWriter()

    override fun write(output: String) {
        console.out(output)
    }

}