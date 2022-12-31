package com.codoacodo.familyexpenses.controllers;

import com.codoacodo.familyexpenses.model.Family;
import com.codoacodo.familyexpenses.model.Income;
import com.codoacodo.familyexpenses.services.ServiceIncome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IncomeController {

    @Autowired
    private ServiceIncome serviceIncome;

    @GetMapping("/incomes")
    private List<Income> getAllIncomes() {
        return serviceIncome.getAllIncomes();
    }

    @GetMapping("/incomes/family/{id}")
    private List<Income> getAllIncomesByFamily(@PathVariable("id") Long familyId) {
        return serviceIncome.getAllIncomesByFamily(familyId);
    }


    @GetMapping("/incomes/{id}")
    private Income getIncomes(@PathVariable("id") Long incomesId) {
        return serviceIncome.getIncomesById(incomesId);
    }

    @DeleteMapping("/incomes/{id}")
    private void deleteIncome(@PathVariable("id") Long incomesId) {
        serviceIncome.delete(incomesId);
    }
    @PostMapping("/incomes")
    private Long saveIncome(@RequestBody Income income) {
        serviceIncome.saveOrUpdate(income);
        return income.getId();
    }
    @PutMapping("/incomes")
    private Income update(@RequestBody Income income) {
        serviceIncome.saveOrUpdate(income);
        return income;
    }


}
