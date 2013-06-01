package com.egrina.planet.web.dao.emp;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.emp.EmpAssign;


@Repository
public class EmpAssignDaoImpl implements EmpAssignDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpAssign> findAll() {
        Query query = entityManager.createQuery("FROM EmpAssign");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpAssign findById(Integer empAssignPk) {
        return entityManager.find(EmpAssign.class, empAssignPk);
    }

    @Override
    @Transactional
    public void delete(Integer empAssignPk) {
        EmpAssign empAssign = entityManager.find(EmpAssign.class, empAssignPk);
        entityManager.remove(empAssign);
    }

    @Override
    @Transactional
    public EmpAssign save(EmpAssign empAssign) {
        if (empAssign.getEmpAssignPk() == null) {
            entityManager.persist(empAssign);
            return empAssign;
        } else {
            return entityManager.merge(empAssign);
        }
    }
    
    @Override
    public EmpAssign findLatest(){
        Query query = entityManager.createQuery("FROM EmpAssign AS a ORDER BY a.empAssignPk DESC");
        query.setMaxResults(1);
        return (EmpAssign) query.getSingleResult();
    }
    
    @Override
    public List<EmpAssign> findAllByEmpCode(String empCode) {
        Query query = entityManager.createQuery("FROM EmpAssign AS a WHERE a.empInfo.empCode = :empCode ORDER BY a.empAssignPk");
        query.setParameter("empCode", empCode);
        return query.getResultList();
    }
}