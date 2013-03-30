package com.egrina.planet.web.dao.basic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicVisaDaoImpl {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<BasicVisa> findAll() {
        // TODO Auto-generated method stub
        Query query = entityManager.createQuery("FROM BasicVisa");
        return query.getResultList();
    }

    @Transactional(readOnly = true)
    public BasicVisa findById(Integer BasicVisaCode) {
        // TODO Auto-generated method stub
        return entityManager.find(BasicVisa.class, BasicVisaCode);

    }

    @Transactional(readOnly = true)
    public void delete(Integer BasicVisaCode) {
        // TODO Auto-generated method stub
        BasicVisa basisGroup = entityManager.find(BasicVisa.class, BasicVisaCode);
        entityManager.remove(basisGroup);
    }

    @Transactional(readOnly = true)
    public BasicVisa save(BasicVisa BasicVisa) {
        // TODO Auto-generated method stub
        if (BasicVisa.getBasicVisaCode() == null) {
            entityManager.persist(BasicVisa);
            return BasicVisa;
        } else {
            return entityManager.merge(BasicVisa);
        }
    }

}
