package com.egrina.planet.web.dao.basic;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicWorkTypeDaoImpl implements BasicWorkTypeDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<BasicWorkType> findAll() {
        Query query = entityManager.createQuery("FROM BasicWorkType");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public BasicWorkType findById(Integer basicWorkTypeCode) {
        return entityManager.find(BasicWorkType.class, basicWorkTypeCode);
    }

    @Override
    @Transactional
    public void delete(Integer basicWorkTypeCode) {
        BasicWorkType basisWorkType = entityManager.find(BasicWorkType.class, basicWorkTypeCode);
        entityManager.remove(basisWorkType);
    }

    @Override
    @Transactional
    public BasicWorkType save(BasicWorkType basicWorkType) {
        if (basicWorkType.getBasicWorkTypeCode() == null) {
            entityManager.persist(basicWorkType);
            return basicWorkType;
        } else {
            return entityManager.merge(basicWorkType);
        }
    }
}