package com.hotel.imperial.presentacion;

import com.hotel.imperial.entidades.dto.InformeIngresosDTO;
import com.hotel.imperial.logica.exportacion.ControladorExcelInformeIngresos;
import com.hotel.imperial.logica.graficos.ControladorGraficos;
import com.hotel.imperial.logica.informes.ControladorInformeIngresos;

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

public class PresentacionInformeIngresos extends javax.swing.JFrame {

    ControladorInformeIngresos controladorInformeIngresos = new ControladorInformeIngresos();
    ControladorExcelInformeIngresos excelInformeIngresos = new ControladorExcelInformeIngresos();

    public PresentacionInformeIngresos() {
        initComponents();
        VentanaUtil.inicializarBarraDeNavegacion(this);
        VentanaUtil.configurarIcono(this, "/images/icono.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonGraficoIngresos = new javax.swing.JButton();
        botonExportarEnExcel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaIngreso = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Informe de Ingresos");

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

        tablaIngreso.setBackground(new java.awt.Color(255, 255, 255));
        tablaIngreso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaIngreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaIngreso.setFocusable(false);
        tablaIngreso.setIntercellSpacing(new java.awt.Dimension(10, 10));
        tablaIngreso.setRowHeight(40);
        tablaIngreso.setRowSelectionAllowed(false);
        tablaIngreso.getTableHeader().setResizingAllowed(false);
        tablaIngreso.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaIngreso);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(botonExportarEnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(botonGraficoIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel2)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(botonGraficoIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonExportarEnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
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
        List<InformeIngresosDTO> datosParaExportar = excelInformeIngresos.obtenerDatosParaExportar();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Elige la ubicación del archivo Excel");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos Excel (.xlsx)", "xlsx"));

        int seleccion = fileChooser.showSaveDialog(jPanel1);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoDestino = fileChooser.getSelectedFile();
            String rutaArchivo = archivoDestino.getAbsolutePath() + ".xlsx";

            excelInformeIngresos.exportarAExcel(datosParaExportar, rutaArchivo);
            DialogoExportacionAExcelExitosa exportacionExitosa = new DialogoExportacionAExcelExitosa(this, true);
            exportacionExitosa.setVisible(true);
        }
    }//GEN-LAST:event_botonExportarEnExcelActionPerformed

    private void botonGraficoIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGraficoIngresosActionPerformed
        ControladorGraficos controladorGraficos = new ControladorGraficos();
        controladorGraficos.mostrarGraficoInformeIngresos("Gráfico lineal - Ingresos");
    }//GEN-LAST:event_botonGraficoIngresosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonExportarEnExcel;
    private javax.swing.JButton botonGraficoIngresos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaIngreso;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel modeloTabla = TablaUtil.crearModeloTablaNoEditable();
        
        TablaUtil.configurarColorEncabezadoTabla(tablaIngreso);

        String titulos[] = {"Total de Ingresos", "Ingresos por costo extra", "Ingresos", "Mes", "Año"};
        modeloTabla.setColumnIdentifiers(titulos);

        List<InformeIngresosDTO> listaIngresos = controladorInformeIngresos.obtenerVistaIngresos();
        
        // Ordenar los datos ascendentemente de la tabla según el año
        Collections.sort(listaIngresos, Comparator.comparing(InformeIngresosDTO::getAnho));
        
        if (listaIngresos != null) {

            for (InformeIngresosDTO ingresos : listaIngresos) {
                Object[] objeto = {
                    ingresos.getIngresos(),
                    ingresos.getIngresosPorDanhos(),
                    ingresos.getTotalIngresos(),
                    ingresos.getMes(),
                    ingresos.getAnho(),};

                modeloTabla.addRow(objeto);
            }
        }

        tablaIngreso.setModel(modeloTabla);
    }
}
