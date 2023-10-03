package com.example.schoolproject.domain

interface ExpensesRepository {
 fun save(
     expense: Expense
 )

 fun getExpenseByName(
     expenseName: String
 ) : Expense

}