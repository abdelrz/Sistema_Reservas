package com.hotel.imperial.util;

import com.hotel.imperial.presentacion.BarraNavegacion;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaUtil {

    public static void inicializarBarraDeNavegacion(javax.swing.JFrame ventana) {
        ventana.setLayout(new BorderLayout());
        BarraNavegacion barraNavegacion = new BarraNavegacion();
        ventana.add(barraNavegacion, BorderLayout.WEST);
        ventana.setSize(1280, 720);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setResizable(false);
    }

    public static void configurarIcono(JFrame ventana, String rutaIcono) {
        ImageIcon originalIcon = new ImageIcon(VentanaUtil.class.getResource(rutaIcono));
        int width = 200;
        int height = 200;
        Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        ventana.setIconImage(scaledIcon.getImage());
    }

    public static void configurarTamañoVentanaSinBarra(javax.swing.JFrame ventana) {
        ventana.setSize(1000, 700);
        ventana.setResizable(false);
    }

    public static final String URL_ICONO_EDITAR = "/images/edit.png";
    public static final String URL_ICONO_ELIMINAR = "/images/delete.png";

    public static Icon obtenerIconoEditarEstatico() {
        return new ImageIcon(VentanaUtil.class.getResource(URL_ICONO_EDITAR));
    }

    public static Icon obtenerIconoEliminarEstatico() {
        return new ImageIcon(VentanaUtil.class.getResource(URL_ICONO_ELIMINAR));
    }

}
