package com.github.alpaaka.mvvmtemplate.services

import com.github.alpaaka.mvvmtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
