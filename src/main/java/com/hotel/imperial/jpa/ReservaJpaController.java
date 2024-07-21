package com.hotel.imperial.jpa;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.hotel.imperial.entidades.Cliente;
import com.hotel.imperial.entidades.Reserva;
import com.hotel.imperial.entidades.Reserva_Habitacion;
import com.hotel.imperial.persistencia.exceptions.NonexistentEntityException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;

public class ReservaJpaController implements Serializable {

    public ReservaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ReservaJpaController() {
        emf = Persistence.createEntityManagerFactory("imperialJPAPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Reserva reserva) {
        if (reserva.getReserva_habitacion() == null) {
            reserva.setReserva_habitacion(new ArrayList<Reserva_Habitacion>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente = reserva.getCliente();
            if (cliente != null) {
                cliente = em.getReference(cliente.getClass(), cliente.getCliente_id());
                reserva.setCliente(cliente);
            }
            List<Reserva_Habitacion> attachedReserva_habitacion = new ArrayList<Reserva_Habitacion>();
            for (Reserva_Habitacion reserva_habitacionReserva_HabitacionToAttach : reserva.getReserva_habitacion()) {
                reserva_habitacionReserva_HabitacionToAttach = em.getReference(reserva_habitacionReserva_HabitacionToAttach.getClass(), reserva_habitacionReserva_HabitacionToAttach.getReserva_habitacion_id());
                attachedReserva_habitacion.add(reserva_habitacionReserva_HabitacionToAttach);
            }
            reserva.setReserva_habitacion(attachedReserva_habitacion);
            em.persist(reserva);
            if (cliente != null) {
                cliente.getReserva().add(reserva);
                cliente = em.merge(cliente);
            }
            for (Reserva_Habitacion reserva_habitacionReserva_Habitacion : reserva.getReserva_habitacion()) {
                Reserva oldReservaOfReserva_habitacionReserva_Habitacion = reserva_habitacionReserva_Habitacion.getReserva();
                reserva_habitacionReserva_Habitacion.setReserva(reserva);
                reserva_habitacionReserva_Habitacion = em.merge(reserva_habitacionReserva_Habitacion);
                if (oldReservaOfReserva_habitacionReserva_Habitacion != null) {
                    oldReservaOfReserva_habitacionReserva_Habitacion.getReserva_habitacion().remove(reserva_habitacionReserva_Habitacion);
                    oldReservaOfReserva_habitacionReserva_Habitacion = em.merge(oldReservaOfReserva_habitacionReserva_Habitacion);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Reserva reserva) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Reserva persistentReserva = em.find(Reserva.class, reserva.getReserva_id());
            Cliente clienteOld = persistentReserva.getCliente();
            Cliente clienteNew = reserva.getCliente();
            List<Reserva_Habitacion> reserva_habitacionOld = persistentReserva.getReserva_habitacion();
            List<Reserva_Habitacion> reserva_habitacionNew = reserva.getReserva_habitacion();
            if (clienteNew != null) {
                clienteNew = em.getReference(clienteNew.getClass(), clienteNew.getCliente_id());
                reserva.setCliente(clienteNew);
            }
            List<Reserva_Habitacion> attachedReserva_habitacionNew = new ArrayList<Reserva_Habitacion>();
            for (Reserva_Habitacion reserva_habitacionNewReserva_HabitacionToAttach : reserva_habitacionNew) {
                reserva_habitacionNewReserva_HabitacionToAttach = em.getReference(reserva_habitacionNewReserva_HabitacionToAttach.getClass(), reserva_habitacionNewReserva_HabitacionToAttach.getReserva_habitacion_id());
                attachedReserva_habitacionNew.add(reserva_habitacionNewReserva_HabitacionToAttach);
            }
            reserva_habitacionNew = attachedReserva_habitacionNew;
            reserva.setReserva_habitacion(reserva_habitacionNew);
            reserva = em.merge(reserva);
            if (clienteOld != null && !clienteOld.equals(clienteNew)) {
                clienteOld.getReserva().remove(reserva);
                clienteOld = em.merge(clienteOld);
            }
            if (clienteNew != null && !clienteNew.equals(clienteOld)) {
                clienteNew.getReserva().add(reserva);
                clienteNew = em.merge(clienteNew);
            }
            for (Reserva_Habitacion reserva_habitacionOldReserva_Habitacion : reserva_habitacionOld) {
                if (!reserva_habitacionNew.contains(reserva_habitacionOldReserva_Habitacion)) {
                    reserva_habitacionOldReserva_Habitacion.setReserva(null);
                    reserva_habitacionOldReserva_Habitacion = em.merge(reserva_habitacionOldReserva_Habitacion);
                }
            }
            for (Reserva_Habitacion reserva_habitacionNewReserva_Habitacion : reserva_habitacionNew) {
                if (!reserva_habitacionOld.contains(reserva_habitacionNewReserva_Habitacion)) {
                    Reserva oldReservaOfReserva_habitacionNewReserva_Habitacion = reserva_habitacionNewReserva_Habitacion.getReserva();
                    reserva_habitacionNewReserva_Habitacion.setReserva(reserva);
                    reserva_habitacionNewReserva_Habitacion = em.merge(reserva_habitacionNewReserva_Habitacion);
                    if (oldReservaOfReserva_habitacionNewReserva_Habitacion != null && !oldReservaOfReserva_habitacionNewReserva_Habitacion.equals(reserva)) {
                        oldReservaOfReserva_habitacionNewReserva_Habitacion.getReserva_habitacion().remove(reserva_habitacionNewReserva_Habitacion);
                        oldReservaOfReserva_habitacionNewReserva_Habitacion = em.merge(oldReservaOfReserva_habitacionNewReserva_Habitacion);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = reserva.getReserva_id();
                if (findReserva(id) == null) {
                    throw new NonexistentEntityException("The reserva with id " + id + " no longer exists.");
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
            Reserva reserva;
            try {
                reserva = em.getReference(Reserva.class, id);
                reserva.getReserva_id();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The reserva with id " + id + " no longer exists.", enfe);
            }
            Cliente cliente = reserva.getCliente();
            if (cliente != null) {
                cliente.getReserva().remove(reserva);
                cliente = em.merge(cliente);
            }
            List<Reserva_Habitacion> reserva_habitacion = reserva.getReserva_habitacion();
            for (Reserva_Habitacion reserva_habitacionReserva_Habitacion : reserva_habitacion) {
                reserva_habitacionReserva_Habitacion.setReserva(null);
                reserva_habitacionReserva_Habitacion = em.merge(reserva_habitacionReserva_Habitacion);
            }
            em.remove(reserva);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Reserva> findReservaEntities() {
        return findReservaEntities(true, -1, -1);
    }

    public List<Reserva> findReservaEntities(int maxResults, int firstResult) {
        return findReservaEntities(false, maxResults, firstResult);
    }

    private List<Reserva> findReservaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Reserva.class));
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

    public Reserva findReserva(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Reserva.class, id);
        } finally {
            em.close();
        }
    }

    public int getReservaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Reserva> rt = cq.from(Reserva.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    //********* métodos propios *********
    public Reserva obtenerReservaAsociadaCliente(String dniCliente) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Reserva> query = em.createQuery("SELECT r FROM Reserva r WHERE r.cliente.dni = :dniCliente ORDER BY r.reserva_id DESC", Reserva.class);
            query.setParameter("dniCliente", dniCliente);
            query.setMaxResults(1);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

    public void eliminarReservaYAsociaciones(int idReserva) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            StoredProcedureQuery query = em.createStoredProcedureQuery("eliminar_reserva_y_asociaciones");
            query.registerStoredProcedureParameter("id_reserva", Integer.class, ParameterMode.IN);
            query.setParameter("id_reserva", idReserva);
            query.execute();
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void modificarReserva(int reservaId, String habitacionIds, LocalDateTime fechaLlegada,
            LocalDateTime fechaSalida, int numeroHospedados) {
        EntityManager em = getEntityManager();
        try {

            em.getTransaction().begin();

            StoredProcedureQuery query = em.createStoredProcedureQuery("actualizar_reserva");
            query.registerStoredProcedureParameter("id", Integer.class, ParameterMode.IN);
            query.registerStoredProcedureParameter("nueva_habitacion_ids", String.class, ParameterMode.IN);
            query.registerStoredProcedureParameter("nueva_fecha_llegada", LocalDateTime.class, ParameterMode.IN);
            query.registerStoredProcedureParameter("nueva_fecha_salida", LocalDateTime.class, ParameterMode.IN);
            query.registerStoredProcedureParameter("nuevo_numero_hospedados", Integer.class, ParameterMode.IN);
            query.setParameter("id", reservaId);
            query.setParameter("nueva_habitacion_ids", habitacionIds);
            query.setParameter("nueva_fecha_llegada", fechaLlegada);
            query.setParameter("nueva_fecha_salida", fechaSalida);
            query.setParameter("nuevo_numero_hospedados", numeroHospedados);
            query.execute();

            em.getTransaction().commit();

            // Para actualizar inmediatamente
            Reserva reserva = em.find(Reserva.class, reservaId);
            em.refresh(reserva);

        } catch (Exception ex) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new RuntimeException("Error al modificar reserva", ex);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
