package com.egrina.planet.web.dao.rel;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.rel.RelPassReport;

public class RelPassReportDaoImpl implements RelPassReportDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<RelPassReport> findAll() {
        Query query = entityManager.createQuery("FROM RelPassReport");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public RelPassReport findById(Integer relPassReportPk) {
        return entityManager.find(RelPassReport.class, relPassReportPk);
    }

    @Override
    @Transactional
    public void delete(Integer relPassReportPk) {
        RelPassReport relPassReport = entityManager.find(RelPassReport.class, relPassReportPk);
        entityManager.remove(relPassReport);
    }

    @Override
    @Transactional
    public RelPassReport save(RelPassReport relPassReport) {
        if (relPassReport.getRelPassReportPk() == null) {
            entityManager.persist(relPassReport);
            return relPassReport;
        } else {
            return entityManager.merge(relPassReport);
        }
    }
}