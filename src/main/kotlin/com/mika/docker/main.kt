package com.mika.docker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockerApp

fun main(args: Array<String>) {
    runApplication<DockerApp>(*args)
}
