package com.egrina.planet.web.entity.rel;

//import java.util.Date;
//import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.egrina.planet.web.entity.emp.*;

@Entity
@Table(name = "T_REL_CHARGE2_REPORT")
public class RelCharge2Report {

    @Id
    @Column(name = "REL_CHARGE2_REPORT_PK")
    @GeneratedValue
    private Integer relCharge2ReportPk;

    @Column(name = "RESULT")
    private boolean result;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CHARGE2_PK", nullable = false)
    private EmpCharge2 empCharge2;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE1", referencedColumnName = "EMP_CODE", nullable = false)
    private EmpInfo empInfo1;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE2", referencedColumnName = "EMP_CODE", nullable = false)
    private EmpInfo empInfo2;

    public RelCharge2Report() {

    }

    public EmpCharge2 getEmpCharge2() {
        return empCharge2;
    }

    public void setEmpCharge2(EmpCharge2 empCharge2) {
        this.empCharge2 = empCharge2;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Integer getRelCharge2ReportPk() {
        return relCharge2ReportPk;
    }

    public void setRelCharge2ReportPk(Integer relCharge2ReportPk) {
        this.relCharge2ReportPk = relCharge2ReportPk;
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
