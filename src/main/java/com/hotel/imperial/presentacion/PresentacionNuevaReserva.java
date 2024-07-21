package com.hotel.imperial.presentacion;

import com.hotel.imperial.entidades.Cliente;
import com.hotel.imperial.presentacion.popups.DialogoReservaExitosa;
import com.hotel.imperial.util.VentanaUtil;
import com.hotel.imperial.entidades.Habitacion;
import com.hotel.imperial.entidades.Reserva;
import com.hotel.imperial.entidades.Reserva_Habitacion;
import com.hotel.imperial.logica.ControladorCliente;
import com.hotel.imperial.logica.ControladorReserva;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.JTextField;

public class PresentacionNuevaReserva extends javax.swing.JFrame {

    ControladorReserva control = null;
    Reserva reserva = new Reserva();

    private boolean modoEdicion = false;

    public PresentacionNuevaReserva() {
        initComponents();
        control = new ControladorReserva();
        VentanaUtil.configurarIcono(this, "/images/icono.png");
        VentanaUtil.configurarTamañoVentanaSinBarra(this);

        labelTituloEditar.setVisible(false);

        etiquetasOcultas();
    }

    //Este constructor sirve para editar datos de la reserva
    public PresentacionNuevaReserva(int idReserva) {
        initComponents();
        control = new ControladorReserva();
        VentanaUtil.configurarIcono(this, "/images/icono.png");
        VentanaUtil.configurarTamañoVentanaSinBarra(this);
        cargarDatosReserva(idReserva);
        campoDNI.setEnabled(false);

        labelTitulo.setVisible(false);
        labelTituloEditar.setVisible(true);
        botonIrAPago.setVisible(false);

        etiquetasOcultas();
    }

    public void setModoEdicion(boolean modoEdicion) {
        this.modoEdicion = modoEdicion;
    }

    private void etiquetasOcultas() {
        labelDNInoExiste.setVisible(false);
        labelDatoObligatorioDni.setVisible(false);
        labelDatoObligatorioFechaLlegada.setVisible(false);
        labelDatoObligatorioFechaSalida.setVisible(false);
        labelDatoObligatorioHospedados.setVisible(false);
        labelFechaLlegadaIncorrecta.setVisible(false);
        labelFechaSalidaIncorrecta.setVisible(false);
        labelHabitacionesVacias.setVisible(false);
        labelHospedadosIncorrecto.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoPersonasHospedadas = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        campoDNI = new javax.swing.JTextField();
        campoDiaLlegada = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        campoMesLlegada = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        campoAnhoLlegada = new javax.swing.JTextField();
        botonIrAPago = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        campoHoraLlegada = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoMinutoLlegada = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoDiaSalida = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        campoMesSalida = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        campoAnhoSalida = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campoHoraSalida = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campoMinutoSalida = new javax.swing.JTextField();
        labelDatoObligatorioDni = new javax.swing.JLabel();
        labelDatoObligatorioHospedados = new javax.swing.JLabel();
        labelDatoObligatorioFechaLlegada = new javax.swing.JLabel();
        labelDatoObligatorioFechaSalida = new javax.swing.JLabel();
        checkboxHabitacion2 = new javax.swing.JCheckBox();
        checkboxHabitacion1 = new javax.swing.JCheckBox();
        checkboxHabitacion3 = new javax.swing.JCheckBox();
        labelDNInoExiste = new javax.swing.JLabel();
        labelHospedadosIncorrecto = new javax.swing.JLabel();
        labelFechaLlegadaIncorrecta = new javax.swing.JLabel();
        labelHabitacionesVacias = new javax.swing.JLabel();
        labelFechaSalidaIncorrecta = new javax.swing.JLabel();
        labelTituloEditar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(153, 153, 153));
        labelTitulo.setText("Ingresar nueva Reserva");
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 16, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Datos de reserva");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 111, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("DNI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 159, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("N° de personas hospedadas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 253, -1, -1));

        campoPersonasHospedadas.setBackground(new java.awt.Color(255, 255, 255));
        campoPersonasHospedadas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoPersonasHospedadas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoPersonasHospedadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 273, 291, 26));

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
        jPanel1.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 290, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Selecciona las habitaciones a reservar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 391, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Fecha de llegada (dd/mm/yyyy) formato 24 H");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 159, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Información de habitaciones");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 351, -1, -1));

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
        jPanel1.add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 24, 100, 40));

        campoDNI.setBackground(new java.awt.Color(255, 255, 255));
        campoDNI.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoDNI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        campoDNI.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        jPanel1.add(campoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 182, 291, 26));

        campoDiaLlegada.setBackground(new java.awt.Color(255, 255, 255));
        campoDiaLlegada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoDiaLlegada.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoDiaLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 182, 30, 26));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("/");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 182, -1, -1));

        campoMesLlegada.setBackground(new java.awt.Color(255, 255, 255));
        campoMesLlegada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoMesLlegada.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoMesLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 182, 30, 26));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("/");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 182, -1, -1));

        campoAnhoLlegada.setBackground(new java.awt.Color(255, 255, 255));
        campoAnhoLlegada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoAnhoLlegada.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoAnhoLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 182, 52, 26));

        botonIrAPago.setBackground(new java.awt.Color(255, 255, 255));
        botonIrAPago.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIrAPago.setForeground(new java.awt.Color(5, 190, 80));
        botonIrAPago.setText("Ir a registrar Pago");
        botonIrAPago.setBorder(null);
        botonIrAPago.setBorderPainted(false);
        botonIrAPago.setContentAreaFilled(false);
        botonIrAPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIrAPago.setFocusPainted(false);
        botonIrAPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIrAPagoActionPerformed(evt);
            }
        });
        jPanel1.add(botonIrAPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("H:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 191, -1, -1));

        campoHoraLlegada.setBackground(new java.awt.Color(255, 255, 255));
        campoHoraLlegada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoHoraLlegada.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoHoraLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 182, 30, 26));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("min:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 191, -1, -1));

        campoMinutoLlegada.setBackground(new java.awt.Color(255, 255, 255));
        campoMinutoLlegada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoMinutoLlegada.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoMinutoLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 182, 30, 26));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Fecha de salida (dd/mm/yyyy) formato 24 H");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 248, -1, -1));

        campoDiaSalida.setBackground(new java.awt.Color(255, 255, 255));
        campoDiaSalida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoDiaSalida.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoDiaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 271, 30, 26));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("/");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 271, -1, -1));

        campoMesSalida.setBackground(new java.awt.Color(255, 255, 255));
        campoMesSalida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoMesSalida.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoMesSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 271, 30, 26));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("/");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 271, -1, -1));

        campoAnhoSalida.setBackground(new java.awt.Color(255, 255, 255));
        campoAnhoSalida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoAnhoSalida.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoAnhoSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 271, 52, 26));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("H:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 280, -1, -1));

        campoHoraSalida.setBackground(new java.awt.Color(255, 255, 255));
        campoHoraSalida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoHoraSalida.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoHoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 271, 30, 26));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("min:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 280, -1, -1));

        campoMinutoSalida.setBackground(new java.awt.Color(255, 255, 255));
        campoMinutoSalida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoMinutoSalida.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoMinutoSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 271, 30, 26));

        labelDatoObligatorioDni.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioDni.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioDni.setText("Dato obligatorio");
        jPanel1.add(labelDatoObligatorioDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 214, -1, -1));

        labelDatoObligatorioHospedados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioHospedados.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioHospedados.setText("Dato obligatorio");
        jPanel1.add(labelDatoObligatorioHospedados, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 305, -1, -1));

        labelDatoObligatorioFechaLlegada.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioFechaLlegada.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioFechaLlegada.setText("Dato obligatorio");
        jPanel1.add(labelDatoObligatorioFechaLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 214, -1, -1));

        labelDatoObligatorioFechaSalida.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDatoObligatorioFechaSalida.setForeground(new java.awt.Color(255, 0, 0));
        labelDatoObligatorioFechaSalida.setText("Dato obligatorio");
        jPanel1.add(labelDatoObligatorioFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 305, -1, -1));

        checkboxHabitacion2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkboxHabitacion2.setText("Habitación 2 Doble");
        checkboxHabitacion2.setBorder(null);
        checkboxHabitacion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkboxHabitacion2.setFocusPainted(false);
        checkboxHabitacion2.setFocusable(false);
        jPanel1.add(checkboxHabitacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 426, -1, -1));

        checkboxHabitacion1.setBackground(new java.awt.Color(255, 255, 255));
        checkboxHabitacion1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkboxHabitacion1.setText("Habitación 1 Simple");
        checkboxHabitacion1.setBorder(null);
        checkboxHabitacion1.setContentAreaFilled(false);
        checkboxHabitacion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkboxHabitacion1.setFocusPainted(false);
        checkboxHabitacion1.setFocusable(false);
        jPanel1.add(checkboxHabitacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 426, -1, -1));

        checkboxHabitacion3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkboxHabitacion3.setText("Habitación 3 Simple");
        checkboxHabitacion3.setBorder(null);
        checkboxHabitacion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkboxHabitacion3.setFocusPainted(false);
        checkboxHabitacion3.setFocusable(false);
        jPanel1.add(checkboxHabitacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 426, -1, -1));

        labelDNInoExiste.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDNInoExiste.setForeground(new java.awt.Color(255, 0, 0));
        labelDNInoExiste.setText("DNI no existe. Primero guarda los datos del cliente.");
        jPanel1.add(labelDNInoExiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 214, -1, -1));

        labelHospedadosIncorrecto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelHospedadosIncorrecto.setForeground(new java.awt.Color(255, 0, 0));
        labelHospedadosIncorrecto.setText("Debes ingresar un número entero.");
        jPanel1.add(labelHospedadosIncorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 305, -1, -1));

        labelFechaLlegadaIncorrecta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelFechaLlegadaIncorrecta.setForeground(new java.awt.Color(255, 0, 0));
        labelFechaLlegadaIncorrecta.setText("Fecha / hora de llegada incorrecta");
        jPanel1.add(labelFechaLlegadaIncorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 214, -1, -1));

        labelHabitacionesVacias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelHabitacionesVacias.setForeground(new java.awt.Color(255, 0, 0));
        labelHabitacionesVacias.setText("Debes elegir al menos una opción");
        jPanel1.add(labelHabitacionesVacias, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        labelFechaSalidaIncorrecta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelFechaSalidaIncorrecta.setForeground(new java.awt.Color(255, 0, 0));
        labelFechaSalidaIncorrecta.setText("Fecha / hora de salida incorrecta");
        jPanel1.add(labelFechaSalidaIncorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 305, -1, -1));

        labelTituloEditar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        labelTituloEditar.setForeground(new java.awt.Color(153, 153, 153));
        labelTituloEditar.setText("Editar Reserva");
        jPanel1.add(labelTituloEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIrAPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIrAPagoActionPerformed
        PresentacionRegistrarPago registrarPago = new PresentacionRegistrarPago();
        registrarPago.setVisible(true);
        registrarPago.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonIrAPagoActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        PresentacionGestionReservas gestionReservas = new PresentacionGestionReservas();
        gestionReservas.setVisible(true);
        gestionReservas.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        if (!validarCampos()) {
            return;
        }

        LocalDateTime fechaLlegada = obtenerFecha(campoDiaLlegada, campoMesLlegada, campoAnhoLlegada, campoHoraLlegada, campoMinutoLlegada);
        LocalDateTime fechaSalida = obtenerFecha(campoDiaSalida, campoMesSalida, campoAnhoSalida, campoHoraSalida, campoMinutoSalida);

        DialogoReservaExitosa reservaExitosa = new DialogoReservaExitosa(this, rootPaneCheckingEnabled);
        reservaExitosa.setVisible(true);
        reservaExitosa.setLocationRelativeTo(null);

        String habitacion1 = checkboxHabitacion1.isSelected() ? "Habitación 1 simple" : "";
        String habitacion2 = checkboxHabitacion2.isSelected() ? "Habitación 2 doble" : "";
        String habitacion3 = checkboxHabitacion3.isSelected() ? "Habitación 3 simple" : "";

        if (modoEdicion) {
            control.modificarReserva(reserva, campoDNI.getText().trim(), Integer.parseInt(campoPersonasHospedadas.getText().trim()), fechaLlegada, fechaSalida,
                    habitacion1, habitacion2, habitacion3);
        } else {
            control.guardarReserva(campoDNI.getText().trim(), Integer.parseInt(campoPersonasHospedadas.getText().trim()), fechaLlegada, fechaSalida,
                    habitacion1, habitacion2, habitacion3);
        }

        limpiarCampos();
        setModoEdicion(false);
        
    }//GEN-LAST:event_botonGuardarActionPerformed

    private boolean validarCampos() {
        String dni = campoDNI.getText().trim();
        String personasHospedadasStr = campoPersonasHospedadas.getText().trim();
        String diaLlegadaStr = campoDiaLlegada.getText().trim();
        String mesLlegadaStr = campoMesLlegada.getText().trim();
        String anhoLlegadaStr = campoAnhoLlegada.getText().trim();
        String horaLlegadaStr = campoHoraLlegada.getText().trim();
        String minutoLlegadaStr = campoMinutoLlegada.getText().trim();
        String diaSalidaStr = campoDiaSalida.getText().trim();
        String mesSalidaStr = campoMesSalida.getText().trim();
        String anhoSalidaStr = campoAnhoSalida.getText().trim();
        String horaSalidaStr = campoHoraSalida.getText().trim();
        String minutoSalidaStr = campoMinutoSalida.getText().trim();

        boolean datosCorrectos = true;

        if (dni.isEmpty()) {
            labelDatoObligatorioDni.setVisible(true);
            labelDNInoExiste.setVisible(false);
            datosCorrectos = false;
        } else {
            if (!existeDNI(dni)) {
                labelDNInoExiste.setVisible(true);
                labelDatoObligatorioDni.setVisible(false);
                datosCorrectos = false;
            } else {
                labelDatoObligatorioDni.setVisible(false);
                labelDNInoExiste.setVisible(false);
            }
        }

        if (personasHospedadasStr.isEmpty()) {
            labelDatoObligatorioHospedados.setVisible(true);
            labelHospedadosIncorrecto.setVisible(false);
            datosCorrectos = false;
        } else {
            try {
                int numeroHospedados = Integer.parseInt(personasHospedadasStr);
                if (numeroHospedados <= 0) {
                    labelHospedadosIncorrecto.setVisible(true);
                    datosCorrectos = false;
                } else {
                    labelHospedadosIncorrecto.setVisible(false);
                }
            } catch (NumberFormatException e) {
                labelHospedadosIncorrecto.setVisible(true);
                labelDatoObligatorioHospedados.setVisible(false);
                datosCorrectos = false;
            }
        }

        LocalDateTime fechaLlegada = null;
        LocalDateTime fechaSalida = null;

        if (diaLlegadaStr.isEmpty() || mesLlegadaStr.isEmpty() || anhoLlegadaStr.isEmpty()
                || horaLlegadaStr.isEmpty() || minutoLlegadaStr.isEmpty()) {
            labelDatoObligatorioFechaLlegada.setVisible(true);
            labelFechaLlegadaIncorrecta.setVisible(false);
            datosCorrectos = false;
        } else {
            labelDatoObligatorioFechaLlegada.setVisible(false);
        }

        if (diaSalidaStr.isEmpty() || mesSalidaStr.isEmpty() || anhoSalidaStr.isEmpty()
                || horaSalidaStr.isEmpty() || minutoSalidaStr.isEmpty()) {
            labelDatoObligatorioFechaSalida.setVisible(true);
            labelFechaSalidaIncorrecta.setVisible(false);
            datosCorrectos = false;
        } else {
            labelDatoObligatorioFechaSalida.setVisible(false);
        }

        if (!diaLlegadaStr.isEmpty() && !mesLlegadaStr.isEmpty() && !anhoLlegadaStr.isEmpty()
                && !horaLlegadaStr.isEmpty() && !minutoLlegadaStr.isEmpty()) {
            try {
                int diaLlegada = Integer.parseInt(diaLlegadaStr);
                int mesLlegada = Integer.parseInt(mesLlegadaStr);
                int anhoLlegada = Integer.parseInt(anhoLlegadaStr);
                int horaLlegada = Integer.parseInt(horaLlegadaStr);
                int minutoLlegada = Integer.parseInt(minutoLlegadaStr);

                fechaLlegada = LocalDateTime.of(anhoLlegada, mesLlegada, diaLlegada, horaLlegada, minutoLlegada);

                labelDatoObligatorioFechaLlegada.setVisible(false);
            } catch (NumberFormatException | DateTimeException e) {
                labelFechaLlegadaIncorrecta.setVisible(true);
                datosCorrectos = false;
            }
        } else {
            labelDatoObligatorioFechaLlegada.setVisible(true);
            datosCorrectos = false;
        }

        if (!diaSalidaStr.isEmpty() && !mesSalidaStr.isEmpty() && !anhoSalidaStr.isEmpty()
                && !horaSalidaStr.isEmpty() && !minutoSalidaStr.isEmpty()) {
            try {
                int diaSalida = Integer.parseInt(diaSalidaStr);
                int mesSalida = Integer.parseInt(mesSalidaStr);
                int anhoSalida = Integer.parseInt(anhoSalidaStr);
                int horaSalida = Integer.parseInt(horaSalidaStr);
                int minutoSalida = Integer.parseInt(minutoSalidaStr);

                fechaSalida = LocalDateTime.of(anhoSalida, mesSalida, diaSalida, horaSalida, minutoSalida);

                labelDatoObligatorioFechaSalida.setVisible(false);
            } catch (NumberFormatException | DateTimeException e) {
                labelFechaSalidaIncorrecta.setVisible(true);
                datosCorrectos = false;
            }
        } else {
            labelDatoObligatorioFechaSalida.setVisible(true);
            datosCorrectos = false;
        }

        if (fechaLlegada != null && fechaSalida != null) {
            if (fechaLlegada.isAfter(fechaSalida)) {
                labelFechaLlegadaIncorrecta.setVisible(true);
                labelFechaSalidaIncorrecta.setVisible(true);
                datosCorrectos = false;
            } else {
                labelFechaLlegadaIncorrecta.setVisible(false);
                labelFechaSalidaIncorrecta.setVisible(false);
            }
        }

        if (!checkboxHabitacion1.isSelected() && !checkboxHabitacion2.isSelected() && !checkboxHabitacion3.isSelected()) {
            labelHabitacionesVacias.setVisible(true);
            datosCorrectos = false;
        } else {
            labelHabitacionesVacias.setVisible(false);
        }
        return datosCorrectos;
    }

    private boolean existeDNI(String dni) {
        ControladorCliente controladorCliente = new ControladorCliente();
        Cliente cliente = controladorCliente.buscarClientePorDni(dni);
        return cliente != null;
    }

    private void limpiarCampos() {
        campoDNI.setText("");
        campoPersonasHospedadas.setText("");
        campoDNI.setText("");
        campoMinutoLlegada.setText("");
        campoHoraLlegada.setText("");
        campoDiaLlegada.setText("");
        campoMesLlegada.setText("");
        campoAnhoLlegada.setText("");
        campoMinutoSalida.setText("");
        campoHoraSalida.setText("");
        campoDiaSalida.setText("");
        campoMesSalida.setText("");
        campoAnhoSalida.setText("");
        checkboxHabitacion1.setSelected(false);
        checkboxHabitacion2.setSelected(false);
        checkboxHabitacion3.setSelected(false);
    }

    private LocalDateTime obtenerFecha(JTextField campoDia, JTextField campoMes, JTextField campoAnho, JTextField campoHora, JTextField campoMinuto) {
        int dia = Integer.parseInt(campoDia.getText().trim());
        int mes = Integer.parseInt(campoMes.getText().trim());
        int anho = Integer.parseInt(campoAnho.getText().trim());
        int hora = Integer.parseInt(campoHora.getText().trim());
        int minuto = Integer.parseInt(campoMinuto.getText().trim());

        return LocalDateTime.of(anho, mes, dia, hora, minuto);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonIrAPago;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoAnhoLlegada;
    private javax.swing.JTextField campoAnhoSalida;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JTextField campoDiaLlegada;
    private javax.swing.JTextField campoDiaSalida;
    private javax.swing.JTextField campoHoraLlegada;
    private javax.swing.JTextField campoHoraSalida;
    private javax.swing.JTextField campoMesLlegada;
    private javax.swing.JTextField campoMesSalida;
    private javax.swing.JTextField campoMinutoLlegada;
    private javax.swing.JTextField campoMinutoSalida;
    private javax.swing.JTextField campoPersonasHospedadas;
    private javax.swing.JCheckBox checkboxHabitacion1;
    private javax.swing.JCheckBox checkboxHabitacion2;
    private javax.swing.JCheckBox checkboxHabitacion3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDNInoExiste;
    private javax.swing.JLabel labelDatoObligatorioDni;
    private javax.swing.JLabel labelDatoObligatorioFechaLlegada;
    private javax.swing.JLabel labelDatoObligatorioFechaSalida;
    private javax.swing.JLabel labelDatoObligatorioHospedados;
    private javax.swing.JLabel labelFechaLlegadaIncorrecta;
    private javax.swing.JLabel labelFechaSalidaIncorrecta;
    private javax.swing.JLabel labelHabitacionesVacias;
    private javax.swing.JLabel labelHospedadosIncorrecto;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTituloEditar;
    // End of variables declaration//GEN-END:variables

    private void cargarDatosReserva(int idReserva) {
        reserva = control.listarReserva(idReserva);

        campoDNI.setText(reserva.getCliente().getDni());
        campoPersonasHospedadas.setText(String.valueOf(reserva.getNumero_hospedados()));

        LocalDateTime fechaLlegada = reserva.getFecha_llegada();

        int anhoLlegada = fechaLlegada.getYear();
        int mesLlegada = fechaLlegada.getMonthValue();
        int diaLlegada = fechaLlegada.getDayOfMonth();
        int horaLlegada = fechaLlegada.getHour();
        int minutoLlegada = fechaLlegada.getMinute();

        campoAnhoLlegada.setText(String.valueOf(anhoLlegada));
        campoMesLlegada.setText(String.valueOf(mesLlegada));
        campoDiaLlegada.setText(String.valueOf(diaLlegada));
        campoHoraLlegada.setText(String.valueOf(horaLlegada));
        campoMinutoLlegada.setText(String.valueOf(minutoLlegada));

        LocalDateTime fechaSalida = reserva.getFecha_salida();

        int anhoSalida = fechaSalida.getYear();
        int mesSalida = fechaSalida.getMonthValue();
        int diaSalida = fechaSalida.getDayOfMonth();
        int horaSalida = fechaSalida.getHour();
        int minutoSalida = fechaSalida.getMinute();

        campoAnhoSalida.setText(String.valueOf(anhoSalida));
        campoMesSalida.setText(String.valueOf(mesSalida));
        campoDiaSalida.setText(String.valueOf(diaSalida));
        campoHoraSalida.setText(String.valueOf(horaSalida));
        campoMinutoSalida.setText(String.valueOf(minutoSalida));

        List<Reserva_Habitacion> reservaHabitaciones = reserva.getReserva_habitacion();

        for (Reserva_Habitacion reservaHabitacion : reservaHabitaciones) {
            Habitacion habitacion = reservaHabitacion.getHabitacion();
            String tipoHabitacion = habitacion.getTipo_habitacion();

            switch (tipoHabitacion) {
                case "Habitación 1 simple" ->
                    checkboxHabitacion1.setSelected(true);
                case "Habitación 2 doble" ->
                    checkboxHabitacion2.setSelected(true);
                case "Habitación 3 simple" ->
                    checkboxHabitacion3.setSelected(true);
                default -> {
                }
            }
        }
    }
}
