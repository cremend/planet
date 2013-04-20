package com.egrina.planet.web.dao.basic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicTeamDaoImpl implements BasicTeamDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<BasicTeam> findAll() {
        // TODO Auto-generated method stub
        Query query = entityManager.createQuery("FROM BasicTeam");

        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public BasicTeam findById(Integer basicTeamCode) {
        // TODO Auto-generated method stub
        return entityManager.find(BasicTeam.class, basicTeamCode);

    }

    @Override
    @Transactional
    public void delete(Integer basicTeamCode) {
        // TODO Auto-generated method stub
        BasicTeam basisTeam = entityManager.find(BasicTeam.class, basicTeamCode);
        entityManager.remove(basisTeam);
    }

    @Override
    @Transactional
    public BasicTeam save(BasicTeam basicTeam) {
        // TODO Auto-generated method stub
        if (basicTeam.getBasicTeamCode() == null) {
            entityManager.persist(basicTeam);
            return basicTeam;
        } else {
            return entityManager.merge(basicTeam);
        }
    }

}
