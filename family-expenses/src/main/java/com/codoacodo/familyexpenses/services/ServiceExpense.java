package com.codoacodo.familyexpenses.services;

import com.codoacodo.familyexpenses.model.Expense;
import com.codoacodo.familyexpenses.model.Family;
import com.codoacodo.familyexpenses.repositories.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceExpense implements IExpenseService {

    @Autowired
    private final ExpenseRepo expenseRepo;


    public ServiceExpense(ExpenseRepo expenseRepo) {
        this.expenseRepo = expenseRepo;
    }


    /**
     * @return
     */
    public List<Expense> getAllExpenses() {

        List<Expense> expenses = new ArrayList<>();

        expenseRepo.findAll().forEach(expense -> expenses.add(expense));
        return expenses;
    }

    @Override
    public List<Expense> getAllExpensesByFamily(Long id) {
        List<Family> families = new ArrayList<>();
        families.add(new Family(id));
        return expenseRepo.findByFamilyIn(families);
    }

    /**
     * @return
     */
    @Override
    public Expense getExpenseById(Long id) {
        return expenseRepo.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Expense expense) {
        expenseRepo.save(expense);
    }

    @Override
    public void delete(Long id) {
        expenseRepo.deleteById(id);
    }

    public void update(Expense expense, Long id) {
        expenseRepo.save(expense);
    }

}
