package com.egrina.planet.web.dao.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.egrina.planet.web.entity.emp.EmpPassport;
import com.egrina.planet.web.entity.emp.EmpPosition;

@Repository
public class EmpPositionDaoImpl implements EmpPositionDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpPosition> findAll() {
        Query query = entityManager.createQuery("FROM EmpPosition");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpPosition findById(Integer empPositionPk) {
        return entityManager.find(EmpPosition.class, empPositionPk);
    }

    @Override
    @Transactional
    public void delete(Integer empPositionPk) {
        EmpPosition empPosition = entityManager.find(EmpPosition.class, empPositionPk);
        entityManager.remove(empPosition);
    }

    @Override
    @Transactional
    public EmpPosition save(EmpPosition empPosition) {
        if (empPosition.getEmpPositionPk() == null) {
            entityManager.persist(empPosition);
            return empPosition;
        } else {
            return entityManager.merge(empPosition);
        }
    }
    
    @Override
    public EmpPosition findLatest() {
        Query query = entityManager.createQuery("FROM EmpPosition AS a ORDER BY a.empPositionPk DESC");
        query.setMaxResults(1);
        return (EmpPosition) query.getSingleResult();
    }
}
