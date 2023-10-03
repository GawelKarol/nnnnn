package com.example.schoolproject.domain

data class School(
    val schoolNumer: Int,
    val schoolName: String,
    val schoolAdress: String,
    val allClassNumber: Int,
    val allTeacherNumber: Int,
    val allStudentNumber: Int,
    val headTeacher: Teacher,
    val prefect: Student,
    val totalIncome: Double,
)
