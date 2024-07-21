package com.hotel.imperial.persistencia.graficos;

import com.hotel.imperial.entidades.dto.InformeReservasDTO;
import com.hotel.imperial.entidades.dto.InformeIngresosDTO;
import com.hotel.imperial.dao.InformeReservasDAO;
import com.hotel.imperial.dao.InformeIngresosDAO;
import java.util.List;

public class ControladorPersistenciaGraficos {

    InformeIngresosDAO informeIngresosDAO = new InformeIngresosDAO();
    InformeReservasDAO informeClientesDAO = new InformeReservasDAO();

    public List<InformeIngresosDTO> obtenerDatosParaGraficoIngresos() {
        return informeIngresosDAO.obtenerVistaIngresos();
    }

    public List<InformeReservasDTO> obtenerDatosParaGraficoClientes() {
        return informeClientesDAO.obtenerVistaClientes();
    }

}
