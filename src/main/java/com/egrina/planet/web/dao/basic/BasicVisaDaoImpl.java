package com.egrina.planet.web.dao.basic;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicVisaDaoImpl implements BasicVisaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<BasicVisa> findAll() {
        Query query = entityManager.createQuery("FROM BasicVisa");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public BasicVisa findById(Integer BasicVisaCode) {
        return entityManager.find(BasicVisa.class, BasicVisaCode);
    }

    @Override
    @Transactional
    public void delete(Integer BasicVisaCode) {
        BasicVisa basisGroup = entityManager.find(BasicVisa.class, BasicVisaCode);
        entityManager.remove(basisGroup);
    }

    @Override
    @Transactional
    public BasicVisa save(BasicVisa BasicVisa) {
        if (BasicVisa.getBasicVisaCode() == null) {
            entityManager.persist(BasicVisa);
            return BasicVisa;
        } else {
            return entityManager.merge(BasicVisa);
        }
    }
}