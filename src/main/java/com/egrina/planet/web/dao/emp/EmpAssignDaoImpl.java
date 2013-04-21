package com.egrina.planet.web.dao.emp;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.emp.EmpAssign;

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
}