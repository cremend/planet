package com.egrina.planet.web.entity.emp;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_EMP_ASSIGN")
public class EmpAssign {

    @Id
    @GeneratedValue
    @Column(name = "EMP_ASSIGN_PK")
    private Integer empAssignPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private EmpInfo empInfo;

    @Column(name = "EMP_TEAM_CODE")
    private String empTeamCode;

    @Column(name = "EMP_GROUP_CODE")
    private String empGroupCode;

    @Column(name = "EMP_ASSIGN_START_DATE")
    private Date empAssignStartDate;

    @Column(name = "EMP_ASSIGN_END_DATE")
    private Date empAssignEndDate;

    public EmpAssign() {
    }

    public Integer getEmpAssignPk() {
        return empAssignPk;
    }

    public void setEmpAssignPk(Integer empAssignPk) {
        this.empAssignPk = empAssignPk;
    }

    public EmpInfo getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }

    public String getEmpTeamCode() {
        return empTeamCode;
    }

    public void setEmpTeamCode(String empTeamCode) {
        this.empTeamCode = empTeamCode;
    }

    public String getEmpGroupCode() {
        return empGroupCode;
    }

    public void setEmpGroupCode(String empGroupCode) {
        this.empGroupCode = empGroupCode;
    }

    public Date getEmpAssignStartDate() {
        return empAssignStartDate;
    }

    public void setEmpAssignStartDate(Date empAssignStartDate) {
        this.empAssignStartDate = empAssignStartDate;
    }

    public Date getEmpAssignEndDate() {
        return empAssignEndDate;
    }

    public void setEmpAssignEndDate(Date empAssignEndDate) {
        this.empAssignEndDate = empAssignEndDate;
    }
}