package com.hotel.imperial.logica.graficos;

import com.hotel.imperial.entidades.dto.InformeReservasDTO;
import com.hotel.imperial.entidades.dto.InformeIngresosDTO;
import com.hotel.imperial.graficos.GraficoInformeClientes;
import com.hotel.imperial.graficos.GraficoInformeIngresos;
import com.hotel.imperial.persistencia.graficos.ControladorPersistenciaGraficos;
import java.util.List;

public class ControladorGraficos {

    private final ControladorPersistenciaGraficos controladorPersistenciaGraficos = new ControladorPersistenciaGraficos();

    public void mostrarGraficoInformeIngresos(String titulo) {
        List<InformeIngresosDTO> datos = controladorPersistenciaGraficos.obtenerDatosParaGraficoIngresos();
        GraficoInformeIngresos grafico = new GraficoInformeIngresos(titulo, datos);
        grafico.mostrar();
    }

    public void mostrarGraficoInformeClientes(String titulo) {
        List<InformeReservasDTO> datos = controladorPersistenciaGraficos.obtenerDatosParaGraficoClientes();
        GraficoInformeClientes grafico = new GraficoInformeClientes(titulo, datos);
        grafico.mostrar();
    }
}
