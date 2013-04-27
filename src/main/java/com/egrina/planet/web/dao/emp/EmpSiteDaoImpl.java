package com.egrina.planet.web.dao.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.egrina.planet.web.entity.emp.EmpSite;

@Repository
public class EmpSiteDaoImpl implements EmpSiteDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EmpSite> findAll() {
        Query query = entityManager.createQuery("FROM EmpSite");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpSite findById(Integer empSitePk) {
        return entityManager.find(EmpSite.class, empSitePk);
    }

    @Override
    @Transactional
    public void delete(Integer empSitePk) {
        EmpSite empSite = entityManager.find(EmpSite.class, empSitePk);
        entityManager.remove(empSite);
    }

    @Override
    @Transactional
    public EmpSite save(EmpSite empSite) {
        if (empSite.getEmpSitePk() == null) {
            entityManager.persist(empSite);
            return empSite;
        } else {
            return entityManager.merge(empSite);
        }
    }
}
