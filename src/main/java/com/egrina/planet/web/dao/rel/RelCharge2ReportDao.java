package com.egrina.planet.web.dao.rel;

import java.util.List;
import com.egrina.planet.web.entity.rel.RelCharge2Report;

public interface RelCharge2ReportDao {
	public List<RelCharge2Report> findAll();
	public RelCharge2Report findById(Integer relCharge2ReportPk);
	public void delete(Integer relCharge2ReportPk);
	public RelCharge2Report save(RelCharge2Report relCharge2Report);
}
