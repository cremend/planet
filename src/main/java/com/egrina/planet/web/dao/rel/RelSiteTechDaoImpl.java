package com.egrina.planet.web.dao.rel;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.rel.RelSiteTech;

public class RelSiteTechDaoImpl implements RelSiteTechDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<RelSiteTech> findAll() {
        Query query = entityManager.createQuery("FROM RelSiteTech");
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public RelSiteTech findById(Integer relSiteTechPk) {
        return entityManager.find(RelSiteTech.class, relSiteTechPk);
    }

    @Override
    @Transactional
    public void delete(Integer relSiteTechPk) {
        RelSiteTech relSiteTech = entityManager.find(RelSiteTech.class, relSiteTechPk);
        entityManager.remove(relSiteTech);
    }

    @Override
    @Transactional
    public RelSiteTech save(RelSiteTech relSiteTech) {
        if (relSiteTech.getRelSiteTechPk() == null) {
            entityManager.persist(relSiteTech);
            return relSiteTech;
        } else {
            return entityManager.merge(relSiteTech);
        }
    }
}