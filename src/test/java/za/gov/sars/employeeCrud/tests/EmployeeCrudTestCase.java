/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.gov.sars.employeeCrud.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import za.gov.sars.employeeCrud.config.TestDataSourceConfiguration;
import za.gov.sars.employeeCrud.domain.Employee;
import za.gov.sars.employeeCrud.service.EmployeeServiceLocal;

/**
 *
 * @author S2028389
 */
@EnableJpaAuditing
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestDataSourceConfiguration.class)
public class EmployeeCrudTestCase {

    @Autowired
    private EmployeeServiceLocal employeeService;

    public EmployeeCrudTestCase() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testScenarioA() {
        Employee employee = BootStrapHelper.getEmployee("s2028389", "174215", "Doctor", "Khanyile", "doc@gmail.com", "9503106394099", "0668741152");
        employeeService.save(employee);
    }

}
