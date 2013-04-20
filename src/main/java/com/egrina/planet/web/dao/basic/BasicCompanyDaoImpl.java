package com.egrina.planet.web.dao.basic;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicCompanyDaoImpl implements BasicCompanyDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<BasicCompany> findAll() {
        // TODO Auto-generated method stub
        Query query = entityManager.createQuery("FROM BasicCompany");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public BasicCompany findById(Integer basicCompanyCode) {
        // TODO Auto-generated method stub
        return entityManager.find(BasicCompany.class, basicCompanyCode);
    }

    @Override
    @Transactional
    public void delete(Integer basicCompanyCode) {
        // TODO Auto-generated method stub
        BasicCompany basisCompany = entityManager.find(BasicCompany.class, basicCompanyCode);
        entityManager.remove(basisCompany);
    }

    @Override
    @Transactional
    public BasicCompany save(BasicCompany basicCompany) {
        // TODO Auto-generated method stub
        if (basicCompany.getBasicCompanyCode() == null) {
            entityManager.persist(basicCompany);
            return basicCompany;
        } else {
            return entityManager.merge(basicCompany);
        }
    }

}
