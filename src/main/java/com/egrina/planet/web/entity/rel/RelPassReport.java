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
@Table(name = "T_REL_PASS_REPORT")
public class RelPassReport {

    @Id
    @Column(name = "REL_PASS_REPORT_PK")
    @GeneratedValue
    private Integer relPassReportPk;

    @Column(name = "RESULT")
    private boolean result;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_PASS_PK", nullable = false)
    private EmpPass empPass;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE1", referencedColumnName = "EMP_CODE", nullable = false)
    private EmpInfo empInfo1;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE2", referencedColumnName = "EMP_CODE", nullable = false)
    private EmpInfo empInfo2;

    public RelPassReport() {
    }

    public Integer getRelPassReportPk() {
        return relPassReportPk;
    }

    public void setRelPassReportPk(Integer relPassReportPk) {
        this.relPassReportPk = relPassReportPk;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public EmpPass getEmpPass() {
        return empPass;
    }

    public void setEmpPass(EmpPass empPass) {
        this.empPass = empPass;
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
}