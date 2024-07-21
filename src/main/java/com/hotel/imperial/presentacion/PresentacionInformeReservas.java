package com.hotel.imperial.presentacion;

import com.hotel.imperial.entidades.dto.InformeReservasDTO;
import com.hotel.imperial.logica.exportacion.ControladorExcelInformeReservas;
import com.hotel.imperial.logica.graficos.ControladorGraficos;
import com.hotel.imperial.logica.informes.ControladorInformeClientes;
import com.hotel.imperial.presentacion.popups.DialogoExportacionAExcelExitosa;
import com.hotel.imperial.util.TablaUtil;
import com.hotel.imperial.util.VentanaUtil;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class PresentacionInformeReservas extends javax.swing.JFrame {

    ControladorInformeClientes controladorInformeClientes = new ControladorInformeClientes();
    ControladorExcelInformeReservas excelInformeClientes = new ControladorExcelInformeReservas();

    public PresentacionInformeReservas() {
        initComponents();
        VentanaUtil.inicializarBarraDeNavegacion(this);
        VentanaUtil.configurarIcono(this, "/images/icono.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonGraficoReserva = new javax.swing.JButton();
        botonExportarEnExcel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInformeCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Informe de Reservas");

        botonGraficoReserva.setBackground(new java.awt.Color(5, 190, 80));
        botonGraficoReserva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonGraficoReserva.setForeground(new java.awt.Color(255, 255, 255));
        botonGraficoReserva.setText("Ver gráfico de Reservas");
        botonGraficoReserva.setBorder(null);
        botonGraficoReserva.setBorderPainted(false);
        botonGraficoReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGraficoReserva.setFocusPainted(false);
        botonGraficoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGraficoReservaActionPerformed(evt);
            }
        });

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

        tablaInformeCliente.setBackground(new java.awt.Color(255, 255, 255));
        tablaInformeCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaInformeCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaInformeCliente.setFocusable(false);
        tablaInformeCliente.setIntercellSpacing(new java.awt.Dimension(10, 10));
        tablaInformeCliente.setRowHeight(40);
        tablaInformeCliente.setRowSelectionAllowed(false);
        tablaInformeCliente.getTableHeader().setResizingAllowed(false);
        tablaInformeCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaInformeCliente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(botonExportarEnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(botonGraficoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(botonGraficoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonExportarEnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void botonExportarEnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExportarEnExcelActionPerformed
        List<InformeReservasDTO> datosParaExportar = excelInformeClientes.obtenerDatosParaExportar();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Elige la ubicación del archivo Excel");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos Excel (.xlsx)", "xlsx"));

        int seleccion = fileChooser.showSaveDialog(jPanel1);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoDestino = fileChooser.getSelectedFile();
            String rutaArchivo = archivoDestino.getAbsolutePath() + ".xlsx";

            excelInformeClientes.exportarAExcel(datosParaExportar, rutaArchivo);
            DialogoExportacionAExcelExitosa exportacionExitosa = new DialogoExportacionAExcelExitosa(this, true);
            exportacionExitosa.setVisible(true);
        }
    }//GEN-LAST:event_botonExportarEnExcelActionPerformed

    private void botonGraficoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGraficoReservaActionPerformed
        ControladorGraficos controladorGraficos = new ControladorGraficos();
        controladorGraficos.mostrarGraficoInformeClientes("Gráfico lineal - Reservas");
    }//GEN-LAST:event_botonGraficoReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonExportarEnExcel;
    private javax.swing.JButton botonGraficoReserva;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaInformeCliente;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel modeloTabla = TablaUtil.crearModeloTablaNoEditable();

        TablaUtil.configurarColorEncabezadoTabla(tablaInformeCliente);

        String titulos[] = {"Total de Clientes registrados", "Total de personas hospedadas", "Total de reservas", "Mes", "Año"};
        modeloTabla.setColumnIdentifiers(titulos);

        List<InformeReservasDTO> listaClientes = controladorInformeClientes.obtenerVistaClientes();

        // Ordenar los datos ascendentemente de la tabla según el año
        Collections.sort(listaClientes, Comparator.comparing(InformeReservasDTO::getAnho));

        if (listaClientes != null) {

            for (InformeReservasDTO clientes : listaClientes) {
                Object[] objeto = {
                    clientes.getTotalClientes(),
                    clientes.getTotalPersonasHospedadas(),
                    clientes.getTotalReservas(),
                    clientes.getMes(),
                    clientes.getAnho(),};

                modeloTabla.addRow(objeto);
            }
        }

        tablaInformeCliente.setModel(modeloTabla);

        TablaUtil.configurarAnchoColumnasInformeClientes(tablaInformeCliente);
    }

}
