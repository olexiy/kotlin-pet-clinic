package de.olexiy.spring.kotlinpetclinic.domain

import java.time.LocalDate

class Pet {
    var type: PetType? = null
    var owner: Owner? = null
    var birthDate: LocalDate? = null
}

class PetType {
    var name: String = ""
}
