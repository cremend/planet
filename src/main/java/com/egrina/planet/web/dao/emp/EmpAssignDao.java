package com.egrina.planet.web.dao.emp;

import java.util.List;
import com.egrina.planet.web.entity.emp.*;

;

public interface EmpAssignDao {

    public List<EmpAssign> findAll();

    public EmpAssign findById(long empAssignIdx);

    public void delete(long empAssignIdx);

    public EmpAssign save(EmpAssign empAssign);
}
