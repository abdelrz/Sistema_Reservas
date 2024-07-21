package com.hotel.imperial.presentacion;

import com.hotel.imperial.util.VentanaUtil;
import com.hotel.imperial.entidades.Reserva;
import com.hotel.imperial.entidades.Reserva_Habitacion;
import com.hotel.imperial.logica.ControladorBuscar;
import com.hotel.imperial.logica.exportacion.ControladorExcelReserva;
import com.hotel.imperial.logica.ControladorReserva;
import com.hotel.imperial.presentacion.popups.DialogoExportacionAExcelExitosa;
import com.hotel.imperial.presentacion.popups.ValidacionEliminarReserva;
import com.hotel.imperial.util.TablaUtil;
import java.io.File;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.table.DefaultTableModel;

public class PresentacionGestionReservas extends javax.swing.JFrame {

    ControladorReserva controladorReserva = new ControladorReserva();
    ControladorBuscar controladorBuscar = new ControladorBuscar();
    ControladorExcelReserva controladorExcelReserva = new ControladorExcelReserva();

    public PresentacionGestionReservas() {
        initComponents();
        VentanaUtil.inicializarBarraDeNavegacion(this);
        VentanaUtil.configurarIcono(this, "/images/icono.png");

        labelDNInoEncontrado.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonIngresarNuevaReserva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoDNI = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonRestablecer = new javax.swing.JButton();
        botonExportarEnExcel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReserva = new javax.swing.JTable();
        labelDNInoEncontrado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Gestión de Reservas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 43, -1, -1));

        botonIngresarNuevaReserva.setBackground(new java.awt.Color(5, 190, 80));
        botonIngresarNuevaReserva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIngresarNuevaReserva.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresarNuevaReserva.setText("Ingresar nueva reserva");
        botonIngresarNuevaReserva.setBorder(null);
        botonIngresarNuevaReserva.setBorderPainted(false);
        botonIngresarNuevaReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngresarNuevaReserva.setFocusPainted(false);
        botonIngresarNuevaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarNuevaReservaActionPerformed(evt);
            }
        });
        jPanel1.add(botonIngresarNuevaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 309, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Buscar Cliente por DNI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 230, -1, -1));

        campoDNI.setBackground(new java.awt.Color(255, 255, 255));
        campoDNI.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoDNI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel1.add(campoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 253, 150, 26));

        botonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        botonBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(5, 190, 80));
        botonBuscar.setText("Buscar");
        botonBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(5, 190, 80)));
        botonBuscar.setContentAreaFilled(false);
        botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscar.setFocusPainted(false);
        botonBuscar.setFocusable(false);
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 100, 40));

        botonRestablecer.setBackground(new java.awt.Color(255, 255, 255));
        botonRestablecer.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonRestablecer.setForeground(new java.awt.Color(5, 190, 80));
        botonRestablecer.setText("Restablecer");
        botonRestablecer.setBorder(null);
        botonRestablecer.setBorderPainted(false);
        botonRestablecer.setContentAreaFilled(false);
        botonRestablecer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRestablecer.setFocusPainted(false);
        botonRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestablecerActionPerformed(evt);
            }
        });
        jPanel1.add(botonRestablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 100, 40));

        botonExportarEnExcel.setBackground(new java.awt.Color(16, 124, 65));
        botonExportarEnExcel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonExportarEnExcel.setForeground(new java.awt.Color(255, 255, 255));
        botonExportarEnExcel.setText("Exportar en Excel");
        botonExportarEnExcel.setBorder(null);
        botonExportarEnExcel.setBorderPainted(false);
        botonExportarEnExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonExportarEnExcel.setFocusPainted(false);
        botonExportarEnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExportarEnExcelActionPerformed(evt);
            }
        });
        jPanel1.add(botonExportarEnExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 145, 40));

        tablaReserva.setBackground(new java.awt.Color(255, 255, 255));
        tablaReserva.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaReserva.setFocusable(false);
        tablaReserva.setIntercellSpacing(new java.awt.Dimension(10, 10));
        tablaReserva.setRowHeight(40);
        tablaReserva.setRowSelectionAllowed(false);
        tablaReserva.getTableHeader().setResizingAllowed(false);
        tablaReserva.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaReserva);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 329, 920, 320));

        labelDNInoEncontrado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDNInoEncontrado.setForeground(new java.awt.Color(255, 0, 0));
        labelDNInoEncontrado.setText("No se encontró el DNI");
        jPanel1.add(labelDNInoEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 285, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarNuevaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarNuevaReservaActionPerformed
        PresentacionNuevaReserva nuevaReserva = new PresentacionNuevaReserva();
        nuevaReserva.setVisible(true);
        nuevaReserva.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonIngresarNuevaReservaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String dni = campoDNI.getText();
        List<Reserva> listaReservas = controladorBuscar.buscarReservasPorDni(dni);

        if (listaReservas.isEmpty()) {
            labelDNInoEncontrado.setVisible(true);
            cargarTabla();
        } else {
            labelDNInoEncontrado.setVisible(false);
            cargarTabla(listaReservas);
        }

    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestablecerActionPerformed
        cargarTabla();
        campoDNI.setText("");
        labelDNInoEncontrado.setVisible(false);
    }//GEN-LAST:event_botonRestablecerActionPerformed

    private void botonExportarEnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExportarEnExcelActionPerformed
        List<Reserva> datosParaExportar = controladorExcelReserva.obtenerDatosParaExportar();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Elige la ubicación del archivo Excel");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos Excel (.xlsx)", "xlsx"));

        int seleccion = fileChooser.showSaveDialog(jPanel1);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoDestino = fileChooser.getSelectedFile();
            String rutaArchivo = archivoDestino.getAbsolutePath() + ".xlsx";

            controladorExcelReserva.exportarAExcel(datosParaExportar, rutaArchivo);
            DialogoExportacionAExcelExitosa exportacionExitosa = new DialogoExportacionAExcelExitosa(this, true);
            exportacionExitosa.setVisible(true);
        }
    }//GEN-LAST:event_botonExportarEnExcelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonExportarEnExcel;
    private javax.swing.JButton botonIngresarNuevaReserva;
    private javax.swing.JButton botonRestablecer;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDNInoEncontrado;
    private javax.swing.JTable tablaReserva;
    // End of variables declaration//GEN-END:variables

    private Reserva obtenerReservaDesdeFila(int fila) {
        List<Reserva> listaReserva = controladorReserva.listarReserva();
        return listaReserva.get(fila);
    }

    private void cargarTabla() {
        List<Reserva> listaReservas = controladorReserva.listarReserva();
        cargarTabla(listaReservas);
    }

    public void cargarTabla(List<Reserva> listaReservas) {
        DefaultTableModel modeloTabla = TablaUtil.crearModeloTablaNoEditable();

        TablaUtil.configurarCursorBotonesEnTabla(tablaReserva);

        TablaUtil.agregarAccionACelda(tablaReserva, "Editar", fila -> {
            obtenerReservaDesdeFila(fila);
            manejarEditarReserva();
        });

        TablaUtil.agregarAccionACelda(tablaReserva, "Borrar", fila -> {
            obtenerReservaDesdeFila(fila);
            manejarEliminarReserva();
        });
        
        TablaUtil.configurarColorEncabezadoTabla(tablaReserva);

        String titulos[] = {"ID", "DNI", "Llegada", "Salida", "Hospedados", "Habitación",
            "Habitación", "Habitación",
            "Editar", "Borrar"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        // Ordenar los datos ascendentemente de la tabla según la fecha de llegada
        Collections.sort(listaReservas, Comparator.comparing(Reserva::getFecha_llegada));

        if (listaReservas != null) {
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

            for (Reserva reserva : listaReservas) {
                Object[] objeto = new Object[10];
                objeto[0] = reserva.getReserva_id();
                objeto[1] = reserva.getCliente().getDni();
                objeto[2] = reserva.getFecha_llegada().format(formatoFecha);
                objeto[3] = reserva.getFecha_salida().format(formatoFecha);
                objeto[4] = reserva.getNumero_hospedados();

                List<Reserva_Habitacion> reservaHabitaciones = reserva.getReserva_habitacion();
                for (int i = 0; i < 3; i++) {
                    if (i < reservaHabitaciones.size()) {
                        objeto[i + 5] = reservaHabitaciones.get(i).getHabitacion().getTipo_habitacion();
                    } else {
                        objeto[i + 5] = "";
                    }
                }

                objeto[8] = botonEditar;
                objeto[9] = botonEliminar;

                modeloTabla.addRow(objeto);
            }
        }

        tablaReserva.setModel(modeloTabla);

        tablaReserva.getColumnModel().getColumn(8).setCellRenderer(new TablaUtil.BotonRenderer());
        tablaReserva.getColumnModel().getColumn(9).setCellRenderer(new TablaUtil.BotonRenderer());

        TablaUtil.ocultarColumna(tablaReserva, 0);
        TablaUtil.configurarAnchoColumnasReserva(tablaReserva);

    }

    JButton botonEditar = TablaUtil.crearBotonEditar(this::manejarEditarReserva);
    JButton botonEliminar = TablaUtil.crearBotonEliminar(this::manejarEliminarReserva);

    private void manejarEditarReserva() {

        if (tablaReserva.getRowCount() > 0) {

            if (tablaReserva.getSelectedRow() != -1) {

                int idReserva = Integer.parseInt(String.valueOf(
                        tablaReserva.getValueAt(tablaReserva.getSelectedRow(), 0)));

                PresentacionNuevaReserva nuevaReserva = new PresentacionNuevaReserva(idReserva);
                nuevaReserva.setModoEdicion(true);
                nuevaReserva.setVisible(true);
                nuevaReserva.setLocationRelativeTo(null);
                dispose();

            }
        }

    }

    private void manejarEliminarReserva() {

        if (tablaReserva.getRowCount() > 0) {

            if (tablaReserva.getSelectedRow() != -1) {

                ValidacionEliminarReserva validacionEliminar = new ValidacionEliminarReserva(this, true);
                validacionEliminar.setVisible(true);

                int resultadoValidacion = validacionEliminar.getReturnStatus();

                if (resultadoValidacion == ValidacionEliminarReserva.RET_OK) {
                    int idReserva = Integer.parseInt(String.valueOf(
                            tablaReserva.getValueAt(tablaReserva.getSelectedRow(), 0)));

                    controladorReserva.eliminarReserva(idReserva);

                    cargarTabla();
                }

            }
        }
    }

}
