package com.hotel.imperial.exportacion;

import com.hotel.imperial.entidades.dto.InformeIngresosDTO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelInformeIngresosWriter {

    public void exportarDatosAExcel(List<InformeIngresosDTO> datos, String rutaArchivo) throws IOException {
        try ( Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = (Sheet) workbook.createSheet("Datos");

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Total de ingresos");
            headerRow.createCell(1).setCellValue("Ingresos por costo extra");
            headerRow.createCell(2).setCellValue("Ingresos");
            headerRow.createCell(3).setCellValue("Mes");
            headerRow.createCell(4).setCellValue("Año");

            for (int i = 0; i < datos.size(); i++) {
                Row row = sheet.createRow(i + 1);
                InformeIngresosDTO ingresosDTO = datos.get(i);

                row.createCell(0).setCellValue(ingresosDTO.getTotalIngresos());
                row.createCell(1).setCellValue(ingresosDTO.getIngresosPorDanhos());
                row.createCell(2).setCellValue(ingresosDTO.getIngresos());
                row.createCell(3).setCellValue(ingresosDTO.getMes());
                row.createCell(4).setCellValue(ingresosDTO.getAnho());
            }

            try ( FileOutputStream fileOut = new FileOutputStream(rutaArchivo)) {
                workbook.write(fileOut);
            }
        }
    }
}
