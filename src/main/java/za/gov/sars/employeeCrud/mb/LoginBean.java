/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.gov.sars.employeeCrud.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.springframework.beans.factory.annotation.Autowired;
import za.gov.sars.employeeCrud.domain.Employee;
import za.gov.sars.employeeCrud.service.EmployeeServiceLocal;

/**
 *
 * @author S2028389
 */
@ManagedBean
@RequestScoped
public class LoginBean extends BaseBean<Employee> {

    @Autowired
    private EmployeeServiceLocal employeeService;

    private String sidParam;

    public void signIn() {
        Employee emp = employeeService.findBySid(sidParam);
        if (emp == null) {
            addWarningMessage("Employee does not exist");
            return;
        }
        getActiveUser().setLogonUserSession(emp);
        redirect("home");
    }

    public String getSidParam() {
        return sidParam;
    }

    public void setSidParam(String sidParam) {
        this.sidParam = sidParam;
    }
}
