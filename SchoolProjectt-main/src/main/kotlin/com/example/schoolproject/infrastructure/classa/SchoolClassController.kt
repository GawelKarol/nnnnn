package com.example.schoolproject.infrastructure.classa

import com.example.schoolproject.domain.Klasa
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/school/class")
@RestController
class SchoolController {

    private val klasy: MutableMap<String, Klasa> = mutableMapOf()
    @PostMapping("/{classNumber}")
    fun saveClassData(
        @PathVariable classNumber: String,
        @RequestBody klasa: Klasa){
        this.klasy.put(classNumber, klasa)
    }
    @GetMapping("/{classNumber}")
    fun returnClassData(
        @PathVariable classNumber: String
    ): Klasa? {
        return this.klasy.get(classNumber)
    }
}