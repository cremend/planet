package com.egrina.planet.web.dao.basic;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicPositionDaoImpl implements BasicPositionDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<BasicPosition> findAll() {
        Query query = entityManager.createQuery("FROM BasicPosition");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public BasicPosition findById(Integer basicPositionCode) {
        return entityManager.find(BasicPosition.class, basicPositionCode);
    }

    @Override
    @Transactional
    public void delete(Integer basicPositionCode) {
        BasicPosition basisPosition = entityManager.find(BasicPosition.class, basicPositionCode);
        entityManager.remove(basisPosition);
    }

    @Override
    @Transactional
    public BasicPosition save(BasicPosition basicPosition) {
        if (basicPosition.getBasicPositionCode() == null) {
            entityManager.persist(basicPosition);
            return basicPosition;
        } else {
            return entityManager.merge(basicPosition);
        }
    }
}