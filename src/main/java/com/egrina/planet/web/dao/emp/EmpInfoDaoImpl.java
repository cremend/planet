package com.egrina.planet.web.dao.emp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.emp.EmpInfo;

@Repository
public class EmpInfoDaoImpl implements EmpInfoDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpInfo> findAll() {
        Query query = entityManager.createQuery("FROM EmpInfo");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpInfo findById(String empCode) {
        return entityManager.find(EmpInfo.class, empCode);
    }

    @Override
    @Transactional
    public void delete(String empCode) {
        // EmpHoliday empHoliday = entityManager.find(EmpHoliday.class,
        // empHolidayPk);
        // entityManager.remove(empHoliday);
    }

    @Override
    @Transactional
    public EmpInfo save(EmpInfo empInfo) {
        return entityManager.merge(empInfo);
    }

    @Override
    public EmpInfo findLatest() {
        Query query = entityManager.createQuery("FROM EmpInfo AS a ORDER BY a.empCode DESC");
        query.setMaxResults(1);
        return (EmpInfo) query.getSingleResult();
    }

    public EmpInfo test() {
        Query query = entityManager.createQuery("FROM EmpInfo AS a ORDER BY a.empCode DESC");
        query.setMaxResults(1);
        return (EmpInfo) query.getSingleResult();
    }

}