package com.egrina.planet.web.entity.basic;

//import java.util.Date;
//import java.util.List;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.egrina.planet.web.entity.emp.*;

@Entity
@Table(name = "T_BASIC_WORK_TYPE")
public class BasicWorkType {

    @Id
    @Column(name = "BASIC_WORK_TYPE_CODE")
    @GeneratedValue
    private Integer basicWorkTypeCode;

    @Column(name = "BASIC_WORK_TYPE_NAME")
    private String basicWorkTypeName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "basicWorkType")
    private List<EmpWorkTime> empWorkTimeList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "basicWorkTypeCode")
    private List<EmpHolidayApply> empHolidayApplyList;

    public BasicWorkType() {

    }

    public Integer getBasicWorkTypeCode() {
        return basicWorkTypeCode;
    }

    public void setBasicWorkTypeCode(Integer basicWorkTypeCode) {
        this.basicWorkTypeCode = basicWorkTypeCode;
    }

    public String getBasicWorkTypeName() {
        return basicWorkTypeName;
    }

    public void setBasicWorkTypeName(String basicWorkTypeName) {
        this.basicWorkTypeName = basicWorkTypeName;
    }

    public List<EmpWorkTime> getEmpWorkTimeList() {
        return empWorkTimeList;
    }

    public void setEmpWorkTimeList(List<EmpWorkTime> empWorkTimeList) {
        this.empWorkTimeList = empWorkTimeList;
    }

    public List<EmpHolidayApply> getEmpHolidayApplyList() {
        return empHolidayApplyList;
    }

    public void setEmpHolidayApplyList(List<EmpHolidayApply> empHolidayApplyList) {
        this.empHolidayApplyList = empHolidayApplyList;
    }

}
