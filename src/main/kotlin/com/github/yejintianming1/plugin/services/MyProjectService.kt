package com.github.yejintianming1.plugin.services

import com.intellij.openapi.project.Project
import com.github.yejintianming1.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
