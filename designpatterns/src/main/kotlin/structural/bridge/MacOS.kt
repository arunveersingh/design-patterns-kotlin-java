package structural.bridge

class MacOS : OperatingSystem {
    override fun processDownloading(): Boolean {
        println("MacOS#processDownloading")
        return true
    }

    override fun processStoring(): Boolean {
        println("MacOS#processDownloading")
        return true
    }

}