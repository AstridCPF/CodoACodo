package com.codoacodo.familyexpenses.services;

import com.codoacodo.familyexpenses.model.Expense;
import com.codoacodo.familyexpenses.model.Family;
import com.codoacodo.familyexpenses.model.Income;
import com.codoacodo.familyexpenses.repositories.ExpenseRepo;
import com.codoacodo.familyexpenses.repositories.IncomeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceIncome implements IIncomeService {

    @Autowired
    private final IncomeRepo incomeRepo;


    public ServiceIncome(IncomeRepo incomeRepo) {
        this.incomeRepo = incomeRepo;
    }

    @Override
    public List<Income> getAllIncomes(){
        List<Income> incomes = new ArrayList<>();
        incomeRepo.findAll().forEach(income -> incomes.add(income));
        return incomes;
    }

    /**
     * @return
     */
    @Override
    public List<Income> getAllIncomesByFamily(Long id) {

        List<Family> families = new ArrayList<>();
        families.add(new Family(id));
        return incomeRepo.findByFamilyIn(families);
    }

    /**
     * @return
     */
    @Override
    public Income getIncomesById(Long id) {
        return incomeRepo.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Income income) {
        incomeRepo.save(income);
    }

    @Override
    public void delete(Long id) {
        incomeRepo.deleteById(id);
    }

    public void update(Income income, Long id) {
        incomeRepo.save(income);
    }

}
