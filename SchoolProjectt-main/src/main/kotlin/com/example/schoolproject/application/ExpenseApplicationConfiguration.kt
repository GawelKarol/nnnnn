package com.example.schoolproject.application

import com.example.schoolproject.domain.ExpensesRepository
import com.example.schoolproject.infrastructure.ExpenseInMemoryRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ExpenseApplicationConfiguration {
    @Bean
    fun expensesApplicationService(expensesRepository: ExpensesRepository): ExpenseApplicationService {
        return ExpenseApplicationService(expensesRepository)
    }


}