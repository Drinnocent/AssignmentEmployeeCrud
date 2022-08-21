/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.gov.sars.employeeCrud.common;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author S2028389
 */
@Getter
@Setter
public class Router implements Serializable{
    
    private boolean administrator;
    
    public Router reset() {
        administrator = Boolean.FALSE;
        return this;
    }
    
}
