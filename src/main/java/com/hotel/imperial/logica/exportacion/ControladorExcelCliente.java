package com.hotel.imperial.logica.exportacion;

import com.hotel.imperial.entidades.Cliente;
import com.hotel.imperial.exportacion.ExcelClienteWriter;
import com.hotel.imperial.persistencia.exportacion.ControladorPersistenciaExcelCliente;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorExcelCliente {

    ControladorPersistenciaExcelCliente excelCliente = new ControladorPersistenciaExcelCliente();

    public void exportarAExcel(List<Cliente> datos, String rutaArchivo) {
        ExcelClienteWriter excelWriter = new ExcelClienteWriter();
        try {
            excelWriter.exportarDatosAExcel(datos, rutaArchivo);
        } catch (IOException ex) {
            Logger.getLogger(ControladorExcelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Cliente> obtenerDatosParaExportar() {
        return excelCliente.obtenerDatosParaExportar();
    }
}
