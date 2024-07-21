package com.hotel.imperial.logica.exportacion;

import com.hotel.imperial.entidades.dto.InformeReservasDTO;
import com.hotel.imperial.exportacion.ExcelInformeReservasWriter;
import com.hotel.imperial.persistencia.exportacion.ControladorPersistenciaExcelInformeReservas;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorExcelInformeReservas {

    ControladorPersistenciaExcelInformeReservas clientes = new ControladorPersistenciaExcelInformeReservas();

    public void exportarAExcel(List<InformeReservasDTO> datos, String rutaArchivo) {
        ExcelInformeReservasWriter excelWriter = new ExcelInformeReservasWriter();
        try {
            excelWriter.exportarDatosAExcel(datos, rutaArchivo);
        } catch (IOException ex) {
            Logger.getLogger(ControladorExcelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<InformeReservasDTO> obtenerDatosParaExportar() {
        return clientes.obtenerDatosParaExportar();
    }
}
