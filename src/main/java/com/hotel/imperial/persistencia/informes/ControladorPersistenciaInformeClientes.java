package com.hotel.imperial.persistencia.informes;

import com.hotel.imperial.dao.InformeReservasDAO;
import com.hotel.imperial.entidades.dto.InformeReservasDTO;
import java.util.List;

public class ControladorPersistenciaInformeClientes {

    InformeReservasDAO clientesDAO = new InformeReservasDAO();

    public List<InformeReservasDTO> obtenerVistaClientes() {
        return clientesDAO.obtenerVistaClientes();
    }

}
