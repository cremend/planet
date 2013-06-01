package com.egrina.planet.web.dao.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.egrina.planet.web.entity.emp.EmpDuty;

@Repository
public class EmpDutyDaoImpl implements EmpDutyDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpDuty> findAll() {
        Query query = entityManager.createQuery("FROM EmpDuty");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpDuty findById(Integer empDutyPk) {
        return entityManager.find(EmpDuty.class, empDutyPk);
    }

    @Override
    @Transactional
    public void delete(Integer empDutyPk) {
        EmpDuty empDuty = entityManager.find(EmpDuty.class, empDutyPk);
        entityManager.remove(empDuty);
    }

    @Override
    @Transactional
    public EmpDuty save(EmpDuty empDuty) {
        if (empDuty.getEmpDutyPk() == null) {
            entityManager.persist(empDuty);
            return empDuty;
        } else {
            return entityManager.merge(empDuty);
        }
    }
    
    @Override
    public List<EmpDuty> findAllByEmpCode(String empCode) {
        Query query = entityManager.createQuery("FROM EmpDuty AS a WHERE a.empInfo.empCode = :empCode ORDER BY a.empDutyPk");
        query.setParameter("empCode", empCode);
        return query.getResultList();
    }
}