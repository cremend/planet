package com.egrina.planet.web.entity.emp;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_EMP_ASSIGN")
public class EmpAssign {

    @Id
    @GeneratedValue
    @Column(name = "EMP_ASSIGN_PK")
    private Integer empAssignPk;

    @Column(name = "EMP_CODE")
    private String empCode;

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

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
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