package com.example.schoolproject.application

import com.example.schoolproject.domain.Expense
import com.example.schoolproject.domain.ExpensesRepository
import org.springframework.stereotype.Service


class ExpenseApplicationService(private val expensesRepository: ExpensesRepository) {
    fun mapExpenseDtoToExpense(expenseDto: ExpenseDto):Expense{
        return Expense(
            expenseName = expenseDto.expenseName,
            amount = expenseDto.amount,
            date = expenseDto.date,
            description = expenseDto.description
        )
    }
    fun mapExpensetoExpenseDto(expense: Expense):ExpenseDto{
        return ExpenseDto(
            expenseName = expense.expenseName,
            amount = expense.amount,
            date = expense.date,
            description = expense.description
        )
    }

    fun saveExpense(expense: ExpenseDto){
        expensesRepository.save(mapExpenseDtoToExpense(expense))
    }
    fun getExpense(expenseName: String) : ExpenseDto{
        return mapExpensetoExpenseDto(expensesRepository.getExpenseByName(expenseName))
    }
}