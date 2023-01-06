/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;
import java.sql.*;
/**
 *
 * @author LENOVO
 */
public class AdminModel {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/kintonexpress?zeroDateTimeBehavior=convertToNull";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";
    
    
    public static boolean insertData(String id, String nama, String no_telp, String gender)throws SQLException{
        try{
            Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate("INSERT INTO admin (id,nama,no_telp,gender) VALUES(" + "'" + id + "'" + "," + 
                    "'" + nama + "'" + "," + "'" + no_telp + "'" + "," + "'" + gender + "'" + ")");
            if(result != -1){
                return true;
            }
        }catch(Exception e){
            throw e;
        }
        return false;
    }
    
    
    
    public static String getId(String id) throws SQLException{
        String idNum = "";
        try{
            Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id FROM admin WHERE id=" + "'" + id + "'");
            while(rs.next()){
                idNum = rs.getString(1);
            }
            return idNum;
        }catch(Exception e){
            throw e;
        }
    }
    
    public static String getNama(String id) throws SQLException{
        String nama = "";
        try{
            Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nama FROM admin WHERE id=" + "'" + id + "'");
            while(rs.next()){
                nama = rs.getString(1);
            }
            return nama;
        }catch(Exception e){
            throw e;
        }
    }
    
    public static String getNoTelp(String id)throws SQLException{
        String no = "";
        try{
            Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT no_telp FROM admin WHERE id=" + "'" + id + "'");
            while(rs.next()){
                no = rs.getString(1);
            }
            return no;
        }catch(Exception e){
            throw e;
        }
    }
    
    public static String getGender(String id) throws SQLException{
        String gender = "";
        try{
            Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT gender FROM admin WHERE id=" + "'" + id + "'");
            while(rs.next()){
                gender = rs.getString(1);
            }
            return gender;
        }catch(Exception e){
            throw e;
        }
    }
    
    
 }
