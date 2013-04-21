package com.egrina.planet.web.dao.emp;

import java.util.List;

import com.egrina.planet.web.entity.emp.*;

public interface EmpAssignDao {

    public List<EmpAssign> findAll();

    public EmpAssign findById(Integer empAssignPk);

    public void delete(Integer empAssignPk);

    public EmpAssign save(EmpAssign empAssign);
}
