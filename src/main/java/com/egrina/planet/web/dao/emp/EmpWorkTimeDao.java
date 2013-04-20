package com.egrina.planet.web.dao.emp;

import java.util.List;
import com.egrina.planet.web.entity.emp.*;

public interface EmpWorkTimeDao {

    public List<EmpWorkTime> findAll();

    public EmpWorkTime findById(Integer empWorkTimePk);

    public void delete(long empWorkTimePk);

    public EmpWorkTime save(EmpWorkTime empWorkTime);
}
