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
    @Column(name = "emp_assign_pk")
    @GeneratedValue
    private Integer empAssignPk;

    @Column(name = "emp_code")
    private String empCode;

    @Column(name = "emp_team_code")
    private String empTeamCode;

    @Column(name = "emp_group_code")
    private String empGroupCode;

    @Column(name = "emp_assign_start_date")
    private Date empAssignStartDate;

    @Column(name = "emp_assign_end_Date")
    private Date empAssignEndDate;

    // @OneToMany(fetch=FetchType.LAZY, mappedBy="empAssign")
    // private List<Post> posts;

    // Constructor
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

    // Getters & Setters

}
