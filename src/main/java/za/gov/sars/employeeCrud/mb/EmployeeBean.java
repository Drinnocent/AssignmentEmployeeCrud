/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.gov.sars.employeeCrud.mb;

import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import za.gov.sars.employeeCrud.domain.Employee;
import za.gov.sars.employeeCrud.service.EmployeeServiceLocal;

/**
 *
 * @author S2028389
 */
@ManagedBean
@ViewScoped
public class EmployeeBean extends BaseBean<Employee> {
    
    @Autowired
    private EmployeeServiceLocal employeeService;

    private static final Logger LOG = Logger.getLogger(Employee.class.getName());

    @PostConstruct
    public void init() {
        setPanelTitleName("Employees");
        this.reset().setList(true);
        addCollections(employeeService.listAll());
    }
    
    public void addOrUpdate(Employee employee) {
        this.reset().setAdd(true);
        if (employee != null) {
            setPanelTitleName("Update Employee");
            employee.setUpdatedBy(getActiveUser().getFullName());
            employee.setUpdatedDate(new Date());
        } else {
            setPanelTitleName("Add Employee");
            employee = new Employee();
            employee.setCreatedBy(getActiveUser().getLoggedOnUserFullName());
            employee.setCreatedDate(new Date());
            addCollection(employee);
        }
        addEntity(employee);
    }
    
    public void save(Employee emp) {
        try {
            if (emp.getId() != null) {
                employeeService.update(emp);
            } else {
                employeeService.save(emp);
            }
            reset().setList(true);
            addInformationMessage("Employee saved successfully");
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage());
        }
        setPanelTitleName("Employees");
    }
    public void delete(Employee emp) {     
        try {
            employeeService.deleteById(emp.getId());
            synchronize(emp);
            addInformationMessage("Employee successfully deleted");
            reset().setList(true);
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage());
        }
        setPanelTitleName("Employees");
    }
     public void synchronize(Employee emp) {
        Iterator<Employee> employeelList = getCollections().iterator();
        while (employeelList.hasNext()) {
            if (employeelList.next().getId().equals(emp.getId())) {
                employeelList.remove();
            }
        }
    }
      public void cancel(Employee emp) {
        if (emp.getId() == null) {
            if (getCollections().contains(emp)) {
                getCollections().remove(emp);
            }
        }
        this.reset().setList(true);
        setPanelTitleName("Categories");
    }

}
