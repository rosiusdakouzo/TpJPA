/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.repositories;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Rosius
 */
public abstract class BaseRepository<T> {

    private EntityManager em;
    private String unitPersistence;
    private EntityManagerFactory emf;
    private Class entityClass;

    public BaseRepository(String unitPersistence, Class entityClass) {
        this.unitPersistence = unitPersistence;
        emf = Persistence.createEntityManagerFactory(this.unitPersistence);
        em = emf.createEntityManager();
        this.entityClass = entityClass;

    }

    /**
     * M�thode de cr�ation
     *
     * @param obj
     * @return boolean
     * @throws SQLException
     */
    public boolean create(T obj) throws SQLException {
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        return true;
    }

    /**
     * M�thode pour effacer
     *
     * @param obj
     * @return boolean
     * @throws java.sql.SQLException
     */
    public boolean delete(T obj) throws SQLException {
        em.getTransaction().begin();
        em.remove(obj);
        em.getTransaction().commit();
        return true;
    }

    /**
     * M�thode de mise � jour
     *
     * @param obj
     * @return boolean
     * @throws java.sql.SQLException
     */
    public boolean update(T obj) throws SQLException {
        em.getTransaction().begin();
        em.merge(obj);
        em.getTransaction().commit();
        return true;
    }

    /**
     * M�thode de recherche des informations
     *
     * @param propertyName
     * @param value
     * @return T
     * @throws java.sql.SQLException
     */
    public T findByProperty(String propertyName, Object value) throws SQLException {
        try {
            String className = getEntityClass().getSimpleName();
            String request = "select t from " + className + " t where t." + propertyName + "=:param";
            Query query = getEm().createQuery(request);
            query.setParameter("param", value);
            return (T) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }

    }

    /**
     * M�thode de recherche de toutes les information
     *
     * @return T
     * @throws java.sql.SQLException
     */
    public List<T> findAll() throws SQLException {
        return getEm().createQuery("select t from " + getEntityClass().getSimpleName() + " t").getResultList();
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }

    /**
     * @return the unitPersistence
     */
    public String getUnitPersistence() {
        return unitPersistence;
    }

    /**
     * @param UnitPersistence the unitPersistence to set
     */
    public void setUnitPersistence(String UnitPersistence) {
        this.unitPersistence = UnitPersistence;
    }

    /**
     * @return the emf
     */
    public EntityManagerFactory getEmf() {
        return emf;
    }

    /**
     * @param emf the emf to set
     */
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    /**
     * @return the entityClass
     */
    public Class getEntityClass() {
        return entityClass;
    }

    /**
     * @param entityClass the entityClass to set
     */
    public void setEntityClass(Class entityClass) {
        this.entityClass = entityClass;
    }
}
