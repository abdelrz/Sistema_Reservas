package com.hotel.imperial.logica.exportacion;

import com.hotel.imperial.entidades.Pago;
import com.hotel.imperial.exportacion.ExcelPagoWriter;
import com.hotel.imperial.persistencia.exportacion.ControladorPersistenciaExcelPago;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorExcelPago {

    ControladorPersistenciaExcelPago excelPago = new ControladorPersistenciaExcelPago();

    public void exportarAExcel(List<Pago> datos, String rutaArchivo) {
        ExcelPagoWriter excelWriter = new ExcelPagoWriter();
        try {
            excelWriter.exportarDatosAExcel(datos, rutaArchivo);
        } catch (IOException ex) {
            Logger.getLogger(ControladorExcelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Pago> obtenerDatosParaExportar() {
        return excelPago.obtenerDatosParaExportar();
    }
}
