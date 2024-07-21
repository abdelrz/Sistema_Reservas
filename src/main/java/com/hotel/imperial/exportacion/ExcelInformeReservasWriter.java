package com.hotel.imperial.exportacion;

import com.hotel.imperial.entidades.dto.InformeReservasDTO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelInformeReservasWriter {

    public void exportarDatosAExcel(List<InformeReservasDTO> datos, String rutaArchivo) throws IOException {
        try ( Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = (Sheet) workbook.createSheet("Datos");

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Total de clientes registrados");
            headerRow.createCell(1).setCellValue("Total de personas hospedadas");
            headerRow.createCell(2).setCellValue("Total de reservas");
            headerRow.createCell(3).setCellValue("Mes");
            headerRow.createCell(4).setCellValue("Año");

            for (int i = 0; i < datos.size(); i++) {
                Row row = sheet.createRow(i + 1);
                InformeReservasDTO ingresosDTO = datos.get(i);

                row.createCell(0).setCellValue(ingresosDTO.getTotalClientes());
                row.createCell(1).setCellValue(ingresosDTO.getTotalPersonasHospedadas());
                row.createCell(2).setCellValue(ingresosDTO.getTotalReservas());
                row.createCell(3).setCellValue(ingresosDTO.getMes());
                row.createCell(4).setCellValue(ingresosDTO.getAnho());
            }

            try ( FileOutputStream fileOut = new FileOutputStream(rutaArchivo)) {
                workbook.write(fileOut);
            }
        }
    }
}
