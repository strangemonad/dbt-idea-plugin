package com.github.strangemonad.dbtideaplugin.services

import com.intellij.openapi.project.Project
import com.github.strangemonad.dbtideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
