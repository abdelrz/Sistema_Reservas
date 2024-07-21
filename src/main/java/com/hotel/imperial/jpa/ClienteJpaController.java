package com.hotel.imperial.jpa;

import com.hotel.imperial.entidades.Cliente;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.hotel.imperial.entidades.Reserva;
import com.hotel.imperial.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ClienteJpaController() {
        emf = Persistence.createEntityManagerFactory("imperialJPAPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) {
        if (cliente.getReserva() == null) {
            cliente.setReserva(new ArrayList<Reserva>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Reserva> attachedReserva = new ArrayList<Reserva>();
            for (Reserva reservaReservaToAttach : cliente.getReserva()) {
                reservaReservaToAttach = em.getReference(reservaReservaToAttach.getClass(), reservaReservaToAttach.getReserva_id());
                attachedReserva.add(reservaReservaToAttach);
            }
            cliente.setReserva(attachedReserva);
            em.persist(cliente);
            for (Reserva reservaReserva : cliente.getReserva()) {
                Cliente oldClienteOfReservaReserva = reservaReserva.getCliente();
                reservaReserva.setCliente(cliente);
                reservaReserva = em.merge(reservaReserva);
                if (oldClienteOfReservaReserva != null) {
                    oldClienteOfReservaReserva.getReserva().remove(reservaReserva);
                    oldClienteOfReservaReserva = em.merge(oldClienteOfReservaReserva);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getCliente_id());
            List<Reserva> reservaOld = persistentCliente.getReserva();
            List<Reserva> reservaNew = cliente.getReserva();
            List<Reserva> attachedReservaNew = new ArrayList<Reserva>();
            for (Reserva reservaNewReservaToAttach : reservaNew) {
                reservaNewReservaToAttach = em.getReference(reservaNewReservaToAttach.getClass(), reservaNewReservaToAttach.getReserva_id());
                attachedReservaNew.add(reservaNewReservaToAttach);
            }
            reservaNew = attachedReservaNew;
            cliente.setReserva(reservaNew);
            cliente = em.merge(cliente);
            for (Reserva reservaOldReserva : reservaOld) {
                if (!reservaNew.contains(reservaOldReserva)) {
                    reservaOldReserva.setCliente(null);
                    reservaOldReserva = em.merge(reservaOldReserva);
                }
            }
            for (Reserva reservaNewReserva : reservaNew) {
                if (!reservaOld.contains(reservaNewReserva)) {
                    Cliente oldClienteOfReservaNewReserva = reservaNewReserva.getCliente();
                    reservaNewReserva.setCliente(cliente);
                    reservaNewReserva = em.merge(reservaNewReserva);
                    if (oldClienteOfReservaNewReserva != null && !oldClienteOfReservaNewReserva.equals(cliente)) {
                        oldClienteOfReservaNewReserva.getReserva().remove(reservaNewReserva);
                        oldClienteOfReservaNewReserva = em.merge(oldClienteOfReservaNewReserva);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cliente.getCliente_id();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getCliente_id();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            List<Reserva> reserva = cliente.getReserva();
            for (Reserva reservaReserva : reserva) {
                reservaReserva.setCliente(null);
                reservaReserva = em.merge(reservaReserva);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cliente findCliente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    //************ métodos propios ************
    public void eliminarClienteYAsociaciones(int clienteId) {
        EntityManager entityManager = null;
        try {
            entityManager = Persistence.createEntityManagerFactory("imperialJPAPU").createEntityManager();
            entityManager.getTransaction().begin();

            StoredProcedureQuery query = entityManager.createStoredProcedureQuery("eliminar_cliente_y_asociaciones");
            query.registerStoredProcedureParameter("id", Integer.class, ParameterMode.IN);
            query.setParameter("id", clienteId);
            query.execute();

            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw new RuntimeException("Error al llamar al procedimiento almacenado", ex);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    public Cliente buscarClientePorDni(String dni) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM Cliente c WHERE c.dni = :dni");
            query.setParameter("dni", dni);
            return (Cliente) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

    public Cliente buscarClientePorTelefono(String telefono) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM Cliente c WHERE c.telefono = :telefono");
            query.setParameter("telefono", telefono);
            return (Cliente) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

    public Cliente buscarClientePorCorreo(String correo) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM Cliente c WHERE c.correo = :correo");
            query.setParameter("correo", correo);
            return (Cliente) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

}
