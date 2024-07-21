package com.hotel.imperial.presentacion;

import com.hotel.imperial.entidades.Cliente;
import com.hotel.imperial.logica.ControladorBuscar;
import com.hotel.imperial.logica.ControladorCliente;
import com.hotel.imperial.logica.exportacion.ControladorExcelCliente;
import com.hotel.imperial.presentacion.popups.DialogoExportacionAExcelExitosa;
import com.hotel.imperial.presentacion.popups.ValidacionEliminarCliente;
import com.hotel.imperial.util.TablaUtil;
import com.hotel.imperial.util.VentanaUtil;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class PresentacionGestionClientes extends javax.swing.JFrame {

    ControladorCliente controladorCliente = new ControladorCliente();
    ControladorBuscar controladorBuscar = new ControladorBuscar();
    ControladorExcelCliente controladorExcelCliente = new ControladorExcelCliente();

    public PresentacionGestionClientes() {
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
        botonIngresarNuevoCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoDNI = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonRestablecer = new javax.swing.JButton();
        botonExportarEnExcel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
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
        jLabel2.setText("Gestión de Clientes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 43, -1, -1));

        botonIngresarNuevoCliente.setBackground(new java.awt.Color(5, 190, 80));
        botonIngresarNuevoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIngresarNuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresarNuevoCliente.setText("Ingresar nuevo cliente");
        botonIngresarNuevoCliente.setBorder(null);
        botonIngresarNuevoCliente.setBorderPainted(false);
        botonIngresarNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngresarNuevoCliente.setFocusPainted(false);
        botonIngresarNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarNuevoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(botonIngresarNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 309, 40));

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
        jPanel1.add(botonExportarEnExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 145, 40));

        tablaCliente.setBackground(new java.awt.Color(255, 255, 255));
        tablaCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaCliente.setFocusable(false);
        tablaCliente.setIntercellSpacing(new java.awt.Dimension(10, 10));
        tablaCliente.setRowHeight(40);
        tablaCliente.setRowSelectionAllowed(false);
        tablaCliente.getTableHeader().setResizingAllowed(false);
        tablaCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 334, 910, 320));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarNuevoClienteActionPerformed
        PresentacionNuevoCliente nuevoCliente = new PresentacionNuevoCliente();
        nuevoCliente.setVisible(true);
        nuevoCliente.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_botonIngresarNuevoClienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String dni = campoDNI.getText();
        List<Cliente> listaClientes = controladorBuscar.buscarClientesPorDni(dni);

        if (listaClientes.isEmpty()) {
            labelDNInoEncontrado.setVisible(true);
            cargarTabla();

        } else {
            labelDNInoEncontrado.setVisible(false);
            cargarTabla(listaClientes);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestablecerActionPerformed
        cargarTabla();
        campoDNI.setText("");
        labelDNInoEncontrado.setVisible(false);
    }//GEN-LAST:event_botonRestablecerActionPerformed

    private void botonExportarEnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExportarEnExcelActionPerformed

        List<Cliente> datosParaExportar = controladorExcelCliente.obtenerDatosParaExportar();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Elige la ubicación del archivo Excel");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos Excel (.xlsx)", "xlsx"));

        int seleccion = fileChooser.showSaveDialog(jPanel1);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoDestino = fileChooser.getSelectedFile();
            String rutaArchivo = archivoDestino.getAbsolutePath() + ".xlsx";

            controladorExcelCliente.exportarAExcel(datosParaExportar, rutaArchivo);
            DialogoExportacionAExcelExitosa exportacionExitosa = new DialogoExportacionAExcelExitosa(this, true);
            exportacionExitosa.setVisible(true);
        }
    }//GEN-LAST:event_botonExportarEnExcelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonExportarEnExcel;
    private javax.swing.JButton botonIngresarNuevoCliente;
    private javax.swing.JButton botonRestablecer;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDNInoEncontrado;
    private javax.swing.JTable tablaCliente;
    // End of variables declaration//GEN-END:variables

    private Cliente obtenerClienteDesdeFila(int fila) {
        List<Cliente> listaClientes = controladorCliente.listarClientes();
        return listaClientes.get(fila);
    }

    private void cargarTabla() {
        List<Cliente> listaClientes = controladorCliente.listarClientes();
        cargarTabla(listaClientes);
    }

    private void cargarTabla(List<Cliente> listaClientes) {
        DefaultTableModel modeloTabla = TablaUtil.crearModeloTablaNoEditable();

        TablaUtil.configurarCursorBotonesEnTabla(tablaCliente);

        TablaUtil.agregarAccionACelda(tablaCliente, "Editar", fila -> {
            obtenerClienteDesdeFila(fila);
            manejarEditarCliente();
        });

        TablaUtil.agregarAccionACelda(tablaCliente, "Borrar", fila -> {
            obtenerClienteDesdeFila(fila);
            manejarEliminarCliente();
        });
        
        TablaUtil.configurarColorEncabezadoTabla(tablaCliente);

        String titulos[] = {"ID", "DNI", "Nombre", "Apellido", "Teléfono", "Correo", "Fecha nacimiento",
            "Editar", "Borrar"};
        modeloTabla.setColumnIdentifiers(titulos);

        if (listaClientes != null) {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

            for (Cliente cliente : listaClientes) {
                Object[] objeto = {
                    cliente.getCliente_id(),
                    cliente.getDni(),
                    cliente.getNombre(),
                    cliente.getApellido(),
                    cliente.getTelefono(),
                    cliente.getCorreo(),
                    formatoFecha.format(cliente.getFecha_nacimiento()),
                    botonEditar,
                    botonEliminar,};

                modeloTabla.addRow(objeto);
            }
        }

        tablaCliente.setModel(modeloTabla);

        tablaCliente.getColumnModel().getColumn(7).setCellRenderer(new TablaUtil.BotonRenderer());
        tablaCliente.getColumnModel().getColumn(8).setCellRenderer(new TablaUtil.BotonRenderer());

        TablaUtil.ocultarColumna(tablaCliente, 0);
        TablaUtil.configurarAnchoColumnasCliente(tablaCliente);

    }

    JButton botonEditar = TablaUtil.crearBotonEditar(this::manejarEditarCliente);
    JButton botonEliminar = TablaUtil.crearBotonEliminar(this::manejarEliminarCliente);

    private void manejarEditarCliente() {

        if (tablaCliente.getRowCount() > 0) {

            if (tablaCliente.getSelectedRow() != -1) {

                int idCliente = Integer.parseInt(String.valueOf(
                        tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 0)));

                PresentacionNuevoCliente nuevoCliente = new PresentacionNuevoCliente(idCliente);
                nuevoCliente.setModoEdicion(true);
                nuevoCliente.setVisible(true);
                nuevoCliente.setLocationRelativeTo(null);
                dispose();
            }
        }

    }

    private void manejarEliminarCliente() {

        if (tablaCliente.getRowCount() > 0) {

            if (tablaCliente.getSelectedRow() != -1) {

                ValidacionEliminarCliente validacionEliminar = new ValidacionEliminarCliente(this, true);
                validacionEliminar.setVisible(true);

                int resultadoValidacion = validacionEliminar.getReturnStatus();

                if (resultadoValidacion == ValidacionEliminarCliente.RET_OK) {
                    int idCliente = Integer.parseInt(String.valueOf(
                            tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 0)));

                    controladorCliente.eliminarCliente(idCliente);

                    cargarTabla();
                }
            }
        }
    }

}
