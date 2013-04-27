package com.egrina.planet.web.dao.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.emp.EmpHolidayApply;;

@Repository
public class EmpHolidayApplyDaoImpl implements EmpHolidayApplyDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpHolidayApply> findAll() {
        Query query = entityManager.createQuery("FROM EmpHolidayApply");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpHolidayApply findById(Integer empHolidayApplyPk) {
        return entityManager.find(EmpHolidayApply.class, empHolidayApplyPk);
    }

    @Override
    @Transactional
    public void delete(Integer empHolidayApplyPk) {
        EmpHolidayApply empHolidayApply = entityManager.find(EmpHolidayApply.class, empHolidayApplyPk);
        entityManager.remove(empHolidayApply);
    }

    @Override
    @Transactional
    public EmpHolidayApply save(EmpHolidayApply empHolidayApply) {
        if (empHolidayApply.getEmpHolydayApplyPk() == null) {
            entityManager.persist(empHolidayApply);
            return empHolidayApply;
        } else {
            return entityManager.merge(empHolidayApply);
        }
    }
}