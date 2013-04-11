package com.egrina.planet.web.dao.rel;

import java.util.List;
import com.egrina.planet.web.entity.rel.RelWorkTimeReport;

public interface RelWorkTimeReportDao {
	public List<RelWorkTimeReport> findAll();
	public RelWorkTimeReport findById(Integer relWorkTimeReportPk);
	public void delete(Integer relWorkTimeReportPk);
	public RelWorkTimeReport save(RelWorkTimeReport relWorkTimeReport);
}
