package com.egrina.planet.web.dao.emp;

import java.util.List;
import com.egrina.planet.web.entity.emp.EmpHoliday;

public interface EmpHolidayDao {
	public List<EmpHoliday> findAll();

    public EmpHoliday findById(Integer empHolidayPk);

    public void delete(Integer empHolidayPk);

    public EmpHoliday save(EmpHoliday empHoliday);
}
