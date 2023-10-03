package com.example.schoolproject.infrastructure

import com.example.schoolproject.domain.Expense
import com.example.schoolproject.domain.ExpensesRepository
import java.lang.RuntimeException

class ExpenseInMemoryRepository : ExpensesRepository {
    private val expenses: MutableMap<String, Expense> = mutableMapOf()

    override fun save(expense: Expense)  {
        this.expenses.put(expense.expenseName, expense)
    }

    override fun getExpenseByName(expenseName: String): Expense {
        return this.expenses.get(expenseName) ?: throw RuntimeException("Cannot find expense's")
    }
}