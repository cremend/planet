package com.egrina.planet.web.dao.rel;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.rel.RelWorkTimeReport;

public class RelWorkTimeReportDaoImpl implements RelWorkTimeReportDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<RelWorkTimeReport> findAll() {
        Query query = entityManager.createQuery("FROM RelWorkTimeReport");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public RelWorkTimeReport findById(Integer relWorkTimeReportPk) {
        return entityManager.find(RelWorkTimeReport.class, relWorkTimeReportPk);
    }

    @Override
    @Transactional
    public void delete(Integer relWorkTimeReportPk) {
        RelWorkTimeReport relWorkTimeReport = entityManager.find(RelWorkTimeReport.class, relWorkTimeReportPk);
        entityManager.remove(relWorkTimeReport);
    }

    @Override
    @Transactional
    public RelWorkTimeReport save(RelWorkTimeReport relWorkTimeReport) {
        if (relWorkTimeReport.getRelWorkTimeReportPk() == null) {
            entityManager.persist(relWorkTimeReport);
            return relWorkTimeReport;
        } else {
            return entityManager.merge(relWorkTimeReport);
        }
    }
}