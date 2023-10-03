package com.example.schoolproject.infrastructure

import com.example.schoolproject.domain.ExpensesRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InfrastructureConfiguration {
    @Bean
    fun expensesRepository(): ExpensesRepository{
        return ExpenseInMemoryRepository()
    }
}