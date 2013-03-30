package com.egrina.planet.web.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicRoleDaoImpl {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional(readOnly=true)
	public List<BasicRole> findAll() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("FROM BasicRole");
		return query.getResultList();
	}

	@Transactional(readOnly=true)
	public BasicRole findById(Integer BasicRoleCode) {
		// TODO Auto-generated method stub
		return entityManager.find(BasicRole.class, BasicRoleCode);
		
	}

	@Transactional(readOnly=true)
	public void delete(Integer BasicRoleCode) {
		// TODO Auto-generated method stub
		BasicRole basisGroup = entityManager.find(BasicRole.class, BasicRoleCode);
		entityManager.remove(basisGroup);
	}

	@Transactional(readOnly=true)
	public BasicRole save(BasicRole BasicRole) {
		// TODO Auto-generated method stub
		if(BasicRole.getBasicRoleCode() == null){
			entityManager.persist(BasicRole);
			return BasicRole;
		}else{
			return entityManager.merge(BasicRole);
		}
	}

}
