package com.egrina.planet.web.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egrina.planet.web.entity.basic.*;

@Repository
public class BasicTeamDaoImpl {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional(readOnly=true)
	public List<BasicTeam> findAll() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("FROM BasicTeam");
		
		return query.getResultList();
	}

	@Transactional(readOnly=true)
	public BasicTeam findById(Integer basicTeamCode) {
		// TODO Auto-generated method stub
		return entityManager.find(BasicTeam.class, basicTeamCode);
		
	}

	@Transactional(readOnly=true)
	public void delete(Integer basicTeamCode) {
		// TODO Auto-generated method stub
		BasicTeam basisTeam = entityManager.find(BasicTeam.class, basicTeamCode);
		entityManager.remove(basisTeam);
	}

	@Transactional(readOnly=true)
	public BasicTeam save(BasicTeam basicTeam) {
		// TODO Auto-generated method stub
		if(basicTeam.getBasicTeamCode() == null){
			entityManager.persist(basicTeam);
			return basicTeam;
		}else{
			return entityManager.merge(basicTeam);
		}
	}

}
