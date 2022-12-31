package com.codoacodo.familyexpenses.services;

import com.codoacodo.familyexpenses.model.Expense;
import com.codoacodo.familyexpenses.model.Income;

import java.util.List;

public interface IIncomeService {

    List<Income> getAllIncomes();

    List<Income> getAllIncomesByFamily(Long id);

    Income getIncomesById(Long id);

    void saveOrUpdate(Income income);

    void delete(Long id);

    void update(Income income, Long id);



}
