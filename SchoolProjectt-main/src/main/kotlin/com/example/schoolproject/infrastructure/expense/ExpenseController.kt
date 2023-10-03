package com.example.schoolproject.infrastructure.expense

import com.example.schoolproject.application.ExpenseApplicationService
import com.example.schoolproject.application.ExpenseDto
import com.example.schoolproject.domain.Expense
import com.example.schoolproject.domain.ExpensesRepository
import org.springframework.web.bind.annotation.*

@RequestMapping("/school/expanse")
@RestController
class ExpenseController(private val expenseApplicationService: ExpenseApplicationService) {


    fun mapExpenseDtoToExpenseRestDto(expenseDto: ExpenseDto):ExpenseRestDto{
        return ExpenseRestDto(
            expenseName = expenseDto.expenseName,
            amount = expenseDto.amount,
            date = expenseDto.date,
            description = expenseDto.description
        )
    }
    @PostMapping
    fun saveExpenseData(
        @RequestBody request: ExpenseRestDto
    ){
        expenseApplicationService.saveExpense(request.mapExpenseRestDtoToExpenseDto())
    }

    @GetMapping("/{expenseName}")
    fun getExpenseData(
        @PathVariable expenseName: String
    ) : ExpenseRestDto{
        return mapExpenseDtoToExpenseRestDto(expenseApplicationService.getExpense(expenseName))
    }
}