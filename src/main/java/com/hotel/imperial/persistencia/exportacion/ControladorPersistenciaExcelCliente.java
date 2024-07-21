package com.hotel.imperial.persistencia.exportacion;

import com.hotel.imperial.entidades.Cliente;
import com.hotel.imperial.jpa.ClienteJpaController;
import java.util.List;

public class ControladorPersistenciaExcelCliente {

    ClienteJpaController clienteJpaController = new ClienteJpaController();

    public List<Cliente> obtenerDatosParaExportar() {
        return clienteJpaController.findClienteEntities();
    }

}
