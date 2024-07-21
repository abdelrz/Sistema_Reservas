package com.hotel.imperial.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MenuPrincipalDAO {

    public MenuPrincipalDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public MenuPrincipalDAO() {
        emf = Persistence.createEntityManagerFactory("imperialJPAPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Double mostrarTotalIngresos() {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT SUM(p.pago) FROM Pago p");
            Double totalIngresos = (Double) query.getSingleResult();
            return totalIngresos;
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

}
