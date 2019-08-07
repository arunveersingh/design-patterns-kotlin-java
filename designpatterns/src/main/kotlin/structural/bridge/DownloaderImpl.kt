package structural.bridge

class DownloaderImpl : Downloader() {

    private lateinit var operatingSystem: OperatingSystem

    override fun download() {
        operatingSystem.processDownloading()
    }

    override fun save() {
        operatingSystem.processStoring()
    }

    override fun setOs(os: OperatingSystem) {
        this.operatingSystem = os
    }
}