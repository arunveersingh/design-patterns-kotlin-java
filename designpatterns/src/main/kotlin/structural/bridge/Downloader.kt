package structural.bridge

abstract class Downloader {
    abstract fun download()
    abstract fun save()
    abstract fun setOs(os: OperatingSystem)
}