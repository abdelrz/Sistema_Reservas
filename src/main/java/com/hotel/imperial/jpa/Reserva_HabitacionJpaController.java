package com.hotel.imperial.jpa;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.hotel.imperial.entidades.Reserva;
import com.hotel.imperial.entidades.Habitacion;
import com.hotel.imperial.entidades.Reserva_Habitacion;
import com.hotel.imperial.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Reserva_HabitacionJpaController implements Serializable {

    public Reserva_HabitacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public Reserva_HabitacionJpaController() {
        emf = Persistence.createEntityManagerFactory("imperialJPAPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Reserva_Habitacion reserva_Habitacion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Reserva reserva = reserva_Habitacion.getReserva();
            if (reserva != null) {
                reserva = em.getReference(reserva.getClass(), reserva.getReserva_id());
                reserva_Habitacion.setReserva(reserva);
            }
            Habitacion habitacion = reserva_Habitacion.getHabitacion();
            if (habitacion != null) {
                habitacion = em.getReference(habitacion.getClass(), habitacion.getHabitacion_id());
                reserva_Habitacion.setHabitacion(habitacion);
            }
            em.persist(reserva_Habitacion);
            if (reserva != null) {
                reserva.getReserva_habitacion().add(reserva_Habitacion);
                reserva = em.merge(reserva);
            }
            if (habitacion != null) {
                habitacion.getReserva_habitacion().add(reserva_Habitacion);
                habitacion = em.merge(habitacion);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Reserva_Habitacion reserva_Habitacion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Reserva_Habitacion persistentReserva_Habitacion = em.find(Reserva_Habitacion.class, reserva_Habitacion.getReserva_habitacion_id());
            Reserva reservaOld = persistentReserva_Habitacion.getReserva();
            Reserva reservaNew = reserva_Habitacion.getReserva();
            Habitacion habitacionOld = persistentReserva_Habitacion.getHabitacion();
            Habitacion habitacionNew = reserva_Habitacion.getHabitacion();
            if (reservaNew != null) {
                reservaNew = em.getReference(reservaNew.getClass(), reservaNew.getReserva_id());
                reserva_Habitacion.setReserva(reservaNew);
            }
            if (habitacionNew != null) {
                habitacionNew = em.getReference(habitacionNew.getClass(), habitacionNew.getHabitacion_id());
                reserva_Habitacion.setHabitacion(habitacionNew);
            }
            reserva_Habitacion = em.merge(reserva_Habitacion);
            if (reservaOld != null && !reservaOld.equals(reservaNew)) {
                reservaOld.getReserva_habitacion().remove(reserva_Habitacion);
                reservaOld = em.merge(reservaOld);
            }
            if (reservaNew != null && !reservaNew.equals(reservaOld)) {
                reservaNew.getReserva_habitacion().add(reserva_Habitacion);
                reservaNew = em.merge(reservaNew);
            }
            if (habitacionOld != null && !habitacionOld.equals(habitacionNew)) {
                habitacionOld.getReserva_habitacion().remove(reserva_Habitacion);
                habitacionOld = em.merge(habitacionOld);
            }
            if (habitacionNew != null && !habitacionNew.equals(habitacionOld)) {
                habitacionNew.getReserva_habitacion().add(reserva_Habitacion);
                habitacionNew = em.merge(habitacionNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = reserva_Habitacion.getReserva_habitacion_id();
                if (findReserva_Habitacion(id) == null) {
                    throw new NonexistentEntityException("The reserva_Habitacion with id " + id + " no longer exists.");
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
            Reserva_Habitacion reserva_Habitacion;
            try {
                reserva_Habitacion = em.getReference(Reserva_Habitacion.class, id);
                reserva_Habitacion.getReserva_habitacion_id();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The reserva_Habitacion with id " + id + " no longer exists.", enfe);
            }
            Reserva reserva = reserva_Habitacion.getReserva();
            if (reserva != null) {
                reserva.getReserva_habitacion().remove(reserva_Habitacion);
                reserva = em.merge(reserva);
            }
            Habitacion habitacion = reserva_Habitacion.getHabitacion();
            if (habitacion != null) {
                habitacion.getReserva_habitacion().remove(reserva_Habitacion);
                habitacion = em.merge(habitacion);
            }
            em.remove(reserva_Habitacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Reserva_Habitacion> findReserva_HabitacionEntities() {
        return findReserva_HabitacionEntities(true, -1, -1);
    }

    public List<Reserva_Habitacion> findReserva_HabitacionEntities(int maxResults, int firstResult) {
        return findReserva_HabitacionEntities(false, maxResults, firstResult);
    }

    private List<Reserva_Habitacion> findReserva_HabitacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Reserva_Habitacion.class));
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

    public Reserva_Habitacion findReserva_Habitacion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Reserva_Habitacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getReserva_HabitacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Reserva_Habitacion> rt = cq.from(Reserva_Habitacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
