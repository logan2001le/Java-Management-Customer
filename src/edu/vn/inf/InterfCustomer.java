/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.vn.inf;

import edu.vn.models .Customer;
import java.util.List;

/**
 *
 * @author macbook
 */
public interface InterfCustomer {
    
    int save(Customer c);
    int del(String id);
    int findById(String id);
    Customer getCustomerByPositon (int index);
    
    List<Customer> openFile();
    void saveFile(List<Customer> ls);
    List<Customer> getAlls();
    int count();
    
}
