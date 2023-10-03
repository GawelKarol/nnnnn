package com.example.schoolproject.domain

data class Teacher (
    val teacherId: Long,
    val firstName: String,
    val lastName: String,
    val subjectTaught: List<String>,
    val teacherAddress: String
)