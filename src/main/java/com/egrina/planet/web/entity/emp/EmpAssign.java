package com.egrina.planet.web.entity.emp;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_emp_assign")
public class EmpAssign {

    @Id
    @Column(name = "emp_assign_idx")
    @GeneratedValue
    private long empAssignIdx;

    @Column(name = "emp_code")
    private String empCode;

    @Column(name = "emp_team_code")
    private String empTeamCode;

    @Column(name = "emp_group_code")
    private String empGroupCode;

    @Column(name = "emp_start_day")
    private Date empSday;

    @Column(name = "emp_end_day")
    private Date empEday;

    // @OneToMany(fetch=FetchType.LAZY, mappedBy="empAssign")
    // private List<Post> posts;

    // Constructor
    public EmpAssign() {

    }

    // Getters & Setters

    public long getEmpAssignIdx() {
        return empAssignIdx;
    }

    public void setEmpAssignIdx(long empAssignIdx) {
        this.empAssignIdx = empAssignIdx;
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

    public Date getEmpSday() {
        return empSday;
    }

    public void setEmpSday(Date empSday) {
        this.empSday = empSday;
    }

    public Date getEmpEday() {
        return empEday;
    }

    public void setEmpEday(Date empEday) {
        this.empEday = empEday;
    }

}
