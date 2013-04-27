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

import com.egrina.planet.web.entity.basic.*;

@Entity
@Table(name = "T_EMP_CHARGE1")
public class EmpCharge1 {

    @Id
    @GeneratedValue
    @Column(name = "EMP_CHARGE1_PK")
    private Integer empCharge1Pk;

    @Column(name = "EMP_CHARGE1_DATE")
    private Date empCharge1Date;

    @Column(name = "EMP_CHARGE1_CONTENT")
    private String empCharge1Content;

    @Column(name = "EMP_CHARGE1_AMOUNT")
    private Integer empCharge1Amount;

    @Column(name = "EMP_CHARGE1_LOCATION1")
    private String empCharge1Location1;

    @Column(name = "EMP_CHARGE1_LOCATION2")
    private String empCharge1Location2;

    @Column(name = "EMP_CHARGE1_CONFIRM")
    private boolean empCharge1Confirm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private EmpInfo empInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_TRANS_TYPE_CODE", nullable = false)
    private BasicTransType basicTransType;

    public EmpCharge1() {
    }

    public Integer getEmpCharge1Pk() {
        return empCharge1Pk;
    }

    public void setEmpCharge1Pk(Integer empCharge1Pk) {
        this.empCharge1Pk = empCharge1Pk;
    }

    public Date getEmpCharge1Date() {
        return empCharge1Date;
    }

    public void setEmpCharge1Date(Date empCharge1Date) {
        this.empCharge1Date = empCharge1Date;
    }

    public String getEmpCharge1Content() {
        return empCharge1Content;
    }

    public void setEmpCharge1Content(String empCharge1Content) {
        this.empCharge1Content = empCharge1Content;
    }

    public Integer getEmpCharge1Amount() {
        return empCharge1Amount;
    }

    public void setEmpCharge1Amount(Integer empCharge1Amount) {
        this.empCharge1Amount = empCharge1Amount;
    }

    public String getEmpCharge1Location1() {
        return empCharge1Location1;
    }

    public void setEmpCharge1Location1(String empCharge1Location1) {
        this.empCharge1Location1 = empCharge1Location1;
    }

    public String getEmpCharge1Location2() {
        return empCharge1Location2;
    }

    public void setEmpCharge1Location2(String empCharge1Location2) {
        this.empCharge1Location2 = empCharge1Location2;
    }

    public boolean isEmpCharge1Confirm() {
        return empCharge1Confirm;
    }

    public void setEmpCharge1Confirm(boolean empCharge1Confirm) {
        this.empCharge1Confirm = empCharge1Confirm;
    }

    public EmpInfo getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }

    public BasicTransType getBasicTransType() {
        return basicTransType;
    }

    public void setBasicTransType(BasicTransType basicTransType) {
        this.basicTransType = basicTransType;
    }
}