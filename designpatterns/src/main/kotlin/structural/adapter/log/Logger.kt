package structural.adapter.log

import structural.adapter.output.WriterInterface

class Logger(private val writerInterface: WriterInterface) : LoggerInterface {
    override fun log(text: String) {
        writerInterface.write(text)
    }
}