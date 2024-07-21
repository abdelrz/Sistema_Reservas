package com.hotel.imperial.jpa;

import com.hotel.imperial.entidades.Metodo_Pago;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.hotel.imperial.entidades.Pago;
import com.hotel.imperial.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Metodo_PagoJpaController implements Serializable {

    public Metodo_PagoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public Metodo_PagoJpaController() {
        emf = Persistence.createEntityManagerFactory("imperialJPAPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Metodo_Pago metodo_Pago) {
        if (metodo_Pago.getPago() == null) {
            metodo_Pago.setPago(new ArrayList<Pago>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Pago> attachedPago = new ArrayList<Pago>();
            for (Pago pagoPagoToAttach : metodo_Pago.getPago()) {
                pagoPagoToAttach = em.getReference(pagoPagoToAttach.getClass(), pagoPagoToAttach.getPago_id());
                attachedPago.add(pagoPagoToAttach);
            }
            metodo_Pago.setPago(attachedPago);
            em.persist(metodo_Pago);
            for (Pago pagoPago : metodo_Pago.getPago()) {
                Metodo_Pago oldMetodo_pagoOfPagoPago = pagoPago.getMetodo_pago();
                pagoPago.setMetodo_pago(metodo_Pago);
                pagoPago = em.merge(pagoPago);
                if (oldMetodo_pagoOfPagoPago != null) {
                    oldMetodo_pagoOfPagoPago.getPago().remove(pagoPago);
                    oldMetodo_pagoOfPagoPago = em.merge(oldMetodo_pagoOfPagoPago);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Metodo_Pago metodo_Pago) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Metodo_Pago persistentMetodo_Pago = em.find(Metodo_Pago.class, metodo_Pago.getMetodo_pago_id());
            List<Pago> pagoOld = persistentMetodo_Pago.getPago();
            List<Pago> pagoNew = metodo_Pago.getPago();
            List<Pago> attachedPagoNew = new ArrayList<Pago>();
            for (Pago pagoNewPagoToAttach : pagoNew) {
                pagoNewPagoToAttach = em.getReference(pagoNewPagoToAttach.getClass(), pagoNewPagoToAttach.getPago_id());
                attachedPagoNew.add(pagoNewPagoToAttach);
            }
            pagoNew = attachedPagoNew;
            metodo_Pago.setPago(pagoNew);
            metodo_Pago = em.merge(metodo_Pago);
            for (Pago pagoOldPago : pagoOld) {
                if (!pagoNew.contains(pagoOldPago)) {
                    pagoOldPago.setMetodo_pago(null);
                    pagoOldPago = em.merge(pagoOldPago);
                }
            }
            for (Pago pagoNewPago : pagoNew) {
                if (!pagoOld.contains(pagoNewPago)) {
                    Metodo_Pago oldMetodo_pagoOfPagoNewPago = pagoNewPago.getMetodo_pago();
                    pagoNewPago.setMetodo_pago(metodo_Pago);
                    pagoNewPago = em.merge(pagoNewPago);
                    if (oldMetodo_pagoOfPagoNewPago != null && !oldMetodo_pagoOfPagoNewPago.equals(metodo_Pago)) {
                        oldMetodo_pagoOfPagoNewPago.getPago().remove(pagoNewPago);
                        oldMetodo_pagoOfPagoNewPago = em.merge(oldMetodo_pagoOfPagoNewPago);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = metodo_Pago.getMetodo_pago_id();
                if (findMetodo_Pago(id) == null) {
                    throw new NonexistentEntityException("The metodo_Pago with id " + id + " no longer exists.");
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
            Metodo_Pago metodo_Pago;
            try {
                metodo_Pago = em.getReference(Metodo_Pago.class, id);
                metodo_Pago.getMetodo_pago_id();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The metodo_Pago with id " + id + " no longer exists.", enfe);
            }
            List<Pago> pago = metodo_Pago.getPago();
            for (Pago pagoPago : pago) {
                pagoPago.setMetodo_pago(null);
                pagoPago = em.merge(pagoPago);
            }
            em.remove(metodo_Pago);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Metodo_Pago> findMetodo_PagoEntities() {
        return findMetodo_PagoEntities(true, -1, -1);
    }

    public List<Metodo_Pago> findMetodo_PagoEntities(int maxResults, int firstResult) {
        return findMetodo_PagoEntities(false, maxResults, firstResult);
    }

    private List<Metodo_Pago> findMetodo_PagoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Metodo_Pago.class));
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

    public Metodo_Pago findMetodo_Pago(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Metodo_Pago.class, id);
        } finally {
            em.close();
        }
    }

    public int getMetodo_PagoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Metodo_Pago> rt = cq.from(Metodo_Pago.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    //********* métodos propios *********
    public Metodo_Pago buscarMetodoPagoPorNombre(String metodoPago) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Metodo_Pago> query
                    = em.createQuery("SELECT m FROM Metodo_Pago m WHERE m.metodo = :metodoPago", Metodo_Pago.class);
            query.setParameter("metodoPago", metodoPago);
            return query.getSingleResult();
        } finally {
            em.close();
        }
    }
}
