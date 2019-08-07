package structural.bridge

import org.junit.Test

class FileDownloaderTest {

    @Test
    fun testDownloader(){

        var windowsDownloader: Downloader = DownloaderImpl()
        windowsDownloader.setOs(WindowsOS())
        windowsDownloader.download()
        windowsDownloader.save()

        var macOSDownloader: Downloader = DownloaderImpl()
        macOSDownloader.setOs(MacOS())
        macOSDownloader.download()
        macOSDownloader.save()

    }

}