package com.hotel.imperial.logica.informes;

import com.hotel.imperial.entidades.dto.InformeIngresosDTO;
import com.hotel.imperial.persistencia.informes.ControladorPersistenciaInformeIngresos;
import java.util.List;

public class ControladorInformeIngresos {

    ControladorPersistenciaInformeIngresos ingresos = new ControladorPersistenciaInformeIngresos();

    public List<InformeIngresosDTO> obtenerVistaIngresos() {
        return ingresos.obtenerVistaIngresos();
    }
}
