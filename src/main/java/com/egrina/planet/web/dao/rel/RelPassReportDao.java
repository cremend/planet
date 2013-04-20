package com.egrina.planet.web.dao.rel;

import java.util.List;
import com.egrina.planet.web.entity.rel.RelPassReport;

public interface RelPassReportDao {
    public List<RelPassReport> findAll();

    public RelPassReport findById(Integer relPassReportPk);

    public void delete(Integer relPassReportPk);

    public RelPassReport save(RelPassReport relPassReport);
}
