package com.hotel.imperial.jpa;

import com.hotel.imperial.entidades.Habitacion;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.hotel.imperial.entidades.Reserva_Habitacion;
import com.hotel.imperial.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class HabitacionJpaController implements Serializable {

    public HabitacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public HabitacionJpaController() {
        emf = Persistence.createEntityManagerFactory("imperialJPAPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Habitacion habitacion) {
        if (habitacion.getReserva_habitacion() == null) {
            habitacion.setReserva_habitacion(new ArrayList<Reserva_Habitacion>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Reserva_Habitacion> attachedReserva_habitacion = new ArrayList<Reserva_Habitacion>();
            for (Reserva_Habitacion reserva_habitacionReserva_HabitacionToAttach : habitacion.getReserva_habitacion()) {
                reserva_habitacionReserva_HabitacionToAttach = em.getReference(reserva_habitacionReserva_HabitacionToAttach.getClass(), reserva_habitacionReserva_HabitacionToAttach.getReserva_habitacion_id());
                attachedReserva_habitacion.add(reserva_habitacionReserva_HabitacionToAttach);
            }
            habitacion.setReserva_habitacion(attachedReserva_habitacion);
            em.persist(habitacion);
            for (Reserva_Habitacion reserva_habitacionReserva_Habitacion : habitacion.getReserva_habitacion()) {
                Habitacion oldHabitacionOfReserva_habitacionReserva_Habitacion = reserva_habitacionReserva_Habitacion.getHabitacion();
                reserva_habitacionReserva_Habitacion.setHabitacion(habitacion);
                reserva_habitacionReserva_Habitacion = em.merge(reserva_habitacionReserva_Habitacion);
                if (oldHabitacionOfReserva_habitacionReserva_Habitacion != null) {
                    oldHabitacionOfReserva_habitacionReserva_Habitacion.getReserva_habitacion().remove(reserva_habitacionReserva_Habitacion);
                    oldHabitacionOfReserva_habitacionReserva_Habitacion = em.merge(oldHabitacionOfReserva_habitacionReserva_Habitacion);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Habitacion habitacion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Habitacion persistentHabitacion = em.find(Habitacion.class, habitacion.getHabitacion_id());
            List<Reserva_Habitacion> reserva_habitacionOld = persistentHabitacion.getReserva_habitacion();
            List<Reserva_Habitacion> reserva_habitacionNew = habitacion.getReserva_habitacion();
            List<Reserva_Habitacion> attachedReserva_habitacionNew = new ArrayList<Reserva_Habitacion>();
            for (Reserva_Habitacion reserva_habitacionNewReserva_HabitacionToAttach : reserva_habitacionNew) {
                reserva_habitacionNewReserva_HabitacionToAttach = em.getReference(reserva_habitacionNewReserva_HabitacionToAttach.getClass(), reserva_habitacionNewReserva_HabitacionToAttach.getReserva_habitacion_id());
                attachedReserva_habitacionNew.add(reserva_habitacionNewReserva_HabitacionToAttach);
            }
            reserva_habitacionNew = attachedReserva_habitacionNew;
            habitacion.setReserva_habitacion(reserva_habitacionNew);
            habitacion = em.merge(habitacion);
            for (Reserva_Habitacion reserva_habitacionOldReserva_Habitacion : reserva_habitacionOld) {
                if (!reserva_habitacionNew.contains(reserva_habitacionOldReserva_Habitacion)) {
                    reserva_habitacionOldReserva_Habitacion.setHabitacion(null);
                    reserva_habitacionOldReserva_Habitacion = em.merge(reserva_habitacionOldReserva_Habitacion);
                }
            }
            for (Reserva_Habitacion reserva_habitacionNewReserva_Habitacion : reserva_habitacionNew) {
                if (!reserva_habitacionOld.contains(reserva_habitacionNewReserva_Habitacion)) {
                    Habitacion oldHabitacionOfReserva_habitacionNewReserva_Habitacion = reserva_habitacionNewReserva_Habitacion.getHabitacion();
                    reserva_habitacionNewReserva_Habitacion.setHabitacion(habitacion);
                    reserva_habitacionNewReserva_Habitacion = em.merge(reserva_habitacionNewReserva_Habitacion);
                    if (oldHabitacionOfReserva_habitacionNewReserva_Habitacion != null && !oldHabitacionOfReserva_habitacionNewReserva_Habitacion.equals(habitacion)) {
                        oldHabitacionOfReserva_habitacionNewReserva_Habitacion.getReserva_habitacion().remove(reserva_habitacionNewReserva_Habitacion);
                        oldHabitacionOfReserva_habitacionNewReserva_Habitacion = em.merge(oldHabitacionOfReserva_habitacionNewReserva_Habitacion);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = habitacion.getHabitacion_id();
                if (findHabitacion(id) == null) {
                    throw new NonexistentEntityException("The habitacion with id " + id + " no longer exists.");
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
            Habitacion habitacion;
            try {
                habitacion = em.getReference(Habitacion.class, id);
                habitacion.getHabitacion_id();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The habitacion with id " + id + " no longer exists.", enfe);
            }
            List<Reserva_Habitacion> reserva_habitacion = habitacion.getReserva_habitacion();
            for (Reserva_Habitacion reserva_habitacionReserva_Habitacion : reserva_habitacion) {
                reserva_habitacionReserva_Habitacion.setHabitacion(null);
                reserva_habitacionReserva_Habitacion = em.merge(reserva_habitacionReserva_Habitacion);
            }
            em.remove(habitacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Habitacion> findHabitacionEntities() {
        return findHabitacionEntities(true, -1, -1);
    }

    public List<Habitacion> findHabitacionEntities(int maxResults, int firstResult) {
        return findHabitacionEntities(false, maxResults, firstResult);
    }

    private List<Habitacion> findHabitacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Habitacion.class));
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

    public Habitacion findHabitacion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Habitacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getHabitacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Habitacion> rt = cq.from(Habitacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    //**************** métodos propios ****************
    public Habitacion buscarHabitacionPorTipo(String tipoHabitacion) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Habitacion> query
                    = em.createQuery("SELECT h FROM Habitacion h WHERE h.tipo_habitacion = :tipo", Habitacion.class);
            query.setParameter("tipo", tipoHabitacion);
            return query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            em.close();
        }
    }
}
