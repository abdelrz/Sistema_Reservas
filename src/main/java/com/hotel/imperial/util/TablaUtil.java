package com.hotel.imperial.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.function.Consumer;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TablaUtil {

    public static DefaultTableModel crearModeloTablaNoEditable() {
        return new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    }

    public static void agregarAccionACelda(JTable tabla, String nombreColumna, Consumer<Integer> accion) {
        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int columna = tabla.columnAtPoint(e.getPoint());
                int fila = tabla.rowAtPoint(e.getPoint());

                if (columna == tabla.getColumn(nombreColumna).getModelIndex()) {
                    accion.accept(fila);
                }
            }
        });
    }

    public static void configurarCursorBotonesEnTabla(JTable tabla) {
        tabla.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int fila = tabla.rowAtPoint(e.getPoint());
                int columna = tabla.columnAtPoint(e.getPoint());
                if (fila >= 0 && columna >= 0) {
                    Object valor = tabla.getValueAt(fila, columna);
                    if (valor instanceof JButton) {
                        tabla.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    } else {
                        tabla.setCursor(Cursor.getDefaultCursor());
                    }
                }
            }
        });
    }

    public static JButton crearBotonEditar(Runnable accion) {
        JButton botonEditar = new JButton();
        botonEditar.setIcon(VentanaUtil.obtenerIconoEditarEstatico());
        botonEditar.putClientProperty("icono", VentanaUtil.obtenerIconoEditarEstatico());

        botonEditar.addActionListener((ActionEvent e) -> {
            accion.run();
        });
        return botonEditar;
    }

    public static JButton crearBotonEliminar(Runnable accion) {
        JButton botonEliminar = new JButton();
        botonEliminar.setIcon(VentanaUtil.obtenerIconoEliminarEstatico());
        botonEliminar.putClientProperty("icono", VentanaUtil.obtenerIconoEliminarEstatico());

        botonEliminar.addActionListener((ActionEvent e) -> {
            accion.run();
        });
        return botonEliminar;
    }

    public static class BotonRenderer extends DefaultTableCellRenderer {

        public BotonRenderer() {
            setHorizontalAlignment(JLabel.CENTER);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JButton boton = (JButton) value;

            boton.setText("");
            boton.setIcon((Icon) boton.getClientProperty("icono"));
            boton.setBackground(Color.WHITE);
            boton.setBorderPainted(false);

            return boton;
        }
    }

    public static void ocultarColumna(JTable tabla, int indiceColumna) {
        TableColumn columna = tabla.getColumnModel().getColumn(indiceColumna);
        columna.setMinWidth(0);
        columna.setMaxWidth(0);
        columna.setPreferredWidth(0);
    }

    public static void configurarAnchoColumnasCliente(JTable tabla) {
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);

        tabla.getColumnModel().getColumn(1).setPreferredWidth(90); // DNI
        tabla.getColumnModel().getColumn(2).setPreferredWidth(115); // nombre
        tabla.getColumnModel().getColumn(3).setPreferredWidth(115); // apellido
        tabla.getColumnModel().getColumn(4).setPreferredWidth(90); // telefono
        tabla.getColumnModel().getColumn(5).setPreferredWidth(210); // correo
        tabla.getColumnModel().getColumn(6).setPreferredWidth(115); // fecha nacimiento
        tabla.getColumnModel().getColumn(7).setPreferredWidth(50); // Editar
        tabla.getColumnModel().getColumn(8).setPreferredWidth(50); // Borrar
    }

    public static void configurarAnchoColumnasReserva(JTable tabla) {
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);

        tabla.getColumnModel().getColumn(1).setPreferredWidth(90); // DNI
        tabla.getColumnModel().getColumn(2).setPreferredWidth(120); // Llegada
        tabla.getColumnModel().getColumn(3).setPreferredWidth(120); // Salida
        tabla.getColumnModel().getColumn(4).setPreferredWidth(90); // Hospedados
        tabla.getColumnModel().getColumn(5).setPreferredWidth(135); // Habitación 1
        tabla.getColumnModel().getColumn(6).setPreferredWidth(135); // Habitación 2
        tabla.getColumnModel().getColumn(7).setPreferredWidth(135); // Habitación 3
        tabla.getColumnModel().getColumn(8).setPreferredWidth(48); // Editar
        tabla.getColumnModel().getColumn(9).setPreferredWidth(48); // Borrar
    }

    public static void configurarAnchoColumnasPago(JTable tabla) {
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);

        tabla.getColumnModel().getColumn(1).setPreferredWidth(90); // DNI
        tabla.getColumnModel().getColumn(2).setPreferredWidth(170); // metodo de pago
        tabla.getColumnModel().getColumn(3).setPreferredWidth(100); // fecha de pago
        tabla.getColumnModel().getColumn(4).setPreferredWidth(70); // pago
        tabla.getColumnModel().getColumn(5).setPreferredWidth(245); // descripcion de costo extra
        tabla.getColumnModel().getColumn(6).setPreferredWidth(105); // costo extra
        tabla.getColumnModel().getColumn(7).setPreferredWidth(50); // Editar
        tabla.getColumnModel().getColumn(8).setPreferredWidth(50); // Borrar
    }

    public static void configurarAnchoColumnasInformeClientes(JTable tabla) {
        tabla.getColumnModel().getColumn(0).setPreferredWidth(250); // Total de clientes registrados
        tabla.getColumnModel().getColumn(1).setPreferredWidth(250); // Total de personas hospedadas
        tabla.getColumnModel().getColumn(2).setPreferredWidth(250); // Total de reservas
        tabla.getColumnModel().getColumn(3).setPreferredWidth(90); // Mes
        tabla.getColumnModel().getColumn(4).setPreferredWidth(90); // Año   
    }

    public static void configurarColorEncabezadoTabla(JTable tabla) {
        tabla.getTableHeader().setOpaque(false);
        tabla.getTableHeader().setBackground(new Color(13, 32, 24));
        tabla.getTableHeader().setForeground(Color.WHITE);
        tabla.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 12));
        ((DefaultTableCellRenderer) tabla.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(JLabel.CENTER);
    }
}
