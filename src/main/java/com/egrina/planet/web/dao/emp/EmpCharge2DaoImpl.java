package com.egrina.planet.web.dao.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.egrina.planet.web.entity.emp.EmpAssign;
import com.egrina.planet.web.entity.emp.EmpCharge2;

@Repository
public class EmpCharge2DaoImpl implements EmpCharge2Dao {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpCharge2> findAll(){
        Query query = entityManager.createQuery("FROM EmpCharge2");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpCharge2 findById(Integer empCharge2Pk){
        return entityManager.find(EmpCharge2.class, empCharge2Pk);
    }

    @Override
    @Transactional
    public void delete(Integer empCharge2Pk) {
        EmpCharge2 empCharge2 = entityManager.find(EmpCharge2.class, empCharge2Pk);
        entityManager.remove(empCharge2);
    }
    @Override
    @Transactional
    public EmpCharge2 save(EmpCharge2 empCharge2){
        if(empCharge2.getEmpCharge2Pk() == null){
            entityManager.persist(empCharge2);
            return empCharge2;
        } else {
            return entityManager.merge(empCharge2);
        }
    }
}
