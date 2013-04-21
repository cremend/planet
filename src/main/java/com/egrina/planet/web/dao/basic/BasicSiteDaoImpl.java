package com.egrina.planet.web.dao.basic;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicSiteDaoImpl implements BasicSiteDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<BasicSite> findAll() {
        Query query = entityManager.createQuery("FROM BasicSite");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public BasicSite findById(Integer basicSiteCode) {
        return entityManager.find(BasicSite.class, basicSiteCode);
    }

    @Override
    @Transactional
    public void delete(Integer basicSiteCode) {
        BasicSite basisSite = entityManager.find(BasicSite.class, basicSiteCode);
        entityManager.remove(basisSite);
    }

    @Override
    @Transactional
    public BasicSite save(BasicSite basicSite) {
        if (basicSite.getBasicSiteCode() == null) {
            entityManager.persist(basicSite);
            return basicSite;
        } else {
            return entityManager.merge(basicSite);
        }
    }
}