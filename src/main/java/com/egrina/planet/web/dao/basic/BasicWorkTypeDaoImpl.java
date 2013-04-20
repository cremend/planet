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
        // TODO Auto-generated method stub
        Query query = entityManager.createQuery("FROM BasicWorkType");

        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public BasicWorkType findById(Integer basicWorkTypeCode) {
        // TODO Auto-generated method stub
        return entityManager.find(BasicWorkType.class, basicWorkTypeCode);

    }

    @Override
    @Transactional
    public void delete(Integer basicWorkTypeCode) {
        // TODO Auto-generated method stub
        BasicWorkType basisWorkType = entityManager.find(BasicWorkType.class, basicWorkTypeCode);
        entityManager.remove(basisWorkType);
    }

    @Override
    @Transactional
    public BasicWorkType save(BasicWorkType basicWorkType) {
        // TODO Auto-generated method stub
        if (basicWorkType.getBasicWorkTypeCode() == null) {
            entityManager.persist(basicWorkType);
            return basicWorkType;
        } else {
            return entityManager.merge(basicWorkType);
        }
    }

}
