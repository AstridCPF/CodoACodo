package com.codoacodo.familyexpenses.controllers;

import com.codoacodo.familyexpenses.model.Family;
import com.codoacodo.familyexpenses.services.ServiceFamily;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FamilyController {

    @Autowired
    private ServiceFamily serviceFamily;

    @GetMapping("/families")
    private List<Family> getAllFamilies() {
        return serviceFamily.getAllFamilies();
    }


    @GetMapping("/families/{id}")
    private Family getFamilies(@PathVariable("id") Long familyId) {
        return serviceFamily.getFamilyById(familyId);
    }

    @DeleteMapping("/families/{id}")
    private void deleteFamily(@PathVariable("id") Long familyId)
    {
        serviceFamily.delete(familyId);
    }
    @PostMapping("/families")
    private Long saveExpense(@RequestBody Family families) {
        serviceFamily.saveOrUpdate(families);
        return families.getId();
    }
    @PutMapping("/families")
    private Family update(@RequestBody Family families) {
        serviceFamily.saveOrUpdate(families);
        return families;
    }


}
