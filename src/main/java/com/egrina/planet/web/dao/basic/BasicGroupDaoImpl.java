package com.egrina.planet.web.dao.basic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicGroupDaoImpl implements BasicGroupDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<BasicGroup> findAll() {
        // TODO Auto-generated method stub
        Query query = entityManager.createQuery("FROM BasicGroup");
        return query.getResultList();
    }
    
    @Override
    @Transactional(readOnly = true)
    public BasicGroup findById(Integer basicGroupCode) {
        // TODO Auto-generated method stub
        return entityManager.find(BasicGroup.class, basicGroupCode);

    }

    @Override
    @Transactional
    public void delete(Integer basicGroupCode) {
        // TODO Auto-generated method stub
        BasicGroup basisGroup = entityManager.find(BasicGroup.class, basicGroupCode);
        entityManager.remove(basisGroup);
    }
    
    @Override
    @Transactional
    public BasicGroup save(BasicGroup basicGroup) {
        // TODO Auto-generated method stub
        if (basicGroup.getBasicGroupCode() == null) {
            entityManager.persist(basicGroup);
            return basicGroup;
        } else {
            return entityManager.merge(basicGroup);
        }
    }

}
