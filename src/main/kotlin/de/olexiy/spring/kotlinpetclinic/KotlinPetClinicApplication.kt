package de.olexiy.spring.kotlinpetclinic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinPetClinicApplication

fun main(args: Array<String>) {
    runApplication<KotlinPetClinicApplication>(*args)
}
