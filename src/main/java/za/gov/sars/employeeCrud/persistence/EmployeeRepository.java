/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.gov.sars.employeeCrud.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.gov.sars.employeeCrud.domain.Employee;

/**
 *
 * @author S2028389
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    Employee findBySid(String sid);
}
