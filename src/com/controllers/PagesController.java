/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controllers;

import com.views.*;

/**
 *
 * @author iolux
 */
public class PagesController {
    private About about;
    private DashboardAdmin dashboardadmin;
    private DashboardPengirim dashboardpengirim;
    private Login login;
    private Home home;
    private Registration regist;
    
    public PagesController(){
        this.about = new About();
        this.dashboardadmin = new DashboardAdmin();
        this.dashboardpengirim = new DashboardPengirim();
        this.login = new Login();
        this.home = new Home();
        this.regist = new Registration();
    }
    
    public void viewMainPage(){
        this.home.setVisible(true);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.regist.setVisible(false);
    }
    
    public void viewLoginPage(){
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(true);
        this.regist.setVisible(false);
    }
    
    public void viewAboutPage(){
        this.home.setVisible(false);
        this.about.setVisible(true);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.regist.setVisible(false);
    }
    
    public void viewDashboardAdmin(){
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(true);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.regist.setVisible(false);
    }
    
    public void viewRegistration(){
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.regist.setVisible(true);
    }
}
