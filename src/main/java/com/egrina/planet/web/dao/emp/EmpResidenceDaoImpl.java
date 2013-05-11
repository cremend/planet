package com.egrina.planet.web.dao.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.egrina.planet.web.entity.emp.EmpResidence;

@Repository
public class EmpResidenceDaoImpl implements EmpResidenceDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpResidence> findAll() {
        Query query = entityManager.createQuery("FROM EmpResidence");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpResidence findById(Integer empResidencePk) {
        return entityManager.find(EmpResidence.class, empResidencePk);
    }

    @Override
    @Transactional
    public void delete(Integer empResidencePk) {
        EmpResidence empResidence = entityManager.find(EmpResidence.class, empResidencePk);
        entityManager.remove(empResidence);
    }

    @Override
    @Transactional
    public EmpResidence save(EmpResidence empResidence) {
        if (empResidence.getEmpResidencePk() == null) {
            entityManager.persist(empResidence);
            return empResidence;
        } else {
            return entityManager.merge(empResidence);
        }
    }
    
    @Override
    public EmpResidence findLatest() {
        Query query = entityManager.createQuery("FROM EmpResidence AS a ORDER BY a.empResidencePk DESC");
        query.setMaxResults(1);
        return (EmpResidence) query.getSingleResult();
    }
}
