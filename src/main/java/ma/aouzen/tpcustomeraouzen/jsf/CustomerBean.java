/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ma.aouzen.tpcustomeraouzen.jsf;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;
import ma.aouzen.tpcustomeraouzen.entity.Customer;
import ma.aouzen.tpcustomeraouzen.service.CustomerManager;

/**
 *
 * @author PC
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
    @Inject  
    private CustomerManager customerManager;
    private List<Customer> customerList;  

    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
    }
    
    /** 
   * Retourne la liste des clients pour affichage dans une DataTable.
   */  
    public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  } 
    
}
