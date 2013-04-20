package com.egrina.planet.web.dao.emp;

import java.util.List;

import com.egrina.planet.web.entity.emp.EmpInfo;

public interface EmpInfoDao {
    public List<EmpInfo> findAll();

    public EmpInfo findById(String empCode);

    public void delete(String empCode);

    public EmpInfo save(EmpInfo empInfo);
}
