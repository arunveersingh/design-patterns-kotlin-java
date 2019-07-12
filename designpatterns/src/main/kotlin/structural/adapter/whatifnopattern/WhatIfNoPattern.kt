package structural.adapter.whatifnopattern

import structural.adapter.log.Logger
import structural.adapter.log.LoggerInterface
import structural.adapter.output.FileWriter

fun main() {
    val log: LoggerInterface = Logger(FileWriter())
    log.log("Hello!")
    /**
     * Now what to do??? Cannot pass ConsoleWriter
     */
    /*val log2: LoggerInterface = Logger(ConsoleWriter())
    log2.log("Hello")*/
}