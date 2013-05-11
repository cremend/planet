package com.egrina.planet.web.dao.emp;

import java.util.List;

import com.egrina.planet.web.entity.emp.EmpInfo;
import com.egrina.planet.web.entity.emp.EmpResidence;

public interface EmpResidenceDao {

    public List<EmpResidence> findAll();

    public EmpResidence findById(Integer empResidencePk);

    public void delete(Integer empResidencePk);

    public EmpResidence save(EmpResidence empResidence);
    
    public EmpResidence findLatest();
}
