package com.example.schoolproject.infrastructure.student

import com.example.schoolproject.domain.Student
import org.springframework.web.bind.annotation.*

@RequestMapping("/school/student")
@RestController
class StudentController {

    private val students: MutableMap<String, Student> = mutableMapOf()
    @PostMapping("/{studentID}")
    fun saveClassData(
        @PathVariable studentID: String,
        @RequestBody student: Student
    ){
        this.students.put(studentID, student)
    }
    @GetMapping("/{studentID}")
    fun returnClassData(
        @PathVariable studentID: String
    ): Student? {
        return this.students.get(studentID)
    }
}