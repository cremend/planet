package com.egrina.planet.web.dao.emp;

import java.util.List;

import com.egrina.planet.web.entity.emp.*;

public interface EmpCharge2Dao {

    public List<EmpCharge2> findAll();

    public EmpCharge2 findById(Integer empcharge2Pk);

    public void delete(Integer empcharge2Pk);

    public EmpCharge2 save(EmpCharge2 empChange2);
}
