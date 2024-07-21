package com.hotel.imperial.persistencia.informes;

import com.hotel.imperial.entidades.dto.InformeIngresosDTO;
import com.hotel.imperial.dao.InformeIngresosDAO;
import java.util.List;

public class ControladorPersistenciaInformeIngresos {

    InformeIngresosDAO informeIngresosDAO = new InformeIngresosDAO();

    public List<InformeIngresosDTO> obtenerVistaIngresos() {
        return informeIngresosDAO.obtenerVistaIngresos();
    }

}
