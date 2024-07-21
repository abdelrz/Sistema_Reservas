package com.hotel.imperial.presentacion;

import com.hotel.imperial.presentacion.popups.ValidacionSalir;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BarraNavegacion extends javax.swing.JPanel {

    public BarraNavegacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        botonMenuPrincipal = new javax.swing.JButton();
        botonGestionClientes = new javax.swing.JButton();
        botonGestionReservas = new javax.swing.JButton();
        botonGestionPagos = new javax.swing.JButton();
        botonInformesIngresos = new javax.swing.JButton();
        botonInformesReservas = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(13, 32, 24));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Imperial Inn");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inicio");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gestión");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Informes");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Acerca de");

        botonMenuPrincipal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuPrincipal.setText("Menú principal");
        botonMenuPrincipal.setBorder(null);
        botonMenuPrincipal.setBorderPainted(false);
        botonMenuPrincipal.setContentAreaFilled(false);
        botonMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMenuPrincipal.setFocusPainted(false);
        botonMenuPrincipal.setFocusable(false);
        botonMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuPrincipalActionPerformed(evt);
            }
        });

        botonGestionClientes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonGestionClientes.setForeground(new java.awt.Color(255, 255, 255));
        botonGestionClientes.setText("Clientes");
        botonGestionClientes.setBorder(null);
        botonGestionClientes.setBorderPainted(false);
        botonGestionClientes.setContentAreaFilled(false);
        botonGestionClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGestionClientes.setFocusPainted(false);
        botonGestionClientes.setFocusable(false);
        botonGestionClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGestionClientesActionPerformed(evt);
            }
        });

        botonGestionReservas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonGestionReservas.setForeground(new java.awt.Color(255, 255, 255));
        botonGestionReservas.setText("Reservas");
        botonGestionReservas.setBorder(null);
        botonGestionReservas.setBorderPainted(false);
        botonGestionReservas.setContentAreaFilled(false);
        botonGestionReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGestionReservas.setFocusPainted(false);
        botonGestionReservas.setFocusable(false);
        botonGestionReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGestionReservasActionPerformed(evt);
            }
        });

        botonGestionPagos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonGestionPagos.setForeground(new java.awt.Color(255, 255, 255));
        botonGestionPagos.setText("Pagos");
        botonGestionPagos.setBorder(null);
        botonGestionPagos.setBorderPainted(false);
        botonGestionPagos.setContentAreaFilled(false);
        botonGestionPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGestionPagos.setFocusPainted(false);
        botonGestionPagos.setFocusable(false);
        botonGestionPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGestionPagosActionPerformed(evt);
            }
        });

        botonInformesIngresos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonInformesIngresos.setForeground(new java.awt.Color(255, 255, 255));
        botonInformesIngresos.setText("Ingresos");
        botonInformesIngresos.setBorder(null);
        botonInformesIngresos.setBorderPainted(false);
        botonInformesIngresos.setContentAreaFilled(false);
        botonInformesIngresos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInformesIngresos.setFocusPainted(false);
        botonInformesIngresos.setFocusable(false);
        botonInformesIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInformesIngresosActionPerformed(evt);
            }
        });

        botonInformesReservas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonInformesReservas.setForeground(new java.awt.Color(255, 255, 255));
        botonInformesReservas.setText("Reservas");
        botonInformesReservas.setBorder(null);
        botonInformesReservas.setBorderPainted(false);
        botonInformesReservas.setContentAreaFilled(false);
        botonInformesReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInformesReservas.setFocusPainted(false);
        botonInformesReservas.setFocusable(false);
        botonInformesReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInformesReservasActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        botonSalir.setBorderPainted(false);
        botonSalir.setContentAreaFilled(false);
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.setFocusPainted(false);
        botonSalir.setFocusable(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonMenuPrincipal)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(botonGestionClientes)
                            .addComponent(botonGestionReservas)
                            .addComponent(botonGestionPagos)
                            .addComponent(jLabel8)
                            .addComponent(botonInformesIngresos)
                            .addComponent(botonInformesReservas)
                            .addComponent(jLabel11)
                            .addComponent(botonSalir))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonMenuPrincipal)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGestionClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGestionReservas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGestionPagos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonInformesIngresos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonInformesReservas)
                .addGap(39, 39, 39)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonSalir)
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(941, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuPrincipalActionPerformed
        PresentacionMenuPrincipal menuPrincipal = new PresentacionMenuPrincipal();
        menuPrincipal.setVisible(true);
        menuPrincipal.setLocationRelativeTo(null);
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_botonMenuPrincipalActionPerformed

    private void botonGestionClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGestionClientesActionPerformed
        PresentacionGestionClientes gestionClientes = new PresentacionGestionClientes();
        gestionClientes.setVisible(true);
        gestionClientes.setLocationRelativeTo(null);
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_botonGestionClientesActionPerformed

    private void botonGestionReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGestionReservasActionPerformed
        PresentacionGestionReservas gestionReservas = new PresentacionGestionReservas();
        gestionReservas.setVisible(true);
        gestionReservas.setLocationRelativeTo(null);
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_botonGestionReservasActionPerformed

    private void botonGestionPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGestionPagosActionPerformed
        PresentacionGestionPagos gestionPagos = new PresentacionGestionPagos();
        gestionPagos.setVisible(true);
        gestionPagos.setLocationRelativeTo(null);
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_botonGestionPagosActionPerformed

    private void botonInformesIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInformesIngresosActionPerformed
        PresentacionInformeIngresos informeIngresos = new PresentacionInformeIngresos();
        informeIngresos.setVisible(true);
        informeIngresos.setLocationRelativeTo(null);
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_botonInformesIngresosActionPerformed

    private void botonInformesReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInformesReservasActionPerformed
        PresentacionInformeReservas informeClientes = new PresentacionInformeReservas();
        informeClientes.setVisible(true);
        informeClientes.setLocationRelativeTo(null);
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
    }//GEN-LAST:event_botonInformesReservasActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        ValidacionSalir salir = new ValidacionSalir(frame, true);
        salir.setVisible(true);
        salir.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonGestionClientes;
    public javax.swing.JButton botonGestionPagos;
    public javax.swing.JButton botonGestionReservas;
    public javax.swing.JButton botonInformesIngresos;
    public javax.swing.JButton botonInformesReservas;
    public javax.swing.JButton botonMenuPrincipal;
    public javax.swing.JButton botonSalir;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
