package com.egrina.planet.web.dao.basic;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicJobCategoryDaoImpl implements BasicJobCategoryDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<BasicJobCategory> findAll() {
        Query query = entityManager.createQuery("FROM BasicJobCategory");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public BasicJobCategory findById(Integer basicJobCategoryCode) {
        return entityManager.find(BasicJobCategory.class, basicJobCategoryCode);
    }

    @Override
    @Transactional
    public void delete(Integer basicJobCategoryCode) {
        BasicJobCategory basicJobCategory = entityManager.find(BasicJobCategory.class, basicJobCategoryCode);
        entityManager.remove(basicJobCategory);
    }

    @Transactional
    public BasicJobCategory save(BasicJobCategory basicJobCategory) {
        if (basicJobCategory.getBasicJobCategoryCode() == null) {
            entityManager.persist(basicJobCategory);
            return basicJobCategory;
        } else {
            return entityManager.merge(basicJobCategory);
        }
    }
}
