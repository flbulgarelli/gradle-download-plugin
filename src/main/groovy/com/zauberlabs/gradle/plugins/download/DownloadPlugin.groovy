package com.zauberlabs.gradle.plugins.download

import org.gradle.api.*

class DownloadPlugin implements Plugin<Project> {
    def void apply(Project project) {
        project.tasks.withType(DownloadTask) { task ->
            task.conventionMapping.filename = { project.filename }
            task.conventionMapping.url = { project.url }
        }
    }
}

