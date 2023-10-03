package com.example.schoolproject.domain

data class Klasa(
    val classNumber: Int,
    val classType: String,
    val classHeadTeacher: Teacher,
    val studentOnDuty: Student,
    val classDimensionLength: Int,
    val classDimensionWidth: Int,
    val classMaxPersons: Int
)

