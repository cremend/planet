package com.egrina.planet.web.entity.emp;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_EMP_JOIN")
public class EmpJoin {

    @Id
    @GeneratedValue
    @Column(name = "EMP_JOIN_PK")
    private Integer empJoinPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private EmpInfo empInfo;

    @Column(name = "EMP_JOIN_NUMBER")
    private String empJoinNumber;

    @Column(name = "EMP_JOIN_START_DATE")
    private Calendar empJoinStartDate;

    @Column(name = "EMP_JOIN_END_DATE")
    private Calendar empJoinEndDate;

    public EmpJoin() {
    }

    public Integer getEmpJoinPk() {
        return empJoinPk;
    }

    public void setEmpJoinPk(Integer empJoinPk) {
        this.empJoinPk = empJoinPk;
    }

    public EmpInfo getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }

    public String getEmpJoinNumber() {
        return empJoinNumber;
    }

    public void setEmpJoinNumber(String empJoinNumber) {
        this.empJoinNumber = empJoinNumber;
    }

    public Calendar getEmpJoinStartDate() {
        return empJoinStartDate;
    }

    public void setEmpJoinStartDate(Calendar empJoinStartDate) {
        this.empJoinStartDate = empJoinStartDate;
    }

    public Calendar getEmpJoinEndDate() {
        return empJoinEndDate;
    }

    public void setEmpJoinEndDate(Calendar empJoinEndDate) {
        this.empJoinEndDate = empJoinEndDate;
    }
}