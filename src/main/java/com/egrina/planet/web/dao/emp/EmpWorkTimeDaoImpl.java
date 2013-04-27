package com.egrina.planet.web.dao.emp;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.emp.EmpWorkTime;

@Repository
public class EmpWorkTimeDaoImpl implements EmpWorkTimeDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpWorkTime> findAll() {
        Query query = entityManager.createQuery("FROM EmpWorkTime");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpWorkTime findById(Integer empWorkTimePk) {
        return entityManager.find(EmpWorkTime.class, empWorkTimePk);
    }

    @Override
    @Transactional
    public void delete(Integer empWorkTimePk) {
        EmpWorkTime empWorkTime = entityManager.find(EmpWorkTime.class, empWorkTimePk);
        entityManager.remove(empWorkTime);
    }

    @Override
    @Transactional
    public EmpWorkTime save(EmpWorkTime empWorkTime) {
        if (empWorkTime.getEmpWorkTimePk() == null) {
            entityManager.persist(empWorkTime);
            return empWorkTime;
        } else {
            return entityManager.merge(empWorkTime);
        }
    }
}