package com.hotel.imperial.presentacion;

import com.hotel.imperial.util.VentanaUtil;
import com.hotel.imperial.entidades.Pago;
import com.hotel.imperial.entidades.Reparacion;
import com.hotel.imperial.logica.ControladorBuscar;
import com.hotel.imperial.logica.exportacion.ControladorExcelPago;
import com.hotel.imperial.logica.ControladorPago;
import com.hotel.imperial.logica.ControladorReparacion;
import com.hotel.imperial.presentacion.popups.DialogoExportacionAExcelExitosa;
import com.hotel.imperial.presentacion.popups.ValidacionEliminarPago;
import com.hotel.imperial.util.TablaUtil;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class PresentacionGestionPagos extends javax.swing.JFrame {

    ControladorPago controladorPago = new ControladorPago();
    ControladorReparacion controladorReparacion = new ControladorReparacion();
    ControladorBuscar controladorBuscar = new ControladorBuscar();
    ControladorExcelPago controladorExcelPago = new ControladorExcelPago();

    public PresentacionGestionPagos() {
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
        botonIngresarNuevoPago = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoDNI = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonRestablecer = new javax.swing.JButton();
        botonExportar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPago = new javax.swing.JTable();
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
        jLabel2.setText("Gestión de Pagos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 43, -1, -1));

        botonIngresarNuevoPago.setBackground(new java.awt.Color(5, 190, 80));
        botonIngresarNuevoPago.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIngresarNuevoPago.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresarNuevoPago.setText("Ingresar nuevo pago");
        botonIngresarNuevoPago.setBorder(null);
        botonIngresarNuevoPago.setBorderPainted(false);
        botonIngresarNuevoPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngresarNuevoPago.setFocusPainted(false);
        botonIngresarNuevoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarNuevoPagoActionPerformed(evt);
            }
        });
        jPanel1.add(botonIngresarNuevoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 309, 40));

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

        botonExportar.setBackground(new java.awt.Color(16, 124, 65));
        botonExportar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonExportar.setForeground(new java.awt.Color(255, 255, 255));
        botonExportar.setText("Exportar en Excel");
        botonExportar.setBorder(null);
        botonExportar.setBorderPainted(false);
        botonExportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonExportar.setFocusPainted(false);
        botonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExportarActionPerformed(evt);
            }
        });
        jPanel1.add(botonExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 145, 40));

        tablaPago.setBackground(new java.awt.Color(255, 255, 255));
        tablaPago.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaPago.setFocusable(false);
        tablaPago.setIntercellSpacing(new java.awt.Dimension(10, 10));
        tablaPago.setRowHeight(40);
        tablaPago.setRowSelectionAllowed(false);
        tablaPago.getTableHeader().setResizingAllowed(false);
        tablaPago.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaPago);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 326, 910, 320));

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

    private void botonIngresarNuevoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarNuevoPagoActionPerformed
        PresentacionRegistrarPago registrarPago = new PresentacionRegistrarPago();
        registrarPago.setVisible(true);
        registrarPago.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonIngresarNuevoPagoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String dni = campoDNI.getText();
        List<Pago> listaPagos = controladorBuscar.buscarPagosPorDni(dni);

        if (listaPagos.isEmpty()) {
            labelDNInoEncontrado.setVisible(true);
            cargarTabla();
        } else {
            labelDNInoEncontrado.setVisible(false);
            cargarTabla(listaPagos);
        }

    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestablecerActionPerformed
        cargarTabla();
        campoDNI.setText("");
        labelDNInoEncontrado.setVisible(false);
    }//GEN-LAST:event_botonRestablecerActionPerformed

    private void botonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExportarActionPerformed
        List<Pago> datosParaExportar = controladorExcelPago.obtenerDatosParaExportar();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Elige la ubicación del archivo Excel");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos Excel (.xlsx)", "xlsx"));

        int seleccion = fileChooser.showSaveDialog(jPanel1);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoDestino = fileChooser.getSelectedFile();
            String rutaArchivo = archivoDestino.getAbsolutePath() + ".xlsx";

            controladorExcelPago.exportarAExcel(datosParaExportar, rutaArchivo);
            DialogoExportacionAExcelExitosa exportacionExitosa = new DialogoExportacionAExcelExitosa(this, true);
            exportacionExitosa.setVisible(true);
        }
    }//GEN-LAST:event_botonExportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonExportar;
    private javax.swing.JButton botonIngresarNuevoPago;
    private javax.swing.JButton botonRestablecer;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDNInoEncontrado;
    private javax.swing.JTable tablaPago;
    // End of variables declaration//GEN-END:variables

    private Pago obtenerPagoDesdeFila(int fila) {
        List<Pago> listaPago = controladorPago.listarPago();
        return listaPago.get(fila);
    }

    private void cargarTabla() {
        List<Pago> listaPagos = controladorPago.listarPago();
        cargarTabla(listaPagos);
    }

    private void cargarTabla(List<Pago> listaPagos) {

        DefaultTableModel modeloTabla = TablaUtil.crearModeloTablaNoEditable();

        TablaUtil.configurarCursorBotonesEnTabla(tablaPago);

        TablaUtil.agregarAccionACelda(tablaPago, "Editar", fila -> {
            obtenerPagoDesdeFila(fila);
            manejarEditarPago();
        });

        TablaUtil.agregarAccionACelda(tablaPago, "Borrar", fila -> {
            obtenerPagoDesdeFila(fila);
            manejarEliminarPago();
        });

        TablaUtil.configurarColorEncabezadoTabla(tablaPago);

        String titulos[] = {"ID", "DNI", "Método de pago", "Fecha de pago", "Pago", "Descripción costo extra",
            "Costo extra", "Editar", "Borrar"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        // Ordenar los datos ascendentemente de la tabla según la fecha de pago
        Collections.sort(listaPagos, Comparator.comparing(Pago::getFecha_pago));

        if (listaPagos != null) {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

            for (Pago pago : listaPagos) {
                Reparacion reparacion = null;

                if (pago != null) {
                    reparacion = controladorReparacion.obtenerReparacionPorPago(pago);
                }

                Object[] objeto = {
                    pago.getPago_id(),
                    pago.getReserva().getCliente().getDni(),
                    pago.getMetodo_pago().getMetodo(),
                    formatoFecha.format(pago.getFecha_pago()),
                    pago.getPago(),
                    (reparacion != null) ? reparacion.getDescripcion() : "",
                    (reparacion != null) ? reparacion.getCosto() : "0.0",
                    botonEditar,
                    botonEliminar
                };

                modeloTabla.addRow(objeto);
            }

        }

        tablaPago.setModel(modeloTabla);

        tablaPago.getColumnModel().getColumn(7).setCellRenderer(new TablaUtil.BotonRenderer());
        tablaPago.getColumnModel().getColumn(8).setCellRenderer(new TablaUtil.BotonRenderer());

        TablaUtil.ocultarColumna(tablaPago, 0);
        TablaUtil.configurarAnchoColumnasPago(tablaPago);

    }

    JButton botonEditar = TablaUtil.crearBotonEditar(this::manejarEditarPago);
    JButton botonEliminar = TablaUtil.crearBotonEliminar(this::manejarEliminarPago);

    private void manejarEditarPago() {

        if (tablaPago.getRowCount() > 0) {

            if (tablaPago.getSelectedRow() != -1) {

                int idPago = Integer.parseInt(String.valueOf(
                        tablaPago.getValueAt(tablaPago.getSelectedRow(), 0)));

                PresentacionRegistrarPago registrarPago = new PresentacionRegistrarPago(idPago);
                registrarPago.setModoEdicion(true);
                registrarPago.setVisible(true);
                registrarPago.setLocationRelativeTo(null);
                dispose();
            }
        }

    }

    private void manejarEliminarPago() {

        if (tablaPago.getRowCount() > 0) {

            if (tablaPago.getSelectedRow() != -1) {

                ValidacionEliminarPago validacionEliminar = new ValidacionEliminarPago(this, true);
                validacionEliminar.setVisible(true);

                int resultadoValidacion = validacionEliminar.getReturnStatus();

                if (resultadoValidacion == ValidacionEliminarPago.RET_OK) {
                    int idPago = Integer.parseInt(String.valueOf(
                            tablaPago.getValueAt(tablaPago.getSelectedRow(), 0)));

                    controladorPago.eliminarPago(idPago);

                    cargarTabla();
                }

            }
        }
    }

}
