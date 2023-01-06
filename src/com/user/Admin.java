/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.user;
import com.model.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iolux
 */
public class Admin extends User{
    public Admin(String name, String no_tlp, String gender){
        super(name,no_tlp,gender);
    }
    
    @Override
    public boolean login(String nama, String id){
     
        try {
            String name = com.model.AdminModel.getNama(id);
            String iden = com.model.AdminModel.getId(id);
            if(name.equals(nama) && iden.equals(id)){
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
    
    @Override
    public void logout(){
        
    }
    
    @Override
    public void profile(){
        
    }
    
    @Override
    public boolean registration(String id, String nama, String no_telp, String gender){
        try{
            boolean cek = com.model.AdminModel.insertData(id, nama, no_telp, gender);
            if(cek){
                return true;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
    
    @Override
    public void twoStepVerification(){
        
    }
    
    public void feedback(){
        
    }
    
    public void rewards(){
        
    }
    
    public int estimateDelivery(){
        return 0;
    }
}
