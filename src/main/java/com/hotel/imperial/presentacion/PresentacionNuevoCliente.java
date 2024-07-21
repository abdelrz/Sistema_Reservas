package com.hotel.imperial.presentacion;

import com.hotel.imperial.presentacion.popups.DialogoClienteExitoso;
import com.hotel.imperial.util.VentanaUtil;
import com.hotel.imperial.entidades.Cliente;
import com.hotel.imperial.logica.ControladorCliente;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class PresentacionNuevoCliente extends javax.swing.JFrame {

    ControladorCliente control = null;
    Cliente cliente = new Cliente();

    private boolean modoEdicion = false;

    public PresentacionNuevoCliente() {
        initComponents();
        control = new ControladorCliente();
        VentanaUtil.configurarIcono(this, "/images/icono.png");
        VentanaUtil.configurarTamañoVentanaSinBarra(this);

        labelTituloEditar.setVisible(false);

        etiquetasOcultas();
    }

    //Este constructor sirve para editar datos del cliente
    public PresentacionNuevoCliente(int idCliente) {
        initComponents();
        control = new ControladorCliente();
        VentanaUtil.configurarIcono(this, "/images/icono.png");
        VentanaUtil.configurarTamañoVentanaSinBarra(this);
        cargarDatosCliente(idCliente);

        labelTitulo.setVisible(false);
        labelTituloEditar.setVisible(true);
        botonIrAReserva.setVisible(false);

        etiquetasOcultas();
    }

    public void setModoEdicion(boolean modoEdicion) {
        this.modoEdicion = modoEdicion;
    }

    private void etiquetasOcultas() {
        labelCorreoIncorrecto.setVisible(false);
        labelDatoObligatorioApellido.setVisible(false);
        labelDatoObligatorioCorreo.setVisible(false);
        labelDatoObligatorioDni.setVisible(false);
        labelDatoObligatorioFecha.setVisible(false);
        labelDatoObligatorioNombre.setVisible(false);
        labelDatoObligatorioTelefono.setVisible(false);
        labelFechaIncorrecta.setVisible(false);
        labelDniYaExiste.setVisible(false);
        labelTelefonoYaExiste.setVisible(false);
        labelCorreoYaExiste.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoDNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        botonIrAReserva = new javax.swing.JButton();
        campoDia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        campoMes = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        campoAnho = new javax.swing.JTextField();
        labelDatoObligatorioNombre = new javax.swing.JLabel();
        labelDatoObligatorioApellido = new javax.swing.JLabel();
        labelDatoObligatorioTelefono = new javax.swing.JLabel();
        labelDatoObligatorioDni = new javax.swing.JLabel();
        labelDatoObligatorioCorreo = new javax.swing.JLabel();
        labelDatoObligatorioFecha = new javax.swing.JLabel();
        labelFechaIncorrecta = new javax.swing.JLabel();
        labelCorreoIncorrecto = new javax.swing.JLabel();
        labelTituloEditar = new javax.swing.JLabel();
        labelCorreoYaExiste = new javax.swing.JLabel();
        labelTelefonoYaExiste = new javax.swing.JLabel();
        labelDniYaExiste = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(153, 153, 153));
        labelTitulo.setText("Ingresar nuevo Cliente");
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Información personal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 133, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Nombres");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 173, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("DNI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 260, -1, -1));

        campoDNI.setBackground(new java.awt.Color(255, 255, 255));
        campoDNI.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoDNI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 283, 291, 26));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Teléfono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 399, -1, -1));

        campoTelefono.setBackground(new java.awt.Color(255, 255, 255));
        campoTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 422, 291, 26));

        botonGuardar.setBackground(new java.awt.Color(5, 190, 80));
        botonGuardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("Guardar");
        botonGuardar.setBorder(null);
        botonGuardar.setBorderPainted(false);
        botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardar.setFocusPainted(false);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 516, 290, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Fecha de nacimiento (dd/mm/yyyy)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 258, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Correo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 399, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Apellidos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 173, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Información de Contacto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 359, -1, -1));

        botonVolver.setBackground(new java.awt.Color(255, 255, 255));
        botonVolver.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(5, 190, 80));
        botonVolver.setText("Volver");
        botonVolver.setBorder(null);
        botonVolver.setBorderPainted(false);
        botonVolver.setContentAreaFilled(false);
        botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolver.setFocusPainted(false);
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 30, 100, 40));

        campoNombre.setBackground(new java.awt.Color(255, 255, 255));
        campoNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 196, 291, 26));

        campoApellido.setBackground(new java.awt.Color(255, 255, 255));
        campoApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 196, 291, 26));

        campoCorreo.setBackground(new java.awt.Color(255, 255, 255));
        campoCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 422, 291, 26));

        botonIrAReserva.setBackground(new java.awt.Color(255, 255, 255));
        botonIrAReserva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIrAReserva.setForeground(new java.awt.Color(5, 190, 80));
        botonIrAReserva.setText("Ir a nueva Reserva");
        botonIrAReserva.setBorder(null);
        botonIrAReserva.setBorderPainted(false);
        botonIrAReserva.setContentAreaFilled(false);
        botonIrAReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIrAReserva.setFocusPainted(false);
        botonIrAReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIrAReservaActionPerformed(evt);
            }
        });
        jPanel1.add(botonIrAReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 607, -1, -1));

        campoDia.setBackground(new java.awt.Color(255, 255, 255));
        campoDia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoDia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 281, 30, 26));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("/");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 281, -1, -1));

        campoMes.setBackground(new java.awt.Color(255, 255, 255));
        campoMes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoMes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 281, 30, 26));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("/");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 281, -1, -1));

        campoAnho.setBackground(new java.awt.Color(255, 255, 255));
        campoAnho.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoAnho.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoAnho, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 281, 52, 26));

        labelDatoObligatorioNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioNombre.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioNombre.setText("Dato obligatorio");
        jPanel1.add(labelDatoObligatorioNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 228, -1, -1));

        labelDatoObligatorioApellido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioApellido.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioApellido.setText("Dato obligatorio");
        jPanel1.add(labelDatoObligatorioApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 228, -1, -1));

        labelDatoObligatorioTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioTelefono.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioTelefono.setText("Dato obligatorio");
        jPanel1.add(labelDatoObligatorioTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 456, -1, -1));

        labelDatoObligatorioDni.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioDni.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioDni.setText("Dato obligatorio");
        jPanel1.add(labelDatoObligatorioDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 315, -1, -1));

        labelDatoObligatorioCorreo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioCorreo.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioCorreo.setText("Dato obligatorio");
        jPanel1.add(labelDatoObligatorioCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 454, -1, -1));

        labelDatoObligatorioFecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioFecha.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioFecha.setText("Dato obligatorio");
        jPanel1.add(labelDatoObligatorioFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        labelFechaIncorrecta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelFechaIncorrecta.setForeground(new java.awt.Color(255, 0, 0));
        labelFechaIncorrecta.setText("Fecha incorrecta");
        jPanel1.add(labelFechaIncorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        labelCorreoIncorrecto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelCorreoIncorrecto.setForeground(new java.awt.Color(255, 0, 0));
        labelCorreoIncorrecto.setText("Correo incorrecto. Debe tener \"@\" y \".\"");
        jPanel1.add(labelCorreoIncorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 454, -1, -1));

        labelTituloEditar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        labelTituloEditar.setForeground(new java.awt.Color(153, 153, 153));
        labelTituloEditar.setText("Editar Cliente");
        jPanel1.add(labelTituloEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, 30));

        labelCorreoYaExiste.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelCorreoYaExiste.setForeground(new java.awt.Color(255, 0, 0));
        labelCorreoYaExiste.setText("Correo ya existe. Ingresa uno nuevo.");
        jPanel1.add(labelCorreoYaExiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 454, -1, -1));

        labelTelefonoYaExiste.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelTelefonoYaExiste.setForeground(new java.awt.Color(255, 0, 0));
        labelTelefonoYaExiste.setText("Teléfono ya existe. Ingresa uno nuevo.");
        jPanel1.add(labelTelefonoYaExiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 456, -1, -1));

        labelDniYaExiste.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDniYaExiste.setForeground(new java.awt.Color(255, 0, 0));
        labelDniYaExiste.setText("DNI ya existe. Ingresa uno nuevo.");
        jPanel1.add(labelDniYaExiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 315, -1, -1));

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

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        if (validarCampos()) {
            DialogoClienteExitoso clienteExitoso = new DialogoClienteExitoso(this, rootPaneCheckingEnabled);
            clienteExitoso.setVisible(true);
            clienteExitoso.setLocationRelativeTo(null);

            String nombre = campoNombre.getText().trim();
            String apellido = campoApellido.getText().trim();
            String dni = campoDNI.getText().trim();
            String telefono = campoTelefono.getText().trim();
            String correo = campoCorreo.getText().trim();
            String diaStr = campoDia.getText().trim();
            String mesStr = campoMes.getText().trim();
            String anhoStr = campoAnho.getText().trim();

            Date fechaNacimiento = obtenerFecha(anhoStr, mesStr, diaStr);

            if (modoEdicion) {
                control.modificarCliente(cliente, nombre, apellido, dni, telefono, correo, fechaNacimiento);
            } else {
                control.guardarCliente(nombre, apellido, dni, telefono, correo, fechaNacimiento);
            }

            limpiarCampos();
            setModoEdicion(false);
        }

    }//GEN-LAST:event_botonGuardarActionPerformed

    private boolean validarCampos() {
        String nombre = campoNombre.getText().trim();
        String apellido = campoApellido.getText().trim();
        String dni = campoDNI.getText().trim();
        String telefono = campoTelefono.getText().trim();
        String correo = campoCorreo.getText().trim();
        String diaStr = campoDia.getText().trim();
        String mesStr = campoMes.getText().trim();
        String anhoStr = campoAnho.getText().trim();

        boolean datosCorrectos = true;

        if (nombre.isEmpty()) {
            labelDatoObligatorioNombre.setVisible(true);
            datosCorrectos = false;
        } else {
            labelDatoObligatorioNombre.setVisible(false);
        }

        if (apellido.isEmpty()) {
            labelDatoObligatorioApellido.setVisible(true);
            datosCorrectos = false;
        } else {
            labelDatoObligatorioApellido.setVisible(false);
        }

        if (dni.isEmpty()) {
            labelDatoObligatorioDni.setVisible(true);
            datosCorrectos = false;
        } else {
            if (!dni.equals(cliente.getDni()) && existeDNI(dni)) {
                labelDniYaExiste.setVisible(true);
                labelDatoObligatorioDni.setVisible(false);
                datosCorrectos = false;
            } else {
                labelDatoObligatorioDni.setVisible(false);
                labelDniYaExiste.setVisible(false);
            }
        }

        if (telefono.isEmpty()) {
            labelDatoObligatorioTelefono.setVisible(true);
            datosCorrectos = false;
        } else {
            if (!telefono.equals(cliente.getTelefono()) && existeTelefono(telefono)) {
                labelTelefonoYaExiste.setVisible(true);
                labelDatoObligatorioTelefono.setVisible(false);
                datosCorrectos = false;
            } else {
                labelDatoObligatorioTelefono.setVisible(false);
                labelTelefonoYaExiste.setVisible(false);
            }
        }

        if (correo.isEmpty()) {
            labelDatoObligatorioCorreo.setVisible(true);
            labelCorreoIncorrecto.setVisible(false);
            datosCorrectos = false;
        } else {
            if (!correo.contains("@") || !correo.contains(".")) {
                labelCorreoIncorrecto.setVisible(true);
                datosCorrectos = false;
            } else {
                labelCorreoIncorrecto.setVisible(false);
            }
            if (!correo.equals(cliente.getCorreo()) && existeCorreo(correo)) {
                labelCorreoYaExiste.setVisible(true);
                labelDatoObligatorioCorreo.setVisible(false);
                datosCorrectos = false;
            } else {
                labelDatoObligatorioCorreo.setVisible(false);
                labelCorreoYaExiste.setVisible(false);
            }
        }

        if (diaStr.isEmpty() || mesStr.isEmpty() || anhoStr.isEmpty()) {
            labelDatoObligatorioFecha.setVisible(true);
            labelFechaIncorrecta.setVisible(false);
            datosCorrectos = false;
        } else {
            try {
                int dia = Integer.parseInt(diaStr);
                int mes = Integer.parseInt(mesStr);
                int anho = Integer.parseInt(anhoStr);
                LocalDate.of(anho, mes, dia);
                labelFechaIncorrecta.setVisible(false);
                labelDatoObligatorioFecha.setVisible(false);
            } catch (NumberFormatException | DateTimeException e) {
                labelFechaIncorrecta.setVisible(true);
                labelDatoObligatorioFecha.setVisible(false);
                datosCorrectos = false;
            }
        }

        return datosCorrectos;
    }

    private void limpiarCampos() {
        campoNombre.setText("");
        campoApellido.setText("");
        campoDNI.setText("");
        campoTelefono.setText("");
        campoCorreo.setText("");
        campoDia.setText("");
        campoMes.setText("");
        campoAnho.setText("");
    }

    private Date obtenerFecha(String anhoStr, String mesStr, String diaStr) {
        try {
            int dia = Integer.parseInt(diaStr);
            int mes = Integer.parseInt(mesStr);
            int anho = Integer.parseInt(anhoStr);
            return new Date(anho - 1900, mes - 1, dia);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private boolean existeDNI(String dni) {
        ControladorCliente controladorCliente = new ControladorCliente();
        Cliente cliente = controladorCliente.buscarClientePorDni(dni);
        return cliente != null;
    }

    private boolean existeTelefono(String telefono) {
        ControladorCliente controladorCliente = new ControladorCliente();
        Cliente cliente = controladorCliente.buscarClientePorTelefono(telefono);
        return cliente != null;
    }

    private boolean existeCorreo(String correo) {
        ControladorCliente controladorCliente = new ControladorCliente();
        Cliente cliente = controladorCliente.buscarClientePorCorreo(correo);
        return cliente != null;
    }


    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        PresentacionGestionClientes gestionClientes = new PresentacionGestionClientes();
        gestionClientes.setVisible(true);
        gestionClientes.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonIrAReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIrAReservaActionPerformed
        PresentacionNuevaReserva nuevaReserva = new PresentacionNuevaReserva();
        nuevaReserva.setVisible(true);
        nuevaReserva.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonIrAReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonIrAReserva;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoAnho;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JTextField campoDia;
    private javax.swing.JTextField campoMes;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCorreoIncorrecto;
    private javax.swing.JLabel labelCorreoYaExiste;
    private javax.swing.JLabel labelDatoObligatorioApellido;
    private javax.swing.JLabel labelDatoObligatorioCorreo;
    private javax.swing.JLabel labelDatoObligatorioDni;
    private javax.swing.JLabel labelDatoObligatorioFecha;
    private javax.swing.JLabel labelDatoObligatorioNombre;
    private javax.swing.JLabel labelDatoObligatorioTelefono;
    private javax.swing.JLabel labelDniYaExiste;
    private javax.swing.JLabel labelFechaIncorrecta;
    private javax.swing.JLabel labelTelefonoYaExiste;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTituloEditar;
    // End of variables declaration//GEN-END:variables

    private void cargarDatosCliente(int idCliente) {
        cliente = control.listarCliente(idCliente);

        campoNombre.setText(cliente.getNombre());
        campoApellido.setText(cliente.getApellido());
        campoDNI.setText(cliente.getDni());
        campoTelefono.setText(cliente.getTelefono());
        campoCorreo.setText(cliente.getCorreo());

        Date fechaCliente = cliente.getFecha_nacimiento();

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fechaCliente);

        int anho = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH) + 1; // Se suma 1 porque en Calendar enero es 0
        int dia = calendario.get(Calendar.DAY_OF_MONTH);

        campoAnho.setText(String.valueOf(anho));
        campoMes.setText(String.valueOf(mes));
        campoDia.setText(String.valueOf(dia));
    }
}
