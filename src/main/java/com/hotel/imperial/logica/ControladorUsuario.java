package com.hotel.imperial.logica;

import com.hotel.imperial.seguridad.PasswordManager;
import com.hotel.imperial.entidades.Usuario;
import com.hotel.imperial.persistencia.ControladorPersistenciaUsuario;

public class ControladorUsuario {

    ControladorPersistenciaUsuario controladorPersistenciaUsuario = new ControladorPersistenciaUsuario();

    public void registrarUsuario(String username, String password) {
        
        byte[] salt = PasswordManager.generateSalt();

        String hashedPassword = PasswordManager.encryptPassword(password, salt);

        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setPassword(hashedPassword);
        usuario.setSalt(salt);

        controladorPersistenciaUsuario.guardarUsuario(usuario);
    }

    public boolean verificarContrasenha(String password) {
        return controladorPersistenciaUsuario.verificarContrasenha(password);
    }

    public boolean verificarExistenciaUsuario(String usuario) {
        return controladorPersistenciaUsuario.verificarExistenciaUsuario(usuario);
    }

}
