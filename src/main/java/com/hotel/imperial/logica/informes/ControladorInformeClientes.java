package com.hotel.imperial.logica.informes;

import com.hotel.imperial.entidades.dto.InformeReservasDTO;
import com.hotel.imperial.persistencia.informes.ControladorPersistenciaInformeClientes;
import java.util.List;

public class ControladorInformeClientes {

    ControladorPersistenciaInformeClientes clientes = new ControladorPersistenciaInformeClientes();

    public List<InformeReservasDTO> obtenerVistaClientes() {
        return clientes.obtenerVistaClientes();
    }
}
