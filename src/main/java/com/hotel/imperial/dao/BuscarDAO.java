package com.hotel.imperial.dao;

import com.hotel.imperial.entidades.Cliente;
import com.hotel.imperial.entidades.Pago;
import com.hotel.imperial.entidades.Reserva;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BuscarDAO implements Serializable {

    public BuscarDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public BuscarDAO() {
        emf = Persistence.createEntityManagerFactory("imperialJPAPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public List<Cliente> buscarClientesPorDni(String dni) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM Cliente c WHERE c.dni = :dni");
            query.setParameter("dni", dni);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Reserva> buscarReservasPorDni(String dni) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT r FROM Reserva r WHERE r.cliente.dni = :dni");
            query.setParameter("dni", dni);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Pago> buscarPagosPorDni(String dni) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT p FROM Pago p WHERE p.reserva.cliente.dni = :dni");
            query.setParameter("dni", dni);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

}
