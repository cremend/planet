package com.egrina.planet.web.dao.basic;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.BasicTech;

@Repository
public class BasicTechDaoImpl implements BasicTechDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<BasicTech> findAll() {
        Query query = entityManager.createQuery("FROM BasicTech");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public BasicTech findById(Integer basicTechCode) {
        return entityManager.find(BasicTech.class, basicTechCode);
    }

    @Override
    @Transactional
    public void delete(Integer basicTechCode) {
        BasicTech basicTech = entityManager.find(BasicTech.class, basicTechCode);
        entityManager.remove(basicTech);
    }

    @Override
    @Transactional
    public BasicTech save(BasicTech basicTech) {
        if (basicTech.getBasicTechCode() == null) {
            entityManager.persist(basicTech);
            return basicTech;
        } else {
            return entityManager.merge(basicTech);
        }
    }
}