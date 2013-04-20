package com.egrina.planet.web.entity.emp;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.egrina.planet.web.entity.basic.*;

@Entity
@Table(name = "T_EMP_DUTY")
public class EmpDuty {

    @Id
    @GeneratedValue
    @Column(name = "EMP_DUTY_PK")
    private Integer empDutyPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_GROUP_CODE", nullable = false)
    private BasicGroup basicGroupCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_TEAM_CODE", nullable = false)
    private BasicTeam basicTeamCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_DUTY_CODE", nullable = false)
    private BasicDuty basicDutyCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private EmpInfo empInfo;

    @Column(name = "EMP_DUTY_START_DATE")
    private Calendar empDutyStartDate;

    @Column(name = "EMP_DUTY_END_DATE")
    private Calendar empDutyEndDate;

    public EmpDuty() {

    }

    public Integer getEmpDutyPk() {
        return empDutyPk;
    }

    public void setEmpDutyPk(Integer empDutyPk) {
        this.empDutyPk = empDutyPk;
    }

    public BasicTeam getBasicTeamCode() {
        return basicTeamCode;
    }

    public void setBasicTeamCode(BasicTeam basicTeamCode) {
        this.basicTeamCode = basicTeamCode;
    }

    public BasicDuty getBasicDutyCode() {
        return basicDutyCode;
    }

    public void setBasicDutyCode(BasicDuty basicDutyCode) {
        this.basicDutyCode = basicDutyCode;
    }

    public EmpInfo getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }

    public BasicGroup getBasicGroupCode() {
        return basicGroupCode;
    }

    public void setBasicGroupCode(BasicGroup basicGroupCode) {
        this.basicGroupCode = basicGroupCode;
    }

    public Calendar getEmpDutyStartDate() {
        return empDutyStartDate;
    }

    public void setEmpDutyStartDate(Calendar empDutyStartDate) {
        this.empDutyStartDate = empDutyStartDate;
    }

    public Calendar getEmpDutyEndDate() {
        return empDutyEndDate;
    }

    public void setEmpDutyEndDate(Calendar empDutyEndDate) {
        this.empDutyEndDate = empDutyEndDate;
    }

}
