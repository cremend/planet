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
    private Integer empcharge1Pk;

    @Column(name = "EMP_CHARGE1_DATE")
    private Date empcharge1Date;

    @Column(name = "EMP_CHARGE1_CONTENT")
    private String empcharge1Content;

    @Column(name = "EMP_CHARGE1_AMOUNT")
    private Integer empcharge1Amount;

    @Column(name = "EMP_CHARGE1_LOCATION1")
    private String empcharge1Location1;

    @Column(name = "EMP_CHARGE1_LOCATION2")
    private String empcharge1Location2;

    @Column(name = "EMP_CHARGE1_CONFIRM")
    private boolean empcharge1Confirm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private EmpInfo empInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_TRANS_TYPE_CODE", nullable = false)
    private BasicTransType basicTransType;

    public EmpCharge1() {
    }

    public Integer getEmpcharge1Pk() {
        return empcharge1Pk;
    }

    public void setEmpcharge1Pk(Integer empcharge1Pk) {
        this.empcharge1Pk = empcharge1Pk;
    }

    public Date getEmpcharge1Date() {
        return empcharge1Date;
    }

    public void setEmpcharge1Date(Date empcharge1Date) {
        this.empcharge1Date = empcharge1Date;
    }

    public String getEmpcharge1Content() {
        return empcharge1Content;
    }

    public void setEmpcharge1Content(String empcharge1Content) {
        this.empcharge1Content = empcharge1Content;
    }

    public Integer getEmpcharge1Amount() {
        return empcharge1Amount;
    }

    public void setEmpcharge1Amount(Integer empcharge1Amount) {
        this.empcharge1Amount = empcharge1Amount;
    }

    public String getEmpcharge1Location1() {
        return empcharge1Location1;
    }

    public void setEmpcharge1Location1(String empcharge1Location1) {
        this.empcharge1Location1 = empcharge1Location1;
    }

    public String getEmpcharge1Location2() {
        return empcharge1Location2;
    }

    public void setEmpcharge1Location2(String empcharge1Location2) {
        this.empcharge1Location2 = empcharge1Location2;
    }

    public boolean isEmpcharge1Confirm() {
        return empcharge1Confirm;
    }

    public void setEmpcharge1Confirm(boolean empcharge1Confirm) {
        this.empcharge1Confirm = empcharge1Confirm;
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