package com.egrina.planet.web.dao.emp;

import java.util.List;
import com.egrina.planet.web.entity.emp.EmpHolidayApply;

public interface EmpHolidayApplyDao {
    public List<EmpHolidayApply> findAll();

    public EmpHolidayApply findById(Integer empHolydayApplyPk);

    public void delete(Integer empHolydayApplyPk);

    public EmpHolidayApply save(EmpHolidayApply empHolidayApply);
}
