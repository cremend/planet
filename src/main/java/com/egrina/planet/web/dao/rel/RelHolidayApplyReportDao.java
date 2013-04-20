package com.egrina.planet.web.dao.rel;

import java.util.List;
import com.egrina.planet.web.entity.rel.RelHolidayApplyReport;

public interface RelHolidayApplyReportDao {
    public List<RelHolidayApplyReport> findAll();

    public RelHolidayApplyReport findById(Integer relHolidayApplyReportPk);

    public void delete(Integer relHolidayApplyReportPk);

    public RelHolidayApplyReport save(RelHolidayApplyReport relHolidayApplyReport);
}
