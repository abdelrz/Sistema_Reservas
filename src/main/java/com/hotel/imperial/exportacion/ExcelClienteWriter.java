package com.hotel.imperial.exportacion;

import com.hotel.imperial.entidades.Cliente;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelClienteWriter {

    public void exportarDatosAExcel(List<Cliente> datos, String rutaArchivo) throws IOException {
        try ( Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = (Sheet) workbook.createSheet("Datos");

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("DNI");
            headerRow.createCell(1).setCellValue("Nombre");
            headerRow.createCell(2).setCellValue("Apellido");
            headerRow.createCell(3).setCellValue("Teléfono");
            headerRow.createCell(4).setCellValue("Correo");
            headerRow.createCell(5).setCellValue("Fecha nacimiento");

            for (int i = 0; i < datos.size(); i++) {
                Row row = sheet.createRow(i + 1);
                Cliente cliente = datos.get(i);

                row.createCell(0).setCellValue(cliente.getDni());
                row.createCell(1).setCellValue(cliente.getNombre());
                row.createCell(2).setCellValue(cliente.getApellido());
                row.createCell(3).setCellValue(cliente.getTelefono());
                row.createCell(4).setCellValue(cliente.getCorreo());
                row.createCell(5).setCellValue(cliente.getFecha_nacimiento());
            }

            try ( FileOutputStream fileOut = new FileOutputStream(rutaArchivo)) {
                workbook.write(fileOut);
            }
        }
    }
}
