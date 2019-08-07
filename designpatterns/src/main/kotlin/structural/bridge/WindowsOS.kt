package structural.bridge

class WindowsOS : OperatingSystem{
    override fun processDownloading(): Boolean {
        println("WindowsOS#processDownloading")
        return true
    }

    override fun processStoring(): Boolean {
        println("WindowsOS#processStoring")
        return true
    }
}