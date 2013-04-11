package com.egrina.planet.web.dao.emp;

import java.util.List;

import com.egrina.planet.web.entity.emp.*;

public interface EmpContractDao {

	public List<EmpContract> findAll();

    public EmpContract findById(Integer empContractPk);

    public void delete(Integer empContractPk);

    public EmpContract save(EmpContract empContract);
}
