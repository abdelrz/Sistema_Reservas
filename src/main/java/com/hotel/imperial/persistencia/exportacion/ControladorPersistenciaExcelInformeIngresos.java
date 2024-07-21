package com.hotel.imperial.persistencia.exportacion;

import com.hotel.imperial.entidades.dto.InformeIngresosDTO;
import com.hotel.imperial.dao.InformeIngresosDAO;
import java.util.List;

public class ControladorPersistenciaExcelInformeIngresos {

    InformeIngresosDAO ingresosDAO = new InformeIngresosDAO();
    
    public List<InformeIngresosDTO> obtenerDatosParaExportar() {
        return ingresosDAO.obtenerVistaIngresos();
    }

}
