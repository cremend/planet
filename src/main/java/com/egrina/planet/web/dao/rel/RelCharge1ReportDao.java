package com.egrina.planet.web.dao.rel;

import java.util.List;
import com.egrina.planet.web.entity.rel.RelCharge1Report;

public interface RelCharge1ReportDao {
	public List<RelCharge1Report> findAll();
	public RelCharge1Report findById(Integer relCharge1ReportPk);
	public void delete(Integer relCharge1ReportPk);
	public RelCharge1Report save(RelCharge1Report relCharge1Report);
}
