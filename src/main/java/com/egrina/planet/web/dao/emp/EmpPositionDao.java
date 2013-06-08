package com.egrina.planet.web.dao.emp;

import java.util.List;

import com.egrina.planet.web.entity.emp.EmpPosition;

public interface EmpPositionDao {

    public List<EmpPosition> findAll();

    public EmpPosition findById(Integer EmpPositionPk);

    public void delete(Integer EmpPositionPk);

    public EmpPosition save(EmpPosition empPosition);
    
    public EmpPosition findLatest();
}
