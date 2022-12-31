package com.codoacodo.familyexpenses.repositories;

import com.codoacodo.familyexpenses.model.Family;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepo extends JpaRepository<Family, Long> {

}
