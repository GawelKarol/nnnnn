package com.example.schoolproject.domain

import java.time.LocalDate

data class Expense(
    val expenseName: String,
    val amount: Double,
    val date: LocalDate,
    val description: String
)
