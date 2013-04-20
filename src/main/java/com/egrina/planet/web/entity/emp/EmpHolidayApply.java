package com.egrina.planet.web.entity.emp;

import java.util.Date;
import java.util.List;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.egrina.planet.web.entity.basic.*;
import com.egrina.planet.web.entity.rel.*;

@Entity
@Table(name = "T_EMP_HOLIDAY_APPLY")
public class EmpHolidayApply {

    @Id
    @Column(name = "EMP_HOLIDAY_APPLY_PK")
    @GeneratedValue
    private Integer empHolydayApplyPk;

    @Column(name = "EMP_HOLIDAY_APPLY_START_DATE")
    private Date empHolidayApplyStartDate;

    @Column(name = "EMP_HOLIDAY_APPLY_END_DATE")
    private Date empHolidayApplyEndDate;

    @Column(name = "EMP_HOLIDAY_APPLY_CONTENT")
    private String empHolidayApplyContent;

    @Column(name = "EMP_HOLIDAY_APPLY_DESTINATION")
    private String empHolidayApplyDestination;

    @Column(name = "EMP_HOLIDAY_APPLY_DEPART_DATE")
    private Date empHolidayApplyDepartDate;

    @Column(name = "EMP_HOLIDAY_APPLY_ARRIVE_DATE")
    private Date empHolidayApplyArriveDate;

    @Column(name = "EMP_HOLIDAY_APPLY_CONFIRM")
    private Date empHolidayApplyConfirm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private EmpInfo empInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_WORK_TYPE_CODE", nullable = false)
    private BasicWorkType basicWorkTypeCode;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empHolidayApplyReportPk")
    private List<RelHolidayApplyReport> ｒelHolidayApplyReportList;

    public EmpHolidayApply() {

    }

    public Integer getEmpHolydayApplyPk() {
        return empHolydayApplyPk;
    }

    public void setEmpHolydayApplyPk(Integer empHolydayApplyPk) {
        this.empHolydayApplyPk = empHolydayApplyPk;
    }

    public Date getEmpHolidayApplyStartDate() {
        return empHolidayApplyStartDate;
    }

    public void setEmpHolidayApplyStartDate(Date empHolidayApplyStartDate) {
        this.empHolidayApplyStartDate = empHolidayApplyStartDate;
    }

    public Date getEmpHolidayApplyEndDate() {
        return empHolidayApplyEndDate;
    }

    public void setEmpHolidayApplyEndDate(Date empHolidayApplyEndDate) {
        this.empHolidayApplyEndDate = empHolidayApplyEndDate;
    }

    public String getEmpHolidayApplyContent() {
        return empHolidayApplyContent;
    }

    public void setEmpHolidayApplyContent(String empHolidayApplyContent) {
        this.empHolidayApplyContent = empHolidayApplyContent;
    }

    public String getEmpHolidayApplyDestination() {
        return empHolidayApplyDestination;
    }

    public void setEmpHolidayApplyDestination(String empHolidayApplyDestination) {
        this.empHolidayApplyDestination = empHolidayApplyDestination;
    }

    public Date getEmpHolidayApplyDepartDate() {
        return empHolidayApplyDepartDate;
    }

    public void setEmpHolidayApplyDepartDate(Date empHolidayApplyDepartDate) {
        this.empHolidayApplyDepartDate = empHolidayApplyDepartDate;
    }

    public Date getEmpHolidayApplyArriveDate() {
        return empHolidayApplyArriveDate;
    }

    public void setEmpHolidayApplyArriveDate(Date empHolidayApplyArriveDate) {
        this.empHolidayApplyArriveDate = empHolidayApplyArriveDate;
    }

    public Date getEmpHolidayApplyConfirm() {
        return empHolidayApplyConfirm;
    }

    public void setEmpHolidayApplyConfirm(Date empHolidayApplyConfirm) {
        this.empHolidayApplyConfirm = empHolidayApplyConfirm;
    }

    public EmpInfo getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }

    public BasicWorkType getBasicWorkTypeCode() {
        return basicWorkTypeCode;
    }

    public void setBasicWorkType(BasicWorkType basicWorkTypeCode) {
        this.basicWorkTypeCode = basicWorkTypeCode;
    }

}
