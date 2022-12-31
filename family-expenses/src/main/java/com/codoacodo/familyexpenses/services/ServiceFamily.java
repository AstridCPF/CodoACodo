package com.codoacodo.familyexpenses.services;

import com.codoacodo.familyexpenses.model.Family;
import com.codoacodo.familyexpenses.repositories.ExpenseRepo;
import com.codoacodo.familyexpenses.repositories.FamilyRepo;
import com.codoacodo.familyexpenses.repositories.IncomeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceFamily implements IFamilyService {

    @Autowired
    private final FamilyRepo familyRepo;


    public ServiceFamily(FamilyRepo familyRepo) {
        this.familyRepo = familyRepo;
    }


    /**
     * @return
     */
    @Override
    public List<Family> getAllFamilies() {
        List<Family> families = new ArrayList<Family>();
        familyRepo.findAll().forEach(family -> families.add(family));
        return families;
    }

    /**
     * @return
     */
    @Override
    public Family getFamilyById(Long id) {
        return familyRepo.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Family family) {
        familyRepo.save(family);
    }

    @Override
    public void delete(Long id) {
        familyRepo.deleteById(id);
    }

    public void update(Family family, Long id) {
        familyRepo.save(family);
    }

}
