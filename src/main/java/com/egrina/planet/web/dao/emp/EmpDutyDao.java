package com.egrina.planet.web.dao.emp;

import java.util.List;
import com.egrina.planet.web.entity.emp.*;

public interface EmpDutyDao {
    public List<EmpDuty> findAll();

    public EmpDuty findById(Integer empDutyPk);

    public void delete(Integer empDutyPk);

    public EmpDuty save(EmpDuty empDuty);
}
