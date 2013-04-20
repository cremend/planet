package com.egrina.planet.web.dao.basic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.egrina.planet.web.entity.basic.BasicEmploy;;

@Repository
public class BasicEmployDaoImpl implements BasicEmployDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<BasicEmploy> findAll() {
        // TODO Auto-generated method stub
        Query query = entityManager.createQuery("FROM BasicEmploy");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public BasicEmploy findById(Integer basicEmployCode) {
        // TODO Auto-generated method stub
        return entityManager.find(BasicEmploy.class, basicEmployCode);

    }

    @Override
    @Transactional
    public void delete(Integer basicEmployCode) {
        // TODO Auto-generated method stub
        BasicEmploy basicEmploy = entityManager.find(BasicEmploy.class, basicEmployCode);
        entityManager.remove(basicEmploy);
    }

    @Override
    @Transactional
    public BasicEmploy save(BasicEmploy basicEmploy) {
        // TODO Auto-generated method stub
        if (basicEmploy.getBasicEmployCode() == null) {
            entityManager.persist(basicEmploy);
            return basicEmploy;
        } else {
            return entityManager.merge(basicEmploy);
        }
    }


}
