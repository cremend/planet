package com.egrina.planet.web.dao.emp;

import java.util.List;

import com.egrina.planet.web.entity.emp.EmpPassport;

public interface EmpPassportDao {

    public List<EmpPassport> findAll();

    public EmpPassport findById(Integer empPassportPk);

    public void delete(Integer empPassportPk);

    public EmpPassport save(EmpPassport empPassport);
}
