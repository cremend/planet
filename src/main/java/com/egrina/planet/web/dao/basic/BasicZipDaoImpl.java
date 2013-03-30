package com.egrina.planet.web.dao.basic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicZipDaoImpl {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<BasicZip> findAll() {
        // TODO Auto-generated method stub
        Query query = entityManager.createQuery("FROM BasicZip");

        return query.getResultList();
    }

    @Transactional(readOnly = true)
    public BasicZip findById(Integer basicZipCode) {
        // TODO Auto-generated method stub
        return entityManager.find(BasicZip.class, basicZipCode);

    }

    @Transactional(readOnly = true)
    public void delete(Integer basicZipCode) {
        // TODO Auto-generated method stub
        BasicZip basisZip = entityManager.find(BasicZip.class, basicZipCode);
        entityManager.remove(basisZip);
    }

    @Transactional(readOnly = true)
    public BasicZip save(BasicZip basicZip) {
        // TODO Auto-generated method stub
        if (basicZip.getBasicZipCode() == null) {
            entityManager.persist(basicZip);
            return basicZip;
        } else {
            return entityManager.merge(basicZip);
        }
    }

}