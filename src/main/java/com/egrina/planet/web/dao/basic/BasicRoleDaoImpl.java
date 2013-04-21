package com.egrina.planet.web.dao.basic;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicRoleDaoImpl implements BasicRoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<BasicRole> findAll() {
        Query query = entityManager.createQuery("FROM BasicRole");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public BasicRole findById(Integer BasicRoleCode) {
        return entityManager.find(BasicRole.class, BasicRoleCode);
    }

    @Override
    @Transactional
    public void delete(Integer BasicRoleCode) {
        BasicRole basisGroup = entityManager.find(BasicRole.class, BasicRoleCode);
        entityManager.remove(basisGroup);
    }

    @Override
    @Transactional
    public BasicRole save(BasicRole BasicRole) {
        if (BasicRole.getBasicRoleCode() == null) {
            entityManager.persist(BasicRole);
            return BasicRole;
        } else {
            return entityManager.merge(BasicRole);
        }
    }
}