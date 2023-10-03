package com.example.schoolproject.infrastructure.income

import com.example.schoolproject.domain.Income
import org.springframework.web.bind.annotation.*


@RequestMapping("/school/income")
@RestController
class IncomeController {
    private val income: MutableMap<String, Income> = mutableMapOf()
    @PostMapping("/{incomeName}")
    fun saveIncomeData(
        @PathVariable incomeName: String,
        @RequestBody income: Income
    ){
        this.income.put(incomeName, income)
    }
    @GetMapping("/{incomeName}")
    fun returnIncomeData(
        @PathVariable incomeName:String
    ):Income? {
        return this.income.get(incomeName)
    }
}