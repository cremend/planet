package com.egrina.planet.web.dao.emp;

import java.util.List;
import com.egrina.planet.web.entity.emp.*;

public interface EmpJoinDao {

	public List<EmpJoin> findAll();
	
	public EmpJoin findById(Integer empJoinPk);
	
	public void delete(Integer empJoinPk);
	
	public EmpJoin save(EmpJoin empJoin);
} 
