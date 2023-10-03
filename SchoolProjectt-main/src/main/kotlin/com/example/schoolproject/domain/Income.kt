package com.example.schoolproject.domain

import java.time.LocalTime

data class Income(
    val source: String,
    val amount: Double,
    val date: LocalTime,
    val description: String
)
