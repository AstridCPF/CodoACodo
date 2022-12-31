package com.codoacodo.familyexpenses.repositories;

import com.codoacodo.familyexpenses.model.Expense;
import com.codoacodo.familyexpenses.model.Family;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepo extends JpaRepository<Expense, Long> {

    List<Expense> findByFamilyIn(List<Family> families);


}
