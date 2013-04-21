package com.egrina.planet.web.dao.rel;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.egrina.planet.web.entity.rel.RelCharge2Report;

public class RelCharge2ReportDaoImpl implements RelCharge2ReportDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<RelCharge2Report> findAll() {
        Query query = entityManager.createQuery("FROM RelCharge2Report");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public RelCharge2Report findById(Integer relCharge2ReportPk) {
        return entityManager.find(RelCharge2Report.class, relCharge2ReportPk);
    }

    @Override
    @Transactional
    public void delete(Integer relCharge2ReportPk) {
        RelCharge2Report relCharge2Report = entityManager.find(RelCharge2Report.class, relCharge2ReportPk);
        entityManager.remove(relCharge2Report);
    }

    @Override
    @Transactional
    public RelCharge2Report save(RelCharge2Report relCharge2Report) {
        if (relCharge2Report.getRelCharge2ReportPk() == null) {
            entityManager.persist(relCharge2Report);
            return relCharge2Report;
        } else {
            return entityManager.merge(relCharge2Report);
        }
    }
}