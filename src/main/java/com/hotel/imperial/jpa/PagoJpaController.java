package com.hotel.imperial.jpa;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.hotel.imperial.entidades.Metodo_Pago;
import com.hotel.imperial.entidades.Pago;
import com.hotel.imperial.entidades.Reparacion;
import com.hotel.imperial.persistencia.exceptions.NonexistentEntityException;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

public class PagoJpaController implements Serializable {

    public PagoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PagoJpaController() {
        emf = Persistence.createEntityManagerFactory("imperialJPAPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pago pago) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Metodo_Pago metodo_pago = pago.getMetodo_pago();
            if (metodo_pago != null) {
                metodo_pago = em.getReference(metodo_pago.getClass(), metodo_pago.getMetodo_pago_id());
                pago.setMetodo_pago(metodo_pago);
            }
            em.persist(pago);
            if (metodo_pago != null) {
                metodo_pago.getPago().add(pago);
                metodo_pago = em.merge(metodo_pago);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pago pago) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pago persistentPago = em.find(Pago.class, pago.getPago_id());
            Metodo_Pago metodo_pagoOld = persistentPago.getMetodo_pago();
            Metodo_Pago metodo_pagoNew = pago.getMetodo_pago();
            if (metodo_pagoNew != null) {
                metodo_pagoNew = em.getReference(metodo_pagoNew.getClass(), metodo_pagoNew.getMetodo_pago_id());
                pago.setMetodo_pago(metodo_pagoNew);
            }
            pago = em.merge(pago);
            if (metodo_pagoOld != null && !metodo_pagoOld.equals(metodo_pagoNew)) {
                metodo_pagoOld.getPago().remove(pago);
                metodo_pagoOld = em.merge(metodo_pagoOld);
            }
            if (metodo_pagoNew != null && !metodo_pagoNew.equals(metodo_pagoOld)) {
                metodo_pagoNew.getPago().add(pago);
                metodo_pagoNew = em.merge(metodo_pagoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = pago.getPago_id();
                if (findPago(id) == null) {
                    throw new NonexistentEntityException("The pago with id " + id + " no longer exists.");
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
            Pago pago;
            try {
                pago = em.getReference(Pago.class, id);
                pago.getPago_id();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pago with id " + id + " no longer exists.", enfe);
            }
            Metodo_Pago metodo_pago = pago.getMetodo_pago();
            if (metodo_pago != null) {
                metodo_pago.getPago().remove(pago);
                metodo_pago = em.merge(metodo_pago);
            }
            em.remove(pago);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pago> findPagoEntities() {
        return findPagoEntities(true, -1, -1);
    }

    public List<Pago> findPagoEntities(int maxResults, int firstResult) {
        return findPagoEntities(false, maxResults, firstResult);
    }

    private List<Pago> findPagoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pago.class));
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

    public Pago findPago(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pago.class, id);
        } finally {
            em.close();
        }
    }

    public int getPagoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pago> rt = cq.from(Pago.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    //*********** métodos propios **********
    public void eliminarPago(int idPago) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();

            Query query = em.createNativeQuery("CALL eliminar_pago_y_reparacion(?)");
            query.setParameter(1, idPago);
            query.executeUpdate();

            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void modificarPago(int pagoId, String dniCliente, String metodoPago, Date fechaPago,
            double montoPago, String descripcionDanios, double costoDanios) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();

            StoredProcedureQuery query = em.createStoredProcedureQuery("actualizar_pago");
            query.registerStoredProcedureParameter("id", Integer.class, ParameterMode.IN);
            query.registerStoredProcedureParameter("dniCliente", String.class, ParameterMode.IN);
            query.registerStoredProcedureParameter("metodoPago", String.class, ParameterMode.IN);
            query.registerStoredProcedureParameter("fechaPago", Date.class, ParameterMode.IN);
            query.registerStoredProcedureParameter("montoPago", Double.class, ParameterMode.IN);
            query.registerStoredProcedureParameter("descripcionDanios", String.class, ParameterMode.IN);
            query.registerStoredProcedureParameter("costoDanios", Double.class, ParameterMode.IN);
            query.setParameter("id", pagoId);
            query.setParameter("dniCliente", dniCliente);
            query.setParameter("metodoPago", metodoPago);
            query.setParameter("fechaPago", fechaPago);
            query.setParameter("montoPago", montoPago);
            query.setParameter("descripcionDanios", descripcionDanios);
            query.setParameter("costoDanios", costoDanios);
            query.execute();

            em.getTransaction().commit();

            // Para actualizar inmediatamente
            Pago pago = em.find(Pago.class, pagoId);
            em.refresh(pago);

            // Buscar la reparación asociada al pago
            Query reparacionQuery = em.createQuery("SELECT r FROM Reparacion r WHERE r.pago = :pago");
            reparacionQuery.setParameter("pago", pago);
            Reparacion reparacion = (Reparacion) reparacionQuery.getSingleResult();
            em.refresh(reparacion);

        } catch (Exception ex) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new RuntimeException("Error al modificar pago", ex);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

}
