package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompanies(String searchPhrase) {
        List<Company> foundCompanies = companyDao.findCompanyNameLike(searchPhrase);
        return foundCompanies;
    }

    public List<Employee> findEmployees(String searchPhrase) {
        List<Employee> foundEmployees = employeeDao.findEmployeesWithPhrase(searchPhrase);
        return foundEmployees;
    }
}
