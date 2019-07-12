package structural.adapter

import org.junit.Test
import structural.adapter.adapter.compositionway.ConsoleToWriterAdapterUsingComposition
import structural.adapter.adapter.inheritanceway.ConsoleToWriterAdapterUsingInheritance
import structural.adapter.log.Logger
import structural.adapter.log.LoggerInterface
import structural.adapter.output.FileWriter
import structural.adapter.output.WriterInterface

class LoggerTest {

    // FIXME: Sorry for without assertions poor Junit Test

    @Test
    fun `test adapter pattern composition style`(){
        val writer : WriterInterface = ConsoleToWriterAdapterUsingComposition()
        val logger: LoggerInterface = Logger(writer)
        logger.log("Hello")
    }

    @Test
    fun `test adapter pattern inheritance style`(){
        val writer : WriterInterface = ConsoleToWriterAdapterUsingInheritance()
        val logger: LoggerInterface = Logger(writer)
        logger.log("Hello")
    }

    @Test
    fun `test file writer`(){
        val writer : WriterInterface = FileWriter()
        val logger: LoggerInterface = Logger(writer)
        logger.log("Hello")
    }
}