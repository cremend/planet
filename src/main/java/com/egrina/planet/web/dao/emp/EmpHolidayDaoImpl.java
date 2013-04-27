package com.egrina.planet.web.dao.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.emp.EmpHoliday;

@Repository
public class EmpHolidayDaoImpl implements EmpHolidayDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpHoliday> findAll() {
        Query query = entityManager.createQuery("FROM EmpHoliday");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpHoliday findById(Integer empHolidayPk) {
        return entityManager.find(EmpHoliday.class, empHolidayPk);
    }

    @Override
    @Transactional
    public void delete(Integer empHolidayPk) {
        EmpHoliday empHoliday = entityManager.find(EmpHoliday.class, empHolidayPk);
        entityManager.remove(empHoliday);
    }

    @Override
    @Transactional
    public EmpHoliday save(EmpHoliday empHoliday) {
        if (empHoliday.getEmpHolidayPk() == null) {
            entityManager.persist(empHoliday);
            return empHoliday;
        } else {
            return entityManager.merge(empHoliday);
        }
    }
}