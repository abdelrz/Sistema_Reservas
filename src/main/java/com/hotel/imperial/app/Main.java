package com.hotel.imperial.app;

import com.hotel.imperial.presentacion.PresentacionIniciarSesion;
import com.hotel.imperial.util.LookAndFeelUtil;


public class Main {

    public static void main(String[] args) {
        LookAndFeelUtil.configurarAspectoSistema();
        
        PresentacionIniciarSesion iniciarSesion = new PresentacionIniciarSesion();
        iniciarSesion.setVisible(true);
        iniciarSesion.setLocationRelativeTo(null);
    }

}
