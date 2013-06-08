package com.egrina.planet.web.dao.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.egrina.planet.web.entity.emp.EmpEmploy;


@Repository
public class EmpEmployDaoImpl implements EmpEmployDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpEmploy> findAll() {
        Query query = entityManager.createQuery("FROM EmpEmploy");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpEmploy findById(Integer empEmployPk) {
        return entityManager.find(EmpEmploy.class, empEmployPk);
    }

    @Override
    @Transactional
    public void delete(Integer empEmployPk) {
        EmpEmploy empEmploy = entityManager.find(EmpEmploy.class, empEmployPk);
        entityManager.remove(empEmploy);
    }

    @Override
    @Transactional
    public EmpEmploy save(EmpEmploy empEmploy) {
        if (empEmploy.getEmpEmployPk() == null) {
            entityManager.persist(empEmploy);
            return empEmploy;
        } else {
            return entityManager.merge(empEmploy);
        }
    }
    
    @Override
    public EmpEmploy findLatest(){
        Query query = entityManager.createQuery("FROM EmpEmploy AS a ORDER BY a.empEmployPk DESC");
        query.setMaxResults(1);
        return (EmpEmploy) query.getSingleResult();
    }
    
    @Override
    public List<EmpEmploy> findAllByEmpCode(String empCode) {
        Query query = entityManager.createQuery("FROM EmpEmploy AS a WHERE a.empInfo.empCode = :empCode ORDER BY a.empEmployPk");
        query.setParameter("empCode", empCode);
        return query.getResultList();
    }
}