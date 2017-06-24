/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employeeApp.eao;

import com.employeeApp.entity.EDepartment;
import com.employeeApp.entity.EEmployeePosition;
import com.employeeApp.entity.Employee;

import javax.ejb.Local;
import java.util.Date;
import java.util.List;

/**
 *
 * @author AnaCris
 */
@Local
public interface IEmployeeManagerBeanLocal {
    
    void create(Employee employee);

    public Employee createEmployee(String firstName, String lastName, Date dateOfBirth, String country, EEmployeePosition position, EDepartment department, Date startDate);

    void edit(Employee employee);

    void remove(Employee employee);

    List<Employee> findRange(int[] range);

    int count();
    
    List<Employee> findAllEmployees();
    
    Employee findById(Long id);
    
    Employee findByFirstName(String firstName);
    
    Employee findByLastName(String lastName);
    
    Employee findByDateOfBirth(Date dateOfBirth);
    
    Employee findByCountry(String country);
    
    Employee findByStatus(String status);
    
    Employee findByPosition(String position);
    
    Employee findByDepartment(String department);
    
    Employee findByStartDate(Date startDate);
    
    
    
    
    
    
    
    
    
    
    
    
}