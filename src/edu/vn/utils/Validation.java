/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.vn.utils;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author macbook
 */
public class Validation {

   /* public static boolean isEmpty(JTextField txtField,String msg){
        String txtValue = txtField.getText().trim();
        if(txtValue.length() == 0){
            JOptionPane.showMessageDialog(null, msg);
            txtField.setBackground(Color.yellow);
            txtField.requestFocus();
            return true;
        }
        txtField.setBackground(Color.white);
        return false;
    }*/

    public static boolean isEmail(JTextField txtField){
        String txtValue = txtField.getText().trim();
        String strPtn="^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        if(!txtValue.matches(strPtn)) {
            txtField.setBackground(Color.yellow);
            return false;
        }txtField.setBackground(Color.white);
        return true;
    }

    public static boolean isNumber(JTextField txtField){
        String txtValue = txtField.getText().trim();
        String strPtn="^\\d{1,}$";
        if(!txtValue.matches(strPtn)){
            txtField.setBackground(Color.yellow);
            return false;
        }
        txtField.setBackground(Color.white);
        return true;
    }
    
    public static boolean isName(JTextField txtField){
        String txtValue = txtField.getText().trim();
        String strPtn="^[\\p{L} .'-]+$";
        if(!txtValue.matches(strPtn)){
            txtField.setBackground(Color.yellow);
            return false;
        }
        txtField.setBackground(Color.white);
        return true;
    }
}
