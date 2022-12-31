package com.codoacodo.familyexpenses.controllers;

import com.codoacodo.familyexpenses.model.Expense;
import com.codoacodo.familyexpenses.services.ServiceExpense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpensesController {

    @Autowired
    private ServiceExpense serviceExpense;

    @GetMapping("/expenses")
    private List<Expense> getAllExpenses() {
        return serviceExpense.getAllExpenses();
    }

    @GetMapping("/expenses/family/{id}")
    private List<Expense> getAllExpensesByFamily(@PathVariable("id") Long familyId) {
        return serviceExpense.getAllExpensesByFamily(familyId);
    }
     
    
    @GetMapping("/expenses/{id}")
    private Expense getExpenses(@PathVariable("id") Long expensesId) {
        return serviceExpense.getExpenseById(expensesId);
    }
    
    @DeleteMapping("/expenses/{id}")
    private void deleteExpense(@PathVariable("id") Long expensesId) {
        serviceExpense.delete(expensesId);
    }
    @PostMapping("/expenses")
    private Long saveExpense(@RequestBody Expense expense) {
        serviceExpense.saveOrUpdate(expense);
        return expense.getId();
    }
    @PutMapping("/expenses")
    private Expense update(@RequestBody Expense expense) {
        serviceExpense.saveOrUpdate(expense);
        return expense;
    }


}
