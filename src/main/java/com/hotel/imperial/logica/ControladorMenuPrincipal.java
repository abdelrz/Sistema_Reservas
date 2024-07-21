package com.hotel.imperial.logica;

import com.hotel.imperial.persistencia.ControladorPersistenciaMenuPrincipal;

public class ControladorMenuPrincipal {

    ControladorPersistenciaMenuPrincipal controladorPersistenciaMenuPrincipal = new ControladorPersistenciaMenuPrincipal();
    
    public int mostrarTotalClientes() {
        return controladorPersistenciaMenuPrincipal.mostrarTotalClientes();
    }

    public double mostrarTotalIngresos() {
        return controladorPersistenciaMenuPrincipal.mostrarTotalIngresos();
    }

    public int mostrarTotalReservas() {
        return controladorPersistenciaMenuPrincipal.mostrarTotalReservas();
    }

}
