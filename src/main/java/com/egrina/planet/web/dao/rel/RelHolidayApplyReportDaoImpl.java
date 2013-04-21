package com.egrina.planet.web.dao.rel;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.rel.RelHolidayApplyReport;

public class RelHolidayApplyReportDaoImpl implements RelHolidayApplyReportDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<RelHolidayApplyReport> findAll() {
        Query query = entityManager.createQuery("FROM RelHolidayApplyReport");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public RelHolidayApplyReport findById(Integer relHolidayApplyReportPk) {
        return entityManager.find(RelHolidayApplyReport.class, relHolidayApplyReportPk);
    }

    @Override
    @Transactional
    public void delete(Integer relCharge1ReportPk) {
        RelHolidayApplyReport relCharge1Report = entityManager.find(RelHolidayApplyReport.class, relCharge1ReportPk);
        entityManager.remove(relCharge1Report);
    }

    @Override
    @Transactional
    public RelHolidayApplyReport save(RelHolidayApplyReport relHolidayApplyReport) {
        if (relHolidayApplyReport.getRelHolidayApplyReportPk() == null) {
            entityManager.persist(relHolidayApplyReport);
            return relHolidayApplyReport;
        } else {
            return entityManager.merge(relHolidayApplyReport);
        }
    }
}