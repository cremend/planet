package com.egrina.planet.web.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicPositionDaoImpl implements BasicPositionDao  {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(readOnly=true)
	public List<BasicPosition> findAll() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("FROM BasicPosition");
		
		return query.getResultList();
	}

	@Override
	@Transactional(readOnly=true)
	public BasicPosition findById(Integer basicPositionCode) {
		// TODO Auto-generated method stub
		return entityManager.find(BasicPosition.class, basicPositionCode);
		
	}

	@Override
	@Transactional(readOnly=true)
	public void delete(Integer basicPositionCode) {
		// TODO Auto-generated method stub
		BasicPosition basisPosition = entityManager.find(BasicPosition.class, basicPositionCode);
		entityManager.remove(basisPosition);
	}

	@Override
	@Transactional(readOnly=true)
	public BasicPosition save(BasicPosition basicPosition) {
		// TODO Auto-generated method stub
		if(basicPosition.getBasicPositionCode() == null){
			entityManager.persist(basicPosition);
			return basicPosition;
		}else{
			return entityManager.merge(basicPosition);
		}
	}

}
