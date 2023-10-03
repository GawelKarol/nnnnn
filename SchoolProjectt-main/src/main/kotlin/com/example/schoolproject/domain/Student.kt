package com.example.schoolproject.domain

import java.time.LocalDate

data class Student (
    val studentID: Long,
    val firstName: String,
    val lastName: String,
    val dateOfBirth: LocalDate?,
    val studentAddress: String
)
