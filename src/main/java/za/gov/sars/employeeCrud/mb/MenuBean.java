/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.gov.sars.employeeCrud.mb;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author S2028389
 */
@ManagedBean
@RequestScoped
public class MenuBean extends BaseBean {
    @PostConstruct
    public void init() {

    }
    public String route(String page) {
        System.out.println("selected page =" + page);
        return defaultRouter(page);
    }
    public String routing(String page) {
        if (page.equalsIgnoreCase("/administrations")) {
            getActiveUser().getRouter().reset().setAdministrator(true);
        }
        return defaultRouter(page);
    }
}
