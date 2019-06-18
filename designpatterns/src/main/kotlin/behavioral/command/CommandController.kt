package behavioral.command

interface CommandController {
    fun executeCommand(command : String)
    fun canHandle(command : String)
}