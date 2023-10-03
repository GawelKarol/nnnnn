package com.example.schoolproject.application

import java.time.LocalDate

data class ExpenseDto(
    val expenseName: String,
    val amount: Double,
    val date: LocalDate,
    val description: String
)
