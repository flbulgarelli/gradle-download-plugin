package com.zauberlabs.gradle.plugins.download

import org.gradle.api.tasks.*
import org.gradle.api.*

class DownloadTask extends DefaultTask {

    String url
    String filename

    @TaskAction
    def download() {
        new File(filename).withOutputStream {
          it << new URL(url).openStream()
        } 
    }
}
