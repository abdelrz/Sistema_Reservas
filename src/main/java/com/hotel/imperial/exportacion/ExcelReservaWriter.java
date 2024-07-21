package com.hotel.imperial.exportacion;

import com.hotel.imperial.entidades.Reserva;
import com.hotel.imperial.entidades.Reserva_Habitacion;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReservaWriter {

    public void exportarDatosAExcel(List<Reserva> datos, String rutaArchivo) throws IOException {
        try ( Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = (Sheet) workbook.createSheet("Datos");

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("DNI");
            headerRow.createCell(1).setCellValue("Llegada");
            headerRow.createCell(2).setCellValue("Salida");
            headerRow.createCell(3).setCellValue("Hospedados");
            headerRow.createCell(4).setCellValue("Habitación");
            headerRow.createCell(5).setCellValue("Habitación");
            headerRow.createCell(6).setCellValue("Habitación");

            for (int i = 0; i < datos.size(); i++) {
                Row row = sheet.createRow(i + 1);
                Reserva reserva = datos.get(i);

                row.createCell(0).setCellValue(reserva.getCliente().getDni());
                row.createCell(1).setCellValue(reserva.getFecha_llegada());
                row.createCell(2).setCellValue(reserva.getFecha_salida());
                row.createCell(3).setCellValue(reserva.getNumero_hospedados());

                List<Reserva_Habitacion> reservaHabitaciones = reserva.getReserva_habitacion();
                for (int j = 0; j < 3; j++) {
                    if (j < reservaHabitaciones.size()) {
                        row.createCell(4 + j).setCellValue(reservaHabitaciones.get(j).getHabitacion().getTipo_habitacion());
                    } else {
                        row.createCell(4 + j).setCellValue("");
                    }
                }
            }

            try ( FileOutputStream fileOut = new FileOutputStream(rutaArchivo)) {
                workbook.write(fileOut);
            }
        }
    }
}
