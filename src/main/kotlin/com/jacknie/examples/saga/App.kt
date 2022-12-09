package com.jacknie.examples.saga

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class App

fun main(vararg args: String) {
  SpringApplication.run(App::class.java, *args)
}
