/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.views;

import com.controllers.PagesController;
import com.models.User;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;
import com.helper.FileHelper;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iolux
 */
public class DashboardAdmin extends javax.swing.JFrame implements ActionListener, Serializable{

    /**
     * Creates new form DashboardAdmin
     */
    public DashboardAdmin() {
        initComponents();
        
        this.jButton1.addActionListener(this);
        this.jButton2.addActionListener(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Admin Page");

        jButton1.setText("Logout");

        jButton2.setText("List Barang");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton1)
                        .addGap(55, 55, 55)
                        .addComponent(jButton2)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;

    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == this.jButton1){
            FileHelper.saveConfigToFile(null);
            try {
                new PagesController().viewLoginPage();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DashboardAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }else if(ae.getSource() == this.jButton2){
            try {
                new PagesController().viewListBarang();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DashboardAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }
    }
}
