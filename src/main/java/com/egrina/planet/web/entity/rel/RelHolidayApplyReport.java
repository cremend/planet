package com.egrina.planet.web.entity.rel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.egrina.planet.web.entity.emp.*;

@Entity
@Table(name = "T_REL_HOLIDAY_APPLY_REPORT")
public class RelHolidayApplyReport {

    @Id
    @GeneratedValue
    @Column(name = "REL_HOLIDAY_APPLY_REPORT")
    private Integer relHolidayApplyReportPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_HOLIDAY_APPLY_REPORT_PK", nullable = false)
    private EmpHolidayApply empHolidayApplyReportPk;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE1", referencedColumnName = "EMP_CODE", nullable = false)
    private EmpInfo empInfo1;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE2", referencedColumnName = "EMP_CODE", nullable = false)
    private EmpInfo empInfo2;

    @Column(name = "RESULT")
    private boolean result;

    public RelHolidayApplyReport() {
    }

    public Integer getRelHolidayApplyReportPk() {
        return relHolidayApplyReportPk;
    }

    public void setRelHolidayApplyReportPk(Integer relHolidayApplyReportPk) {
        this.relHolidayApplyReportPk = relHolidayApplyReportPk;
    }

    public EmpHolidayApply getEmpHolidayApplyReportPk() {
        return empHolidayApplyReportPk;
    }

    public void setEmpHolidayApplyReportPk(EmpHolidayApply empHolidayApplyReportPk) {
        this.empHolidayApplyReportPk = empHolidayApplyReportPk;
    }

    public EmpInfo getEmpInfo1() {
        return empInfo1;
    }

    public void setEmpInfo1(EmpInfo empInfo1) {
        this.empInfo1 = empInfo1;
    }

    public EmpInfo getEmpInfo2() {
        return empInfo2;
    }

    public void setEmpInfo2(EmpInfo empInfo2) {
        this.empInfo2 = empInfo2;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}