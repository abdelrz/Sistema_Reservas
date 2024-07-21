package com.hotel.imperial.entidades.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InformeIngresosDTO {

    private double ingresos;
    private double ingresosPorDanhos;
    private double totalIngresos;
    private int mes;
    private int anho;
}
