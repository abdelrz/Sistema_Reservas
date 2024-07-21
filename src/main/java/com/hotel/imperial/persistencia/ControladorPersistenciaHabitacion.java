package com.hotel.imperial.persistencia;

import com.hotel.imperial.entidades.Habitacion;
import com.hotel.imperial.jpa.HabitacionJpaController;

public class ControladorPersistenciaHabitacion {

    HabitacionJpaController habitacionJpaController = new HabitacionJpaController();

    public Habitacion buscarHabitacionPorTipo(String tipoHabitacion) {
        return habitacionJpaController.buscarHabitacionPorTipo(tipoHabitacion);
    }
}
