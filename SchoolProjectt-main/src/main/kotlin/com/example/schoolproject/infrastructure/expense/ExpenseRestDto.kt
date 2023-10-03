package com.example.schoolproject.infrastructure.expense

import com.example.schoolproject.application.ExpenseDto
import java.time.LocalDate

class ExpenseRestDto(
    val expenseName: String,
    val amount: Double,
    val date: LocalDate,
    val description: String
){
    fun mapExpenseRestDtoToExpenseDto(): ExpenseDto{
        return ExpenseDto(
            expenseName = this.expenseName,
            amount = this.amount,
            date = this.date,
            description = this.description
        )
    }
}
