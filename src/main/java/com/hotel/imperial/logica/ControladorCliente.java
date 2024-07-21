package com.hotel.imperial.logica;

import com.hotel.imperial.entidades.Cliente;
import com.hotel.imperial.persistencia.ControladorPersistenciaCliente;
import java.util.Date;
import java.util.List;

public class ControladorCliente {

    ControladorPersistenciaCliente controladorPersistencia = new ControladorPersistenciaCliente();

    public void guardarCliente(String nombre, String apellido, String dni,
            String telefono, String correo, Date fecha_nacimiento) {

        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDni(dni);
        cliente.setTelefono(telefono);
        cliente.setCorreo(correo);
        cliente.setFecha_nacimiento(fecha_nacimiento);

        controladorPersistencia.guardarCliente(cliente);
    }

    public List<Cliente> listarClientes() {
        return controladorPersistencia.listarClientes();

    }

    public void eliminarCliente(int idCliente) {
        controladorPersistencia.eliminarCliente(idCliente);
    }

    public Cliente listarCliente(int idCliente) {
        return controladorPersistencia.listarCliente(idCliente);
    }

    public void modificarCliente(Cliente cliente, String nombre, String apellido, 
            String dni, String telefono, String correo, Date fecha_nacimiento) {
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDni(dni);
        cliente.setTelefono(telefono);
        cliente.setCorreo(correo);
        cliente.setFecha_nacimiento(fecha_nacimiento);

        controladorPersistencia.modificarCliente(cliente);
    }

    public Cliente buscarClientePorDni(String dni) {
        return controladorPersistencia.buscarClientePorDni(dni);
    }

    public Cliente buscarClientePorTelefono(String telefono) {
        return controladorPersistencia.buscarClientePorTelefono(telefono);
    }

    public Cliente buscarClientePorCorreo(String correo) {
        return controladorPersistencia.buscarClientePorCorreo(correo);
    }

}
