package be.kotlin.restapikotlin.restapikotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class RestapikotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(RestapikotlinApplication::class.java, *args)
}
