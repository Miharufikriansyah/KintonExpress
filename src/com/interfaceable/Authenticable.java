/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.interfaceable;

/**
 *
 * @author iolux
 */
public interface Authenticable {
    public abstract boolean login(String nama, String id);
    public abstract void logout();
    public abstract void profile();
    public abstract boolean registration(String id, String nama,String no_telp, String gender);
    public abstract void twoStepVerification();
}
