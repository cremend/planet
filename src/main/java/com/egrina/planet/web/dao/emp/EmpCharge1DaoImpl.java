package com.egrina.planet.web.dao.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.egrina.planet.web.entity.emp.EmpAssign;
import com.egrina.planet.web.entity.emp.EmpCharge1;

@Repository
public class EmpCharge1DaoImpl implements EmpCharge1Dao {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpCharge1> findAll(){
        Query query = entityManager.createQuery("FROM EmpCharge1");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpCharge1 findById(Integer empCharge1Pk){
        return entityManager.find(EmpCharge1.class, empCharge1Pk);
    }

    @Override
    @Transactional
    public void delete(Integer empCharge1Pk) {
        EmpCharge1 empCharge1 = entityManager.find(EmpCharge1.class, empCharge1Pk);
        entityManager.remove(empCharge1);
    }
    @Override
    @Transactional
    public EmpCharge1 save(EmpCharge1 empCharge1){
        if(empCharge1.getEmpCharge1Pk() == null){
            entityManager.persist(empCharge1);
            return empCharge1;
        } else {
            return entityManager.merge(empCharge1);
        }
    }
}
