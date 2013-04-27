package com.egrina.planet.web.dao.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.egrina.planet.web.entity.emp.EmpPass;

@Repository
public class EmpPassDaoImpl implements EmpPassDao{

        @PersistenceContext
        private EntityManager entityManager;

        @Override
        @Transactional(readOnly = true)
        public List<EmpPass> findAll() {
            Query query = entityManager.createQuery("FROM EmpPass");
            return query.getResultList();
        }

        @Override
        @Transactional(readOnly = true)
        public EmpPass findById(Integer empPassPk) {
            return entityManager.find(EmpPass.class, empPassPk);
        }

        @Override
        @Transactional
        public void delete(Integer empPassPk) {
            EmpPass empPass = entityManager.find(EmpPass.class, empPassPk);
            entityManager.remove(empPass);
        }

        @Override
        @Transactional
        public EmpPass save(EmpPass empPass) {
            if (empPass.getEmpPassPk() == null) {
                entityManager.persist(empPass);
                return empPass;
            } else {
                return entityManager.merge(empPass);
            }
        }
}
