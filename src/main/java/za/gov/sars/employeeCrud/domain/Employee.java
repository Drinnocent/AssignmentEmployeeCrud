/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.gov.sars.employeeCrud.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author S2028389
 */
@Entity
@Table(name = "employee")
@Getter
@Setter
public class Employee extends Person {

    @Column(name = "employee_number")
    private String employeeNumber;
    
    @Column(name="sid")
    private String sid;
}
