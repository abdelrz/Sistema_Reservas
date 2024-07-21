package com.hotel.imperial.logica.exportacion;

import com.hotel.imperial.entidades.dto.InformeIngresosDTO;
import com.hotel.imperial.exportacion.ExcelInformeIngresosWriter;
import com.hotel.imperial.persistencia.exportacion.ControladorPersistenciaExcelInformeIngresos;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorExcelInformeIngresos {

    ControladorPersistenciaExcelInformeIngresos ingresos = new ControladorPersistenciaExcelInformeIngresos();

    public void exportarAExcel(List<InformeIngresosDTO> datos, String rutaArchivo) {
        ExcelInformeIngresosWriter excelWriter = new ExcelInformeIngresosWriter();
        try {
            excelWriter.exportarDatosAExcel(datos, rutaArchivo);
        } catch (IOException ex) {
            Logger.getLogger(ControladorExcelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<InformeIngresosDTO> obtenerDatosParaExportar() {
        return ingresos.obtenerDatosParaExportar();
    }
}
