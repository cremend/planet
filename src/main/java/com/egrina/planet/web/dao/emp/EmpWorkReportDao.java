package com.egrina.planet.web.dao.emp;

import java.util.List;

import com.egrina.planet.web.entity.emp.*;

public interface EmpWorkReportDao {

    public List<EmpWorkReport> findAll();

    public EmpWorkReport findById(Integer empWorkReportPk);

    public void delete(Integer empWorkReportPk);

    public EmpWorkReport save(EmpWorkReport empWorkReport);
}
