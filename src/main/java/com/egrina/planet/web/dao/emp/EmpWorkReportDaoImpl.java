package com.egrina.planet.web.dao.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.egrina.planet.web.entity.emp.EmpWorkReport;

@Repository
public class EmpWorkReportDaoImpl implements EmpWorkReportDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpWorkReport> findAll() {
        Query query = entityManager.createQuery("FROM EmpWorkReport");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpWorkReport findById(Integer empWorkReportPk) {
        return entityManager.find(EmpWorkReport.class, empWorkReportPk);
    }

    @Override
    @Transactional
    public void delete(Integer empWorkReportPk) {
        EmpWorkReport empWorkReport = entityManager.find(EmpWorkReport.class, empWorkReportPk);
        entityManager.remove(empWorkReport);
    }

    @Override
    @Transactional
    public EmpWorkReport save(EmpWorkReport empWorkReport) {
        if (empWorkReport.getEmpWorkReportPk() == null) {
            entityManager.persist(empWorkReport);
            return empWorkReport;
        } else {
            return entityManager.merge(empWorkReport);
        }
    }
}
