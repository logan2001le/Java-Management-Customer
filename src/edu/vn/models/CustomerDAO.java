/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.vn.models;

import edu.vn.inf.InterfCustomer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class CustomerDAO implements InterfCustomer{
    public static List<Customer> ls=new ArrayList<>();
    @Override
    public int save(Customer c) {
        int pos=findById(c.getId());
        if (pos<0) {
            ls.add(c);
           
        }else{
        ls.set(pos, c);
        }
        return 1;
    }

    @Override
    public int del(String id) {
        int pos=findById(id);
        if (pos>=0) {
            ls.remove(pos);
        }
        return pos;
    }

    @Override
    public int findById(String id) {
        int position=-1;
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getId().equals(id)) {
                position=i;
                break;
            }
        }
        return position;
    }

    @Override
    public Customer getCustomerByPositon(int index) {
        if (index>=0 && index <ls.size() )
        {
            return ls.get(index);
        }
        return null;
    }

    @Override
    public List<Customer> openFile() {
        
        ls.clear();
        ls.add(new Customer("1234","Long","asd","ddf","dff"));
        ls.add(new Customer("12454","Lng","asdg","ddsf","df13f"));
        ls.add(new Customer("0123","Lrdng","fsd","ddddf","daff"));
        return ls;
    }

    @Override
    public void saveFile(List<Customer> ls) {
    }

    @Override
    public List<Customer> getAlls() {
        return ls;
    }
        
    
    @Override
    public int count(){
        return ls.size();
    }
    
}
