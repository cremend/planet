package com.egrina.planet.web.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicCompanyDaoImpl {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional(readOnly=true)
	public List<BasicCompany> findAll() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("FROM BasicCompany");
		
		return query.getResultList();
	}

	@Transactional(readOnly=true)
	public BasicCompany findById(Integer basicCompanyCode) {
		// TODO Auto-generated method stub
		return entityManager.find(BasicCompany.class, basicCompanyCode);
		
	}

	@Transactional(readOnly=true)
	public void delete(Integer basicCompanyCode) {
		// TODO Auto-generated method stub
		BasicCompany basisCompany = entityManager.find(BasicCompany.class, basicCompanyCode);
		entityManager.remove(basisCompany);
	}

	@Transactional(readOnly=true)
	public BasicCompany save(BasicCompany basicCompany) {
		// TODO Auto-generated method stub
		if(basicCompany.getBasicCompanyCode() == null){
			entityManager.persist(basicCompany);
			return basicCompany;
		}else{
			return entityManager.merge(basicCompany);
		}
	}

}
