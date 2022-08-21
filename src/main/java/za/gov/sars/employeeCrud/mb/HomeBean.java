/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.gov.sars.employeeCrud.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import za.gov.sars.employeeCrud.domain.Employee;

/**
 *
 * @author S2028389
 */
@ManagedBean
@RequestScoped
public class HomeBean extends BaseBean<Employee> {
    
    private static final String LANDING_PAGE = "/landing.xhtml";
    private static final String EXPIRY_PAGE = "/expired.xhtml?faces-redirect=true";

    public String routeToAdministration() {
        if (getActiveUser() != null) {
            getActiveUser().setModuleWelcomeMessage("Welcome to Administration Page");
            getActiveUser().getRouter().reset().setAdministrator(true);
            return LANDING_PAGE;
        }
        return EXPIRY_PAGE;
    }
    
}