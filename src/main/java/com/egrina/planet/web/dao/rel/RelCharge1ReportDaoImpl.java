package com.egrina.planet.web.dao.rel;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.egrina.planet.web.entity.rel.RelCharge1Report;

public class RelCharge1ReportDaoImpl implements RelCharge1ReportDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<RelCharge1Report> findAll() {
        Query query = entityManager.createQuery("FROM RelCharge1Report");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public RelCharge1Report findById(Integer relCharge1ReportPk) {
        return entityManager.find(RelCharge1Report.class, relCharge1ReportPk);
    }

    @Override
    @Transactional
    public void delete(Integer relCharge1ReportPk) {
        RelCharge1Report relCharge1Report = entityManager.find(RelCharge1Report.class, relCharge1ReportPk);
        entityManager.remove(relCharge1Report);
    }

    @Override
    @Transactional
    public RelCharge1Report save(RelCharge1Report relCharge1Report) {
        if (relCharge1Report.getRelCharge1ReportPk() == null) {
            entityManager.persist(relCharge1Report);
            return relCharge1Report;
        } else {
            return entityManager.merge(relCharge1Report);
        }
    }
}