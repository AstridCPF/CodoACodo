package com.codoacodo.familyexpenses.services;

import com.codoacodo.familyexpenses.model.Expense;
import com.codoacodo.familyexpenses.model.Family;

import java.util.List;

public interface IExpenseService {


    List<Expense> getAllExpensesByFamily(Long id);

    Expense getExpenseById(Long id);

    void saveOrUpdate(Expense expense);

    void delete(Long id);

    void update(Expense expense, Long id);



}
