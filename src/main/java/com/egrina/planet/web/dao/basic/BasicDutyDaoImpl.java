package com.egrina.planet.web.dao.basic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicDutyDaoImpl implements BasicDutyDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<BasicDuty> findAll() {
        // TODO Auto-generated method stub
        Query query = entityManager.createQuery("FROM BasicDuty");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public BasicDuty findById(Integer basicDutyCode) {
        // TODO Auto-generated method stub
        return entityManager.find(BasicDuty.class, basicDutyCode);

    }

    @Override
    @Transactional
    public void delete(Integer basicDutyCode) {
        // TODO Auto-generated method stub
        BasicDuty basisDuty = entityManager.find(BasicDuty.class, basicDutyCode);
        entityManager.remove(basisDuty);
    }

    @Override
    @Transactional
    public BasicDuty save(BasicDuty basicDuty) {
        // TODO Auto-generated method stub
        if (basicDuty.getBasicDutyCode() == null) {
            entityManager.persist(basicDuty);
            return basicDuty;
        } else {
            return entityManager.merge(basicDuty);
        }
    }

}
