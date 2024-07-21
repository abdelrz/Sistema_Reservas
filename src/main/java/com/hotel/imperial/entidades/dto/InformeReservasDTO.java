package com.hotel.imperial.entidades.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InformeReservasDTO implements Serializable {

    private int totalClientes;
    private int totalPersonasHospedadas;
    private int totalReservas;
    private int mes;
    private int anho;
}
