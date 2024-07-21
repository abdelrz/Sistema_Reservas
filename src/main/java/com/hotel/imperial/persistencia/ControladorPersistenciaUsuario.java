package com.hotel.imperial.persistencia;

import com.hotel.imperial.entidades.Usuario;
import com.hotel.imperial.seguridad.PasswordManager;
import com.hotel.imperial.jpa.UsuarioJpaController;
import java.util.Base64;
import java.util.List;

public class ControladorPersistenciaUsuario {

    UsuarioJpaController usuarioJpaController = new UsuarioJpaController();

    public void guardarUsuario(Usuario usuario) {
        usuarioJpaController.create(usuario);
    }

    public boolean verificarContrasenha(String password) {
        List<Usuario> usuarios = usuarioJpaController.findUsuarioEntities();

        for (Usuario usuario : usuarios) {
            byte[] salt = Base64.getDecoder().decode(usuario.getSalt());
            String hashedPassword = PasswordManager.encryptPassword(password, salt);
            if (hashedPassword.equals(usuario.getPassword())) {
                return true;
            }
        }

        return false;
    }

    public boolean verificarExistenciaUsuario(String usuario) {
        return usuarioJpaController.buscarUsuarioPorNombre(usuario) != null;
    }

}
