package com.egrina.planet.web.dao.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.emp.EmpContract;

@Repository
public class EmpContractDaoImpl implements EmpContractDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpContract> findAll() {
        Query query = entityManager.createQuery("FROM EmpContract");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpContract findById(Integer empContractPk) {
        return entityManager.find(EmpContract.class, empContractPk);
    }

    @Override
    @Transactional
    public void delete(Integer empContractPk) {
        EmpContract empContract = entityManager.find(EmpContract.class, empContractPk);
        entityManager.remove(empContract);
    }

    @Override
    @Transactional
    public EmpContract save(EmpContract empContract) {
        if (empContract.getEmpContractPk() == null) {
            entityManager.persist(empContract);
            return empContract;
        } else {
            return entityManager.merge(empContract);
        }
    }
}