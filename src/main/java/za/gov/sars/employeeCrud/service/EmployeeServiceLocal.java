/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.gov.sars.employeeCrud.service;

import java.util.List;
import za.gov.sars.employeeCrud.domain.Employee;

/**
 *
 * @author S2028389
 */
public interface EmployeeServiceLocal {

    Employee save(Employee employee);

    Employee findById(Long id);

    Employee update(Employee employee);

    Employee deleteById(Long id);

    List<Employee> listAll();

    Employee findBySid(String sid);
}
