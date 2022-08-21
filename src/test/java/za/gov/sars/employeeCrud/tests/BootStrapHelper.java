/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.gov.sars.employeeCrud.tests;

import java.util.Date;
import za.gov.sars.employeeCrud.domain.Employee;

/**
 *
 * @author S2028389
 */
public class BootStrapHelper {
    
    public static Employee getEmployee(String sid, String employeeNumber, String firstName,String lastName, String emailAddress, String idNumber, String contactNumber) {
        Employee employee = new Employee();
        employee.setSid(sid);
        employee.setEmployeeNumber(employeeNumber);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEmailAddress(emailAddress);
        employee.setIdNumber(idNumber);
        employee.setContactNumber(contactNumber);
        employee.setCreatedBy(firstName);
        employee.setCreatedDate(new Date());
        
        return employee;
    }
}
