package com.egrina.planet.web.dao.basic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicSiteDaoImpl {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<BasicSite> findAll() {
        // TODO Auto-generated method stub
        Query query = entityManager.createQuery("FROM BasicSite");

        return query.getResultList();
    }

    @Transactional(readOnly = true)
    public BasicSite findById(Integer basicSiteCode) {
        // TODO Auto-generated method stub
        return entityManager.find(BasicSite.class, basicSiteCode);

    }

    @Transactional(readOnly = true)
    public void delete(Integer basicSiteCode) {
        // TODO Auto-generated method stub
        BasicSite basisSite = entityManager.find(BasicSite.class, basicSiteCode);
        entityManager.remove(basisSite);
    }

    @Transactional(readOnly = true)
    public BasicSite save(BasicSite basicSite) {
        // TODO Auto-generated method stub
        if (basicSite.getBasicSiteCode() == null) {
            entityManager.persist(basicSite);
            return basicSite;
        } else {
            return entityManager.merge(basicSite);
        }
    }

}