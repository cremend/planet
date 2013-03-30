package com.egrina.planet.web.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicDutyDaoImpl {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional(readOnly=true)
	public List<BasicDuty> findAll() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("FROM BasicDuty");
		
		return query.getResultList();
	}

	@Transactional(readOnly=true)
	public BasicDuty findById(Integer basicDutyCode) {
		// TODO Auto-generated method stub
		return entityManager.find(BasicDuty.class, basicDutyCode);
		
	}

	@Transactional(readOnly=true)
	public void delete(Integer basicDutyCode) {
		// TODO Auto-generated method stub
		BasicDuty basisDuty = entityManager.find(BasicDuty.class, basicDutyCode);
		entityManager.remove(basisDuty);
	}

	@Transactional(readOnly=true)
	public BasicDuty save(BasicDuty basicDuty) {
		// TODO Auto-generated method stub
		if(basicDuty.getBasicDutyCode() == null){
			entityManager.persist(basicDuty);
			return basicDuty;
		}else{
			return entityManager.merge(basicDuty);
		}
	}

}
