package com.hotel.imperial.logica.exportacion;

import com.hotel.imperial.entidades.Reserva;
import com.hotel.imperial.exportacion.ExcelReservaWriter;
import com.hotel.imperial.persistencia.exportacion.ControladorPersistenciaExcelReserva;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorExcelReserva {

    ControladorPersistenciaExcelReserva excelReserva = new ControladorPersistenciaExcelReserva();

    public void exportarAExcel(List<Reserva> datos, String rutaArchivo) {
        ExcelReservaWriter excelWriter = new ExcelReservaWriter();
        try {
            excelWriter.exportarDatosAExcel(datos, rutaArchivo);
        } catch (IOException ex) {
            Logger.getLogger(ControladorExcelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Reserva> obtenerDatosParaExportar() {
        return excelReserva.obtenerDatosParaExportar();
    }

}
