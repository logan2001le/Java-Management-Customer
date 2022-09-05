/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.vn.utils;

import edu.vn.models.Customer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class FileUtil {
    public static final String FILE_NAME="customer.dat";
    public static void wFile(List<Customer> ls) throws FileNotFoundException, IOException {

        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ls);
        oos.close();
    }
   public static List<Customer> rFile() throws FileNotFoundException, IOException, ClassNotFoundException{
       FileInputStream fis = new FileInputStream(FILE_NAME);
       ObjectInputStream ois = new ObjectInputStream(fis);
       List<Customer> ls = new ArrayList<>();
       ls = (ArrayList<Customer>) ois.readObject();
       return ls;
   } 
    
}
