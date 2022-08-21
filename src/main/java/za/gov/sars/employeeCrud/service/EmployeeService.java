/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.gov.sars.employeeCrud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.gov.sars.employeeCrud.domain.Employee;
import za.gov.sars.employeeCrud.persistence.EmployeeRepository;

/**
 *
 * @author S2028389
 */
@Service
@Transactional
public class EmployeeService implements EmployeeServiceLocal{
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(
                                "The requested id [" + id
                                + "] does not exist."));
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee deleteById(Long id) {
        Employee employee = findById(id);
        if (employee != null) {
            employeeRepository.delete(employee);
        }
        return employee;
    }

    @Override
    public List<Employee> listAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findBySid(String sid) {
        return employeeRepository.findBySid(sid);
    }
    
}
