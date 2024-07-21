package com.hotel.imperial.exportacion;

import com.hotel.imperial.entidades.Pago;
import com.hotel.imperial.entidades.Reparacion;
import com.hotel.imperial.logica.ControladorReparacion;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPagoWriter {

    ControladorReparacion controladorReparacion = new ControladorReparacion();
    
    public void exportarDatosAExcel(List<Pago> datos, String rutaArchivo) throws IOException {
        try ( Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = (Sheet) workbook.createSheet("Datos");

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("DNI");
            headerRow.createCell(1).setCellValue("Método de pago");
            headerRow.createCell(2).setCellValue("Fecha de pago");
            headerRow.createCell(3).setCellValue("Pago");
            headerRow.createCell(4).setCellValue("Descripción de daños");
            headerRow.createCell(5).setCellValue("Costo de daños");

            for (int i = 0; i < datos.size(); i++) {
                Row row = sheet.createRow(i + 1);
                Pago pago = datos.get(i);

                row.createCell(0).setCellValue(pago.getReserva().getCliente().getDni());
                row.createCell(1).setCellValue(pago.getMetodo_pago().getMetodo());
                row.createCell(2).setCellValue(pago.getFecha_pago());
                row.createCell(3).setCellValue(pago.getPago());

                Reparacion reparacion = controladorReparacion.obtenerReparacionPorPago(pago);
                if (reparacion != null) {
                    row.createCell(4).setCellValue(reparacion.getDescripcion());
                    row.createCell(5).setCellValue(reparacion.getCosto());
                } else {
                    row.createCell(4).setCellValue("");
                    row.createCell(5).setCellValue("");
                }
            }

            try ( FileOutputStream fileOut = new FileOutputStream(rutaArchivo)) {
                workbook.write(fileOut);
            }
        }
    }
}
