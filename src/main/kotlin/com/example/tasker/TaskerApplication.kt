package com.example.tasker

import com.example.tasker.model.Task
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskerApplication

fun main(args: Array<String>) {
    runApplication<TaskerApplication>(*args)
}
