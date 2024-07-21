package com.hotel.imperial.persistencia;

import com.hotel.imperial.jpa.ClienteJpaController;
import com.hotel.imperial.entidades.Cliente;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistenciaCliente {

    ClienteJpaController clienteJpaController = new ClienteJpaController();

    public void guardarCliente(Cliente cliente) {
        clienteJpaController.create(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteJpaController.findClienteEntities();
    }

    public void eliminarCliente(int idCliente) {
        clienteJpaController.eliminarClienteYAsociaciones(idCliente);
    }

    public Cliente listarCliente(int idCliente) {
        return clienteJpaController.findCliente(idCliente);
    }

    public void modificarCliente(Cliente cliente) {
        try {
            clienteJpaController.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente buscarClientePorDni(String dni) {
        return clienteJpaController.buscarClientePorDni(dni);
    }

    public Cliente buscarClientePorTelefono(String telefono) {
        return clienteJpaController.buscarClientePorTelefono(telefono);
    }

    public Cliente buscarClientePorCorreo(String correo) {
        return clienteJpaController.buscarClientePorCorreo(correo);
    }

}
