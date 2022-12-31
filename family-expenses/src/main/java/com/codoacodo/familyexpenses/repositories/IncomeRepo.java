package com.codoacodo.familyexpenses.repositories;

import com.codoacodo.familyexpenses.model.Expense;
import com.codoacodo.familyexpenses.model.Family;
import com.codoacodo.familyexpenses.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IncomeRepo extends JpaRepository<Income, Long> {

    List<Income> findByFamilyIn(List<Family> families);

}
