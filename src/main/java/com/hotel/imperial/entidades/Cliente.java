package com.hotel.imperial.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cliente_id;

    @Basic
    private String nombre;
    private String apellido;
    
    @Column(unique = true)
    private String dni;
    
    @Column(unique = true)
    private String telefono;
    
    @Column(unique = true)
    private String correo;

    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento; 

    @OneToMany(mappedBy = "cliente")
    private List<Reserva> reserva;

}
