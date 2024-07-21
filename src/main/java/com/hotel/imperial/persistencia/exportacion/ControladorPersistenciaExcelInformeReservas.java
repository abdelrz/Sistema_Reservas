package com.hotel.imperial.persistencia.exportacion;

import com.hotel.imperial.entidades.dto.InformeReservasDTO;
import com.hotel.imperial.dao.InformeReservasDAO;
import java.util.List;

public class ControladorPersistenciaExcelInformeReservas {

    InformeReservasDAO clientesDAO = new InformeReservasDAO();
    
    public List<InformeReservasDTO> obtenerDatosParaExportar() {
        return clientesDAO.obtenerVistaClientes();
    }

}
