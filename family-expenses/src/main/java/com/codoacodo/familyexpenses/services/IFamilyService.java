package com.codoacodo.familyexpenses.services;

import com.codoacodo.familyexpenses.model.Family;

import java.util.List;

public interface IFamilyService {


    List<Family> getAllFamilies();

    Family getFamilyById(Long id);

    void saveOrUpdate(Family family);

    void delete(Long id);

    void update(Family family, Long id);







}
