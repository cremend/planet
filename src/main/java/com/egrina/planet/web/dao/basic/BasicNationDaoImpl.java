package com.egrina.planet.web.dao.basic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicNationDaoImpl {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<BasicNation> findAll() {
        // TODO Auto-generated method stub
        Query query = entityManager.createQuery("FROM BasicNation");
        return query.getResultList();
    }

    @Transactional(readOnly = true)
    public BasicNation findById(Integer BasicNationCode) {
        // TODO Auto-generated method stub
        return entityManager.find(BasicNation.class, BasicNationCode);

    }

    @Transactional(readOnly = true)
    public void delete(Integer BasicNationCode) {
        // TODO Auto-generated method stub
        BasicNation basisGroup = entityManager.find(BasicNation.class, BasicNationCode);
        entityManager.remove(basisGroup);
    }

    @Transactional(readOnly = true)
    public BasicNation save(BasicNation BasicNation) {
        // TODO Auto-generated method stub
        if (BasicNation.getBasicNationCode() == null) {
            entityManager.persist(BasicNation);
            return BasicNation;
        } else {
            return entityManager.merge(BasicNation);
        }
    }

}
