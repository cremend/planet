package com.egrina.planet.web.dao.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.egrina.planet.web.entity.emp.EmpPassport;

@Repository
public class EmpPassportDaoImpl implements EmpPassportDao{

        @PersistenceContext
        private EntityManager entityManager;

        @Override
        @Transactional(readOnly = true)
        public List<EmpPassport> findAll() {
            Query query = entityManager.createQuery("FROM EmpPassport");
            return query.getResultList();
        }

        @Override
        @Transactional(readOnly = true)
        public EmpPassport findById(Integer empPassportPk) {
            return entityManager.find(EmpPassport.class, empPassportPk);
        }

        @Override
        @Transactional
        public void delete(Integer empPassportPk) {
            EmpPassport empPassport = entityManager.find(EmpPassport.class, empPassportPk);
            entityManager.remove(empPassport);
        }

        @Override
        @Transactional
        public EmpPassport save(EmpPassport empPassport) {
            if (empPassport.getEmpPassportPk() == null) {
                entityManager.persist(empPassport);
                return empPassport;
            } else {
                return entityManager.merge(empPassport);
            }
        }
}
