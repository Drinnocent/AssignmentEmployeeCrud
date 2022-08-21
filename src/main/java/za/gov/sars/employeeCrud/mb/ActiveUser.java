/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.gov.sars.employeeCrud.mb;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import lombok.Getter;
import lombok.Setter;
import za.gov.sars.employeeCrud.common.Router;
import za.gov.sars.employeeCrud.domain.Employee;

/**
 *
 * @author S2028389
 */
@ManagedBean
@SessionScoped
@Getter
@Setter
public class ActiveUser {

    private String sid;
    private String moduleWelcomeMessage;
    private String loggedOnUserFullName;
    private String fullName;
    private boolean userLoginIndicator;
    private Router router = new Router();

    public ActiveUser() {
        userLoginIndicator = Boolean.FALSE;
    }

    public void setLogonUserSession(Employee emp) {
        if (emp != null) {
            this.setFullName(emp.getFirstName()+" "+emp.getLastName());
            this.setSid(emp.getSid());

        }
        this.setUserLoginIndicator(true);
    }

}
