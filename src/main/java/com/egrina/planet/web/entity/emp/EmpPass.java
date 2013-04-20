package com.egrina.planet.web.entity.emp;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.egrina.planet.web.entity.basic.*;
import com.egrina.planet.web.entity.rel.*;

@Entity
@Table(name = "T_EMP_PASS")
public class EmpPass {

    @Id
    @Column(name = "EMP_PASS_PK")
    @GeneratedValue
    private Integer empPassPk;

    @Column(name = "EMP_PASS_START_DATE")
    private Date empPassStartDate;

    @Column(name = "EMP_PASS_END_DATE")
    private Date empPassEndDate;

    @Column(name = "EMP_PASS_AMOUNT")
    private Integer empPassAmount;

    @Column(name = "EMP_PASS_LOCATION1")
    private String empPassLocation1;

    @Column(name = "EMP_PASS_LOCATION2")
    private String empPassLocation2;

    @Column(name = "EMP_PASS_FILE_PATH")
    private String empPassFilePath;

    @Column(name = "EMP_PASS_CONFIRM")
    private boolean empPassConfirm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private EmpInfo empInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_TRANS_TYPE_CODE", nullable = false)
    private BasicTransType basicTransType;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empPass")
    private List<RelPassReport> relPassReportList;

    public EmpPass() {

    }

    public Integer getEmpPassPk() {
        return empPassPk;
    }

    public void setEmpPassPk(Integer empPassPk) {
        this.empPassPk = empPassPk;
    }

    public Date getEmpPassStartDate() {
        return empPassStartDate;
    }

    public void setEmpPassStartDate(Date empPassStartDate) {
        this.empPassStartDate = empPassStartDate;
    }

    public Date getEmpPassEndDate() {
        return empPassEndDate;
    }

    public void setEmpPassEndDate(Date empPassEndDate) {
        this.empPassEndDate = empPassEndDate;
    }

    public Integer getEmpPassAmount() {
        return empPassAmount;
    }

    public void setEmpPassAmount(Integer empPassAmount) {
        this.empPassAmount = empPassAmount;
    }

    public String getEmpPassLocation1() {
        return empPassLocation1;
    }

    public void setEmpPassLocation1(String empPassLocation1) {
        this.empPassLocation1 = empPassLocation1;
    }

    public String getEmpPassLocation2() {
        return empPassLocation2;
    }

    public void setEmpPassLocation2(String empPassLocation2) {
        this.empPassLocation2 = empPassLocation2;
    }

    public String getEmpPassFilePath() {
        return empPassFilePath;
    }

    public void setEmpPassFilePath(String empPassFilePath) {
        this.empPassFilePath = empPassFilePath;
    }

    public boolean isEmpPassConfirm() {
        return empPassConfirm;
    }

    public void setEmpPassConfirm(boolean empPassConfirm) {
        this.empPassConfirm = empPassConfirm;
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

    public List<RelPassReport> getRelPassReportList() {
        return relPassReportList;
    }

    public void setRelPassReportList(List<RelPassReport> relPassReportList) {
        this.relPassReportList = relPassReportList;
    }

}
