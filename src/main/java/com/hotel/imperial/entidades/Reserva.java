package com.hotel.imperial.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reserva_id;

    @Basic
    private int numero_hospedados;

    private LocalDateTime fecha_llegada;
    private LocalDateTime fecha_salida;

    @OneToMany(mappedBy = "reserva")
    private List<Reserva_Habitacion> reserva_habitacion;
    
    @ManyToOne
    private Cliente cliente;
}
