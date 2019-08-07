package structural.bridge

interface OperatingSystem {
    fun processDownloading(): Boolean
    fun processStoring(): Boolean
}