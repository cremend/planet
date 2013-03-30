package com.egrina.planet.web.dao.basic;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicTransTypeDaoImpl {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<BasicTransType> findAll() {
        Query query = entityManager.createQuery("FROM BasicTransType");
        return query.getResultList();
    }

    @Transactional(readOnly = true)
    public BasicTransType findById(Integer basicTransTypeCode) {
        return entityManager.find(BasicTransType.class, basicTransTypeCode);
    }

    @Transactional(readOnly = true)
    public void delete(Integer basicTransTypeCode) {
        BasicTransType basicTransType = entityManager.find(BasicTransType.class, basicTransTypeCode);
        entityManager.remove(basicTransType);
    }

    @Transactional(readOnly = true)
    public BasicTransType save(BasicTransType basicTransType) {
        if (basicTransType.getBasicTransTypeCode() == null) {
            entityManager.persist(basicTransType);
            return basicTransType;
        } else {
            return entityManager.merge(basicTransType);
        }
    }
}
