package com.hotel.imperial.entidades;

import java.io.Serializable;
import java.util.Base64;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String salt;

    public void setSalt(byte[] saltBytes) {
        this.salt = Base64.getEncoder().encodeToString(saltBytes);
    }
}
