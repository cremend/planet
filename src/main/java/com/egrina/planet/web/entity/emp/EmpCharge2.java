package com.egrina.planet.web.entity.emp;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_EMP_CHARGE2")
public class EmpCharge2 {

    @Id
    @GeneratedValue
    @Column(name = "EMP_CHARGE2_PK")
    private Integer empCharge2Pk;

    @Column(name = "EMP_CHARGE2_TYPE")
    private Integer empCharge2Type;

    @Column(name = "EMP_CHARGE2_DATE")
    private Date empCharge2Date;

    @Column(name = "EMP_CHARGE2_CONTENT")
    private String empCharge2Content;

    @Column(name = "EMP_CHARGE2_AMOUNT")
    private Integer empCharge2Amount;

    @Column(name = "EMP_CHARGE2_FILE_PATH")
    private String empCharge2FilePath;

    @Column(name = "EMP_CHARGE2_CONFIRM")
    private boolean empCharge2Confirm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private EmpInfo empInfo;

    public EmpCharge2() {
    }

    public Integer getEmpCharge2Pk() {
        return empCharge2Pk;
    }

    public void setEmpCharge2Pk(Integer empCharge2Pk) {
        this.empCharge2Pk = empCharge2Pk;
    }

    public Integer getEmpCharge2Type() {
        return empCharge2Type;
    }

    public void setEmpCharge2Type(Integer empCharge2Type) {
        this.empCharge2Type = empCharge2Type;
    }

    public Date getEmpCharge2Date() {
        return empCharge2Date;
    }

    public void setEmpCharge2Date(Date empCharge2Date) {
        this.empCharge2Date = empCharge2Date;
    }

    public String getEmpCharge2Content() {
        return empCharge2Content;
    }

    public void setEmpCharge2Content(String empCharge2Content) {
        this.empCharge2Content = empCharge2Content;
    }

    public Integer getEmpCharge2Amount() {
        return empCharge2Amount;
    }

    public void setEmpCharge2Amount(Integer empCharge2Amount) {
        this.empCharge2Amount = empCharge2Amount;
    }

    public String getEmpCharge2FilePath() {
        return empCharge2FilePath;
    }

    public void setEmpCharge2FilePath(String empCharge2FilePath) {
        this.empCharge2FilePath = empCharge2FilePath;
    }

    public boolean isempCharge2Confirm() {
        return empCharge2Confirm;
    }

    public void setEmpCharge2Confirm(boolean empCharge2Confirm) {
        this.empCharge2Confirm = empCharge2Confirm;
    }

    public EmpInfo getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }
}