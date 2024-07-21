package com.hotel.imperial.persistencia;

import com.hotel.imperial.dao.MenuPrincipalDAO;
import com.hotel.imperial.jpa.ClienteJpaController;
import com.hotel.imperial.jpa.ReservaJpaController;

public class ControladorPersistenciaMenuPrincipal {

    MenuPrincipalDAO menuPrincipalDAO = new MenuPrincipalDAO();
    ClienteJpaController clienteJpaController = new ClienteJpaController();
    ReservaJpaController reservaJpaController = new ReservaJpaController();

    public int mostrarTotalClientes() {
        return clienteJpaController.getClienteCount();
    }

    public double mostrarTotalIngresos() {
        Double totalIngresos = menuPrincipalDAO.mostrarTotalIngresos();
        if (totalIngresos != null) {
            return totalIngresos;
        } else {
            return 0.0;
        }
    }

    public int mostrarTotalReservas() {
        return reservaJpaController.getReservaCount();
    }

}
