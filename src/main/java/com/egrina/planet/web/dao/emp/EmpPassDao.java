package com.egrina.planet.web.dao.emp;

import java.util.List;

import com.egrina.planet.web.entity.emp.EmpPass;

public interface EmpPassDao {

	public List<EmpPass> findAll();
	
	public EmpPass findById(Integer empPassPk);
	
	public void delete(Integer empPassPk);
	
	public EmpPass save(EmpPass empPass);
}
