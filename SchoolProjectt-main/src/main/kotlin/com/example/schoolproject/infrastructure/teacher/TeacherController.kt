package com.example.schoolproject.infrastructure.teacher

import com.example.schoolproject.domain.Teacher
import org.springframework.web.bind.annotation.*

@RequestMapping("/school/teacher")
@RestController
class TeacherController {

    private val teachers: MutableMap<String, Teacher> = mutableMapOf()
    @PostMapping("/{teachersId}")
    fun saveClassData(
        @PathVariable teachersId: String,
        @RequestBody teachers: Teacher
    ){
        this.teachers.put(teachersId, teachers)
    }
    @GetMapping("/{teachersId}")
    fun returnClassData(
        @PathVariable teachersId: String
    ): Teacher? {
        return this.teachers.get(teachersId)
    }
}