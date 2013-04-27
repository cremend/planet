package com.egrina.planet.web.dao.emp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.egrina.planet.web.entity.emp.EmpHoliday;
import com.egrina.planet.web.entity.emp.EmpJoin;;

@Repository
public class EmpJoinDaoImpl implements EmpJoinDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpJoin> findAll() {
        Query query = entityManager.createQuery("FROM EmpJoin");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpJoin findById(Integer empJoinPk) {
        return entityManager.find(EmpJoin.class, empJoinPk);
    }

    @Override
    @Transactional
    public void delete(Integer empJoinPk) {
        EmpJoin empJoin = entityManager.find(EmpJoin.class, empJoinPk);
        entityManager.remove(empJoin);
    }

    @Override
    @Transactional
    public EmpJoin save(EmpJoin empJoin) {
        if (empJoin.getEmpJoinPk() == null) {
            entityManager.persist(empJoin);
            return empJoin;
        } else {
            return entityManager.merge(empJoin);
        }
    }
}