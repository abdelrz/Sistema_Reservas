
package com.hotel.imperial.presentacion.conversor;

public class PresentacionConversorMonedas extends javax.swing.JFrame {

    public PresentacionConversorMonedas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        listaDesplegableTipoMoneda = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        campoMonto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoResultado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonCopiarPortapapeles = new javax.swing.JButton();
        botonRegistrarPago = new javax.swing.JButton();
        labelMontoIncorrecto1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Selecciona el tipo de moneda a convertir");

        listaDesplegableTipoMoneda.setBackground(new java.awt.Color(255, 255, 255));
        listaDesplegableTipoMoneda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listaDesplegableTipoMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaDesplegableTipoMoneda.setBorder(null);
        listaDesplegableTipoMoneda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaDesplegableTipoMoneda.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Ingresa el monto que desea convertir");

        campoMonto.setBackground(new java.awt.Color(255, 255, 255));
        campoMonto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoMonto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        campoMonto.setDisabledTextColor(new java.awt.Color(153, 153, 153));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Resultado");

        campoResultado.setBackground(new java.awt.Color(255, 255, 255));
        campoResultado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoResultado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        campoResultado.setDisabledTextColor(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Convertir moneda a Sol");

        botonCopiarPortapapeles.setBackground(new java.awt.Color(255, 255, 255));
        botonCopiarPortapapeles.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonCopiarPortapapeles.setForeground(new java.awt.Color(0, 102, 255));
        botonCopiarPortapapeles.setText("Copiar al portapapeles");
        botonCopiarPortapapeles.setBorder(null);
        botonCopiarPortapapeles.setBorderPainted(false);
        botonCopiarPortapapeles.setContentAreaFilled(false);
        botonCopiarPortapapeles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCopiarPortapapeles.setFocusPainted(false);
        botonCopiarPortapapeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCopiarPortapapelesActionPerformed(evt);
            }
        });

        botonRegistrarPago.setBackground(new java.awt.Color(5, 190, 80));
        botonRegistrarPago.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonRegistrarPago.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrarPago.setText("Convertir a soles");
        botonRegistrarPago.setBorder(null);
        botonRegistrarPago.setBorderPainted(false);
        botonRegistrarPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistrarPago.setFocusPainted(false);
        botonRegistrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarPagoActionPerformed(evt);
            }
        });

        labelMontoIncorrecto1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMontoIncorrecto1.setForeground(new java.awt.Color(255, 0, 0));
        labelMontoIncorrecto1.setText("Debes ingresar un número");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRegistrarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoResultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(botonCopiarPortapapeles))
                    .addComponent(labelMontoIncorrecto1)
                    .addComponent(jLabel8)
                    .addComponent(campoMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(listaDesplegableTipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaDesplegableTipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addComponent(campoMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMontoIncorrecto1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(botonRegistrarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCopiarPortapapeles)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCopiarPortapapelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCopiarPortapapelesActionPerformed
        //TODO
    }//GEN-LAST:event_botonCopiarPortapapelesActionPerformed

    private void botonRegistrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarPagoActionPerformed

    }//GEN-LAST:event_botonRegistrarPagoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCopiarPortapapeles;
    private javax.swing.JButton botonRegistrarPago;
    private javax.swing.JTextField campoMonto;
    private javax.swing.JTextField campoResultado;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelMontoIncorrecto1;
    private javax.swing.JComboBox<String> listaDesplegableTipoMoneda;
    // End of variables declaration//GEN-END:variables
}
