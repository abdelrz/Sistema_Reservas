package com.hotel.imperial.presentacion;

import com.hotel.imperial.entidades.Cliente;
import com.hotel.imperial.presentacion.popups.DialogoPagoExitoso;
import com.hotel.imperial.util.VentanaUtil;
import com.hotel.imperial.entidades.Metodo_Pago;
import com.hotel.imperial.entidades.Pago;
import com.hotel.imperial.entidades.Reparacion;
import com.hotel.imperial.entidades.Reserva;
import com.hotel.imperial.logica.ControladorCliente;
import com.hotel.imperial.logica.ControladorPago;
import com.hotel.imperial.logica.ControladorMetodoPago;
import com.hotel.imperial.logica.ControladorReparacion;
import com.hotel.imperial.logica.ControladorReserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class PresentacionRegistrarPago extends javax.swing.JFrame {

    ControladorPago control = null;

    ControladorMetodoPago controlMetodo = new ControladorMetodoPago();
    ControladorReparacion controladorReparacion = new ControladorReparacion();
    Pago objPago = new Pago();

    private boolean modoEdicion = false;

    public PresentacionRegistrarPago() {

        initComponents();
        control = new ControladorPago();
        VentanaUtil.configurarIcono(this, "/images/icono.png");
        VentanaUtil.configurarTamañoVentanaSinBarra(this);
        cargarMetodoPago();

        labelTituloEditar.setVisible(false);
        botonGenerarVoucher.setVisible(false);
        botonConvertirMoneda.setVisible(false);

        etiquetasOcultas();
    }

    public PresentacionRegistrarPago(int idPago) {

        initComponents();
        control = new ControladorPago();
        VentanaUtil.configurarIcono(this, "/images/icono.png");
        VentanaUtil.configurarTamañoVentanaSinBarra(this);
        cargarDatosPago(idPago);
        campoDNI.setEnabled(false);

        labelTitulo.setVisible(false);
        labelTituloEditar.setVisible(true);
        botonGenerarVoucher.setVisible(false);
        botonConvertirMoneda.setVisible(false);
        
        etiquetasOcultas();

    }

    public void setModoEdicion(boolean modoEdicion) {
        this.modoEdicion = modoEdicion;
    }

    private void etiquetasOcultas() {
        labelCostoExtraIncorrecto.setVisible(false);
        labelDatoObligatorioDni.setVisible(false);
        labelDatoObligatorioFechaPago.setVisible(false);
        labelDatoObligatorioPago.setVisible(false);
        labelDniNoExiste.setVisible(false);
        labelFechaPagoIncorrecta.setVisible(false);
        labelPagoIncorrecto.setVisible(false);

        labelReservaNoExiste.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoDNI = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        listaDesplegableMetodoPago = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        campoPago = new javax.swing.JTextField();
        botonRegistrarPago = new javax.swing.JButton();
        botonConvertirMoneda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoDescripcion = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        campoCosto = new javax.swing.JTextField();
        labelDatoObligatorioPago = new javax.swing.JLabel();
        labelDatoObligatorioDni = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        campoAnho = new javax.swing.JTextField();
        labelDatoObligatorioFechaPago = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoDia = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        campoMes = new javax.swing.JTextField();
        labelDniNoExiste = new javax.swing.JLabel();
        labelFechaPagoIncorrecta = new javax.swing.JLabel();
        labelPagoIncorrecto = new javax.swing.JLabel();
        labelReservaNoExiste = new javax.swing.JLabel();
        labelTituloEditar = new javax.swing.JLabel();
        botonGenerarVoucher = new javax.swing.JButton();
        labelCostoExtraIncorrecto = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setBackground(new java.awt.Color(102, 102, 102));
        labelTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(153, 153, 153));
        labelTitulo.setText("Registrar Pago");
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("DNI");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        campoDNI.setBackground(new java.awt.Color(255, 255, 255));
        campoDNI.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoDNI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        campoDNI.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        jPanel1.add(campoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 290, 29));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Método de pago");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, -1, -1));

        listaDesplegableMetodoPago.setBackground(new java.awt.Color(255, 255, 255));
        listaDesplegableMetodoPago.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listaDesplegableMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaDesplegableMetodoPago.setBorder(null);
        listaDesplegableMetodoPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaDesplegableMetodoPago.setFocusable(false);
        jPanel1.add(listaDesplegableMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 290, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Pago de reserva");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        campoPago.setBackground(new java.awt.Color(255, 255, 255));
        campoPago.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoPago.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 290, 29));

        botonRegistrarPago.setBackground(new java.awt.Color(5, 190, 80));
        botonRegistrarPago.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonRegistrarPago.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrarPago.setText("Registrar Pago");
        botonRegistrarPago.setBorder(null);
        botonRegistrarPago.setBorderPainted(false);
        botonRegistrarPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistrarPago.setFocusPainted(false);
        botonRegistrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarPagoActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegistrarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 290, 40));

        botonConvertirMoneda.setBackground(new java.awt.Color(255, 255, 255));
        botonConvertirMoneda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonConvertirMoneda.setForeground(new java.awt.Color(0, 102, 255));
        botonConvertirMoneda.setText("Convertir a sol");
        botonConvertirMoneda.setBorder(null);
        botonConvertirMoneda.setBorderPainted(false);
        botonConvertirMoneda.setContentAreaFilled(false);
        botonConvertirMoneda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonConvertirMoneda.setFocusPainted(false);
        botonConvertirMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConvertirMonedaActionPerformed(evt);
            }
        });
        jPanel1.add(botonConvertirMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 110, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Costos extra (opcional)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Pago de reserva");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        textoDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        textoDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoDescripcion.setTabSize(0);
        textoDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), "Descripción de costo extra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(153, 153, 153))); // NOI18N
        textoDescripcion.setMargin(new java.awt.Insets(6, 6, 6, 6));
        jScrollPane1.setViewportView(textoDescripcion);
        textoDescripcion.getAccessibleContext().setAccessibleName("");

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 290, 90));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Monto de costo extra");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        campoCosto.setBackground(new java.awt.Color(255, 255, 255));
        campoCosto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoCosto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 290, 29));

        labelDatoObligatorioPago.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioPago.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioPago.setText("Dato obligatorio");
        jPanel1.add(labelDatoObligatorioPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, 20));

        labelDatoObligatorioDni.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioDni.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioDni.setText("Dato obligatorio");
        jPanel1.add(labelDatoObligatorioDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 20));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("/");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        campoAnho.setBackground(new java.awt.Color(255, 255, 255));
        campoAnho.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoAnho.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoAnho, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 52, 26));

        labelDatoObligatorioFechaPago.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioFechaPago.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioFechaPago.setText("Dato obligatorio");
        jPanel1.add(labelDatoObligatorioFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, 20));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Fecha de pago (dd/mm/yyyy)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, 20));

        campoDia.setBackground(new java.awt.Color(255, 255, 255));
        campoDia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoDia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 30, 26));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("/");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        campoMes.setBackground(new java.awt.Color(255, 255, 255));
        campoMes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoMes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 30, 26));

        labelDniNoExiste.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDniNoExiste.setForeground(new java.awt.Color(255, 0, 0));
        labelDniNoExiste.setText("DNI no existe. Primero guarda los datos del cliente.");
        jPanel1.add(labelDniNoExiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 20));

        labelFechaPagoIncorrecta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelFechaPagoIncorrecta.setForeground(new java.awt.Color(255, 0, 0));
        labelFechaPagoIncorrecta.setText("Fecha incorrecta");
        jPanel1.add(labelFechaPagoIncorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, 20));

        labelPagoIncorrecto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPagoIncorrecto.setForeground(new java.awt.Color(255, 0, 0));
        labelPagoIncorrecto.setText("Debes ingresar un número");
        jPanel1.add(labelPagoIncorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, 20));

        labelReservaNoExiste.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelReservaNoExiste.setForeground(new java.awt.Color(255, 0, 0));
        labelReservaNoExiste.setText("Reserva no existe. Primero guarda los datos de la reserva.");
        jPanel1.add(labelReservaNoExiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, -1, -1));

        labelTituloEditar.setBackground(new java.awt.Color(102, 102, 102));
        labelTituloEditar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        labelTituloEditar.setForeground(new java.awt.Color(153, 153, 153));
        labelTituloEditar.setText("Editar Pago");
        jPanel1.add(labelTituloEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, 40));

        botonGenerarVoucher.setBackground(new java.awt.Color(16, 124, 65));
        botonGenerarVoucher.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonGenerarVoucher.setForeground(new java.awt.Color(255, 255, 255));
        botonGenerarVoucher.setText("Generar voucher");
        botonGenerarVoucher.setBorder(null);
        botonGenerarVoucher.setBorderPainted(false);
        botonGenerarVoucher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGenerarVoucher.setFocusPainted(false);
        botonGenerarVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarVoucherActionPerformed(evt);
            }
        });
        jPanel1.add(botonGenerarVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, 145, 40));

        labelCostoExtraIncorrecto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelCostoExtraIncorrecto.setForeground(new java.awt.Color(255, 0, 0));
        labelCostoExtraIncorrecto.setText("Debes ingresar un número");
        jPanel1.add(labelCostoExtraIncorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, -1, 20));

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
        jPanel1.add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 28, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarPagoActionPerformed
        if (validarCampos()) {
            DialogoPagoExitoso dialogoPagoExitoso = new DialogoPagoExitoso(this, rootPaneCheckingEnabled);
            dialogoPagoExitoso.setVisible(true);
            dialogoPagoExitoso.setLocationRelativeTo(null);

            String dni = campoDNI.getText().trim();
            String metodoPago = (String) listaDesplegableMetodoPago.getSelectedItem();
            Date fechaPago = obtenerFecha(campoAnho.getText(), campoMes.getText(), campoDia.getText());
            double pago = Double.parseDouble(campoPago.getText().trim());
            String descripcionReparacion = textoDescripcion.getText().trim();
            double costoReparacion = obtenerCostoReparacion(campoCosto.getText().trim());

            if (modoEdicion) {
                control.modificarPago(objPago, dni, metodoPago, fechaPago, pago, descripcionReparacion, costoReparacion);
            } else {
                control.guardarPago(dni, metodoPago, fechaPago, pago, descripcionReparacion, costoReparacion);
            }

            limpiarCampos();
            setModoEdicion(false);
        }

    }//GEN-LAST:event_botonRegistrarPagoActionPerformed

    private boolean existeDNI(String dni) {
        ControladorCliente controladorCliente = new ControladorCliente();
        Cliente cliente = controladorCliente.buscarClientePorDni(dni);
        return cliente != null;
    }

    private boolean existeReservaAsociadaACliente(String dni) {
        ControladorReserva controladorReserva = new ControladorReserva();
        Reserva reserva = controladorReserva.obtenerReservaAsociadaCliente(dni);
        return reserva != null;
    }

    private boolean validarCampos() {
        String dni = campoDNI.getText().trim();
        String diaPagoStr = campoDia.getText().trim();
        String mesPagoStr = campoMes.getText().trim();
        String anhoPagoStr = campoAnho.getText().trim();
        String pagoStr = campoPago.getText().trim();
        String costoReparacionStr = campoCosto.getText().trim();

        boolean datosCorrectos = true;

        if (dni.isEmpty()) {
            labelDatoObligatorioDni.setVisible(true);
            labelDniNoExiste.setVisible(false);
            datosCorrectos = false;
        } else {
            if (!existeDNI(dni)) {
                labelDniNoExiste.setVisible(true);
                labelDatoObligatorioDni.setVisible(false);
                datosCorrectos = false;
            } else {
                labelDatoObligatorioDni.setVisible(false);
                labelDniNoExiste.setVisible(false);

                if (!existeReservaAsociadaACliente(dni)) {
                    labelReservaNoExiste.setVisible(true);
                    labelDatoObligatorioDni.setVisible(false);
                    datosCorrectos = false;
                } else {
                    labelDatoObligatorioDni.setVisible(false);
                    labelReservaNoExiste.setVisible(false);
                }
            }
        }

        if (diaPagoStr.isEmpty() || mesPagoStr.isEmpty() || anhoPagoStr.isEmpty()) {
            labelDatoObligatorioFechaPago.setVisible(true);
            labelFechaPagoIncorrecta.setVisible(false);
            datosCorrectos = false;
        } else {
            labelDatoObligatorioFechaPago.setVisible(false);
            try {
                int dia = Integer.parseInt(diaPagoStr);
                int mes = Integer.parseInt(mesPagoStr);
                int anho = Integer.parseInt(anhoPagoStr);

                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                formato.setLenient(false);
                Date fechaPago = formato.parse(anho + "-" + mes + "-" + dia);

                labelFechaPagoIncorrecta.setVisible(false);
            } catch (NumberFormatException | ParseException e) {
                labelFechaPagoIncorrecta.setVisible(true);
                labelDatoObligatorioFechaPago.setVisible(false);
                datosCorrectos = false;
            }
        }

        if (pagoStr.isEmpty()) {
            labelDatoObligatorioPago.setVisible(true);
            labelPagoIncorrecto.setVisible(false);
            datosCorrectos = false;
        } else {
            labelDatoObligatorioPago.setVisible(false);
            try {
                double pago = Double.parseDouble(pagoStr);
                if (pago <= 0) {
                    labelPagoIncorrecto.setVisible(true);
                    datosCorrectos = false;
                } else {
                    labelPagoIncorrecto.setVisible(false);
                }
            } catch (NumberFormatException e) {
                labelPagoIncorrecto.setVisible(true);
                labelDatoObligatorioPago.setVisible(false);
                datosCorrectos = false;
            }
        }

        if (!costoReparacionStr.isEmpty()) {
            try {
                double costoReparacion = Double.parseDouble(costoReparacionStr);
                if (costoReparacion < 0) {
                    labelCostoExtraIncorrecto.setVisible(true);
                    datosCorrectos = false;
                } else {
                    labelCostoExtraIncorrecto.setVisible(false);
                }
            } catch (NumberFormatException e) {
                labelCostoExtraIncorrecto.setVisible(true);
                datosCorrectos = false;
            }
        } else {
            labelCostoExtraIncorrecto.setVisible(false);
        }

        return datosCorrectos;
    }

    private double obtenerCostoReparacion(String costoReparacionStr) {
        if (!costoReparacionStr.isEmpty()) {
            try {
                double costoReparacion = Double.parseDouble(costoReparacionStr);
                if (costoReparacion < 0) {
                    labelCostoExtraIncorrecto.setVisible(true);
                    return -1;
                } else {
                    labelCostoExtraIncorrecto.setVisible(false);
                    return costoReparacion;
                }
            } catch (NumberFormatException e) {
                labelCostoExtraIncorrecto.setVisible(true);
                return -1;
            }
        } else {
            labelCostoExtraIncorrecto.setVisible(false);
            return 0;
        }
    }

    private void limpiarCampos() {
        campoDNI.setText("");
        campoDia.setText("");
        campoMes.setText("");
        campoAnho.setText("");
        campoPago.setText("");
        textoDescripcion.setText("");
        campoCosto.setText("");
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

    private void botonConvertirMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConvertirMonedaActionPerformed
        //TODO
    }//GEN-LAST:event_botonConvertirMonedaActionPerformed

    private void botonGenerarVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarVoucherActionPerformed
        //TODO
    }//GEN-LAST:event_botonGenerarVoucherActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        PresentacionGestionPagos gestionPagos = new PresentacionGestionPagos();
        gestionPagos.setVisible(true);
        gestionPagos.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConvertirMoneda;
    private javax.swing.JButton botonGenerarVoucher;
    private javax.swing.JButton botonRegistrarPago;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoAnho;
    private javax.swing.JTextField campoCosto;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JTextField campoDia;
    private javax.swing.JTextField campoMes;
    private javax.swing.JTextField campoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCostoExtraIncorrecto;
    private javax.swing.JLabel labelDatoObligatorioDni;
    private javax.swing.JLabel labelDatoObligatorioFechaPago;
    private javax.swing.JLabel labelDatoObligatorioPago;
    private javax.swing.JLabel labelDniNoExiste;
    private javax.swing.JLabel labelFechaPagoIncorrecta;
    private javax.swing.JLabel labelPagoIncorrecto;
    private javax.swing.JLabel labelReservaNoExiste;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTituloEditar;
    private javax.swing.JComboBox<String> listaDesplegableMetodoPago;
    private javax.swing.JTextArea textoDescripcion;
    // End of variables declaration//GEN-END:variables

    private void cargarMetodoPago() {

        List<Metodo_Pago> listaMetodosPago = controlMetodo.listarMetodoPago();

        listaDesplegableMetodoPago.removeAllItems();

        for (Metodo_Pago metodoPago : listaMetodosPago) {
            listaDesplegableMetodoPago.addItem(metodoPago.getMetodo());
        }
    }

    private void cargarDatosPago(int idPago) {
        objPago = control.listarPago(idPago);

        campoDNI.setText(objPago.getReserva().getCliente().getDni());

        cargarMetodoPago();

        String metodoPago = objPago.getMetodo_pago().getMetodo();

        for (int i = 0; i < listaDesplegableMetodoPago.getItemCount(); i++) {
            if (listaDesplegableMetodoPago.getItemAt(i).equals(metodoPago)) {
                listaDesplegableMetodoPago.setSelectedItem(metodoPago);
                break;
            }
        }

        Date fechaPago = objPago.getFecha_pago();

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fechaPago);

        int anho = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH) + 1; // Se suma 1 porque en Calendar enero es 0
        int dia = calendario.get(Calendar.DAY_OF_MONTH);

        campoAnho.setText(String.valueOf(anho));
        campoMes.setText(String.valueOf(mes));
        campoDia.setText(String.valueOf(dia));

        campoPago.setText(String.valueOf(objPago.getPago()));

        Reparacion reparacion = controladorReparacion.obtenerReparacionPorPago(objPago);

        if (reparacion != null) {
            textoDescripcion.setText(reparacion.getDescripcion());
            campoCosto.setText(String.valueOf(reparacion.getCosto()));
        } else {
            textoDescripcion.setText("");
            campoCosto.setText("");
        }
    }

}
