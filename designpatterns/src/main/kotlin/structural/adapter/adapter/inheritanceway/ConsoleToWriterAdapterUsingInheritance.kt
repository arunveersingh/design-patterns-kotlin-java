package structural.adapter.adapter.inheritanceway

import structural.adapter.output.ConsoleWriter
import structural.adapter.output.WriterInterface

class ConsoleToWriterAdapterUsingInheritance: ConsoleWriter(), WriterInterface {
    override fun write(output: String) {
        out(output)
    }
}