package com.hotel.imperial.logica;

import com.hotel.imperial.entidades.Metodo_Pago;
import com.hotel.imperial.persistencia.ControladorPersistenciaMetodoPago;
import java.util.List;

public class ControladorMetodoPago {

    ControladorPersistenciaMetodoPago controladorPersistenciaMetodoPago = new ControladorPersistenciaMetodoPago();

    public List<Metodo_Pago> listarMetodoPago() {
        return controladorPersistenciaMetodoPago.listarMetodoPago();

    }

}
