package com.egrina.planet.web.dao.emp;

import java.util.List;

import com.egrina.planet.web.entity.emp.*;

public interface EmpCharge1Dao {

	public List<EmpCharge1> findAll();

    public EmpCharge1 findById(Integer empcharge1Pk);

    public void delete(Integer empcharge1Pk);

    public EmpCharge1 save(EmpCharge1 empChange1);
}
