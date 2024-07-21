package com.hotel.imperial.presentacion;

import com.hotel.imperial.logica.ControladorMenuPrincipal;
import com.hotel.imperial.logica.graficos.ControladorGraficos;
import com.hotel.imperial.util.VentanaUtil;

public class PresentacionMenuPrincipal extends javax.swing.JFrame {

    ControladorMenuPrincipal controladorMenuPrincipal = new ControladorMenuPrincipal();

    public PresentacionMenuPrincipal() {
        initComponents();
        VentanaUtil.inicializarBarraDeNavegacion(this);
        VentanaUtil.configurarIcono(this, "/images/icono.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelTotalClientes = new javax.swing.JLabel();
        botonGraficoIngresos = new javax.swing.JButton();
        botonGraficoReservas = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelTotalReservas = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        labelTotalIngresos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Bienvenido");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Gráficos de Informes");

        jPanel3.setBackground(new java.awt.Color(13, 32, 24));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total de clientes registrados");

        labelTotalClientes.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelTotalClientes.setForeground(new java.awt.Color(255, 255, 255));
        labelTotalClientes.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotalClientes)
                    .addComponent(jLabel4))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotalClientes)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        botonGraficoIngresos.setBackground(new java.awt.Color(5, 190, 80));
        botonGraficoIngresos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonGraficoIngresos.setForeground(new java.awt.Color(255, 255, 255));
        botonGraficoIngresos.setText("Ver gráfico de ingresos");
        botonGraficoIngresos.setBorder(null);
        botonGraficoIngresos.setBorderPainted(false);
        botonGraficoIngresos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGraficoIngresos.setFocusPainted(false);
        botonGraficoIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGraficoIngresosActionPerformed(evt);
            }
        });

        botonGraficoReservas.setBackground(new java.awt.Color(5, 190, 80));
        botonGraficoReservas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonGraficoReservas.setForeground(new java.awt.Color(255, 255, 255));
        botonGraficoReservas.setText("Ver gráfico de reservas");
        botonGraficoReservas.setBorder(null);
        botonGraficoReservas.setBorderPainted(false);
        botonGraficoReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGraficoReservas.setFocusPainted(false);
        botonGraficoReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGraficoReservasActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(13, 32, 24));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total de reservas");

        labelTotalReservas.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelTotalReservas.setForeground(new java.awt.Color(255, 255, 255));
        labelTotalReservas.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotalReservas)
                    .addComponent(jLabel6))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotalReservas)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(13, 32, 24));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total de ingresos");

        labelTotalIngresos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelTotalIngresos.setForeground(new java.awt.Color(255, 255, 255));
        labelTotalIngresos.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotalIngresos)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotalIngresos)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(botonGraficoIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(botonGraficoReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGraficoIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGraficoReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(176, 176, 176))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int totalClientes = controladorMenuPrincipal.mostrarTotalClientes();
        double totalIngresos = controladorMenuPrincipal.mostrarTotalIngresos();
        int totalReservas = controladorMenuPrincipal.mostrarTotalReservas();

        labelTotalClientes.setText(String.valueOf(totalClientes));
        labelTotalIngresos.setText("S/ " + String.valueOf(totalIngresos));
        labelTotalReservas.setText(String.valueOf(totalReservas));
    }//GEN-LAST:event_formWindowOpened

    private void botonGraficoIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGraficoIngresosActionPerformed
        ControladorGraficos controladorGraficos = new ControladorGraficos();
        controladorGraficos.mostrarGraficoInformeIngresos("Gráfico lineal - Ingresos");
    }//GEN-LAST:event_botonGraficoIngresosActionPerformed

    private void botonGraficoReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGraficoReservasActionPerformed
        ControladorGraficos controladorGraficos = new ControladorGraficos();
        controladorGraficos.mostrarGraficoInformeClientes("Gráfico lineal - Reservas");
    }//GEN-LAST:event_botonGraficoReservasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGraficoIngresos;
    private javax.swing.JButton botonGraficoReservas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelTotalClientes;
    private javax.swing.JLabel labelTotalIngresos;
    private javax.swing.JLabel labelTotalReservas;
    // End of variables declaration//GEN-END:variables
}
