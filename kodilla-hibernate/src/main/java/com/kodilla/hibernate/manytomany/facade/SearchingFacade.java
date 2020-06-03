package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchingFacade {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;

    public void searchEmployee(String lastNameFragment) {
        employeeDao.searchByLastName(lastNameFragment);
    }

    public void searchCompany(String nameFragment) {
        companyDao.searchByName(nameFragment);
    }
}
