package com.hotel.imperial.presentacion;

import com.hotel.imperial.logica.ControladorUsuario;
import com.hotel.imperial.presentacion.popups.DialogoBienvenido;
import com.hotel.imperial.util.VentanaUtil;

public class PresentacionIniciarSesion extends javax.swing.JFrame {

    ControladorUsuario controladorUsuario = new ControladorUsuario();

    public PresentacionIniciarSesion() {
        initComponents();
        setResizable(false);
        VentanaUtil.configurarIcono(this, "/images/icono.png");

        labelUsuarioIncorrecto.setVisible(false);
        labelContrasenhaIncorrecta.setVisible(false);
        labelDatoObligatorioUsuario.setVisible(false);
        labelDatoObligatorioContrasenha.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonIniciarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        labelDatoObligatorioUsuario = new javax.swing.JLabel();
        labelDatoObligatorioContrasenha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelUsuarioIncorrecto = new javax.swing.JLabel();
        labelContrasenhaIncorrecta = new javax.swing.JLabel();
        campoContrasenha = new javax.swing.JPasswordField();
        checkboxVerContrasenha = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Imperial Inn");

        botonIniciarSesion.setBackground(new java.awt.Color(5, 190, 80));
        botonIniciarSesion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        botonIniciarSesion.setText("Iniciar Sesión");
        botonIniciarSesion.setBorder(null);
        botonIniciarSesion.setBorderPainted(false);
        botonIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIniciarSesion.setFocusable(false);
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Usuario");

        campoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        campoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Contraseña");

        labelDatoObligatorioUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioUsuario.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioUsuario.setText("Dato obligatorio");

        labelDatoObligatorioContrasenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioContrasenha.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioContrasenha.setText("Dato obligatorio");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-inicio-sesion.png"))); // NOI18N

        labelUsuarioIncorrecto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelUsuarioIncorrecto.setForeground(new java.awt.Color(255, 0, 0));
        labelUsuarioIncorrecto.setText("Usuario incorrecto");

        labelContrasenhaIncorrecta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelContrasenhaIncorrecta.setForeground(new java.awt.Color(255, 0, 0));
        labelContrasenhaIncorrecta.setText("Contraseña incorrecta");

        campoContrasenha.setBackground(new java.awt.Color(255, 255, 255));
        campoContrasenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoContrasenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        checkboxVerContrasenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        checkboxVerContrasenha.setForeground(new java.awt.Color(102, 102, 102));
        checkboxVerContrasenha.setText("Ver contraseña");
        checkboxVerContrasenha.setBorder(null);
        checkboxVerContrasenha.setContentAreaFilled(false);
        checkboxVerContrasenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkboxVerContrasenha.setFocusPainted(false);
        checkboxVerContrasenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxVerContrasenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsuarioIncorrecto)
                            .addComponent(labelDatoObligatorioUsuario)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(botonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDatoObligatorioContrasenha)
                                    .addComponent(labelContrasenhaIncorrecta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkboxVerContrasenha))
                            .addComponent(campoContrasenha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsuarioIncorrecto)
                    .addComponent(labelDatoObligatorioUsuario))
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(campoContrasenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContrasenhaIncorrecta)
                    .addComponent(checkboxVerContrasenha)
                    .addComponent(labelDatoObligatorioContrasenha))
                .addGap(73, 73, 73)
                .addComponent(botonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        labelContrasenhaIncorrecta.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        String usuario = campoUsuario.getText();
        String password = new String(campoContrasenha.getPassword());

        boolean datosCorrectos = true;

        if (usuario.isEmpty()) {
            labelDatoObligatorioUsuario.setVisible(true);
            labelUsuarioIncorrecto.setVisible(false);
            datosCorrectos = false;
        } else if (!controladorUsuario.verificarExistenciaUsuario(usuario)) {
            labelUsuarioIncorrecto.setVisible(true);
            labelDatoObligatorioUsuario.setVisible(false);
            datosCorrectos = false;
        } else {
            labelDatoObligatorioUsuario.setVisible(false);
            labelUsuarioIncorrecto.setVisible(false);
        }

        if (password.isEmpty()) {
            labelDatoObligatorioContrasenha.setVisible(true);
            labelContrasenhaIncorrecta.setVisible(false);
            datosCorrectos = false;
        } else if (!controladorUsuario.verificarContrasenha(password)) {
            labelContrasenhaIncorrecta.setVisible(true);
            labelDatoObligatorioContrasenha.setVisible(false);
            datosCorrectos = false;
        } else {
            labelDatoObligatorioContrasenha.setVisible(false);
            labelContrasenhaIncorrecta.setVisible(false);
        }

        if (datosCorrectos) {
            DialogoBienvenido bienvenido = new DialogoBienvenido(this, datosCorrectos);
            bienvenido.setVisible(true);
            bienvenido.setLocationRelativeTo(null);
            dispose();

            PresentacionMenuPrincipal menuPrincipal = new PresentacionMenuPrincipal();
            menuPrincipal.setVisible(true);
            menuPrincipal.setLocationRelativeTo(null);
            dispose();
        }

    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void checkboxVerContrasenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxVerContrasenhaActionPerformed

        if (checkboxVerContrasenha.isSelected()) {
            campoContrasenha.setEchoChar((char) 0); // Mostrar contraseña
        } else {
            campoContrasenha.setEchoChar('●'); // Ocultar contraseña
        }

    }//GEN-LAST:event_checkboxVerContrasenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JPasswordField campoContrasenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JCheckBox checkboxVerContrasenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelContrasenhaIncorrecta;
    private javax.swing.JLabel labelDatoObligatorioContrasenha;
    private javax.swing.JLabel labelDatoObligatorioUsuario;
    private javax.swing.JLabel labelUsuarioIncorrecto;
    // End of variables declaration//GEN-END:variables
}
