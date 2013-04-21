package com.egrina.planet.web.entity.emp;

import java.sql.Time;
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

@Entity
@Table(name = "T_EMP_CONTRACT")
public class EmpContract {

    @Id
    @Column(name = "EMP_CONTRACT_PK")
    @GeneratedValue
    private Integer empContractPk;

    @Column(name = "EMP_CONTRACT_DATE")
    private Date empContractDate;

    @Column(name = "EMP_CONTRACT_START_DATE")
    private Date empContractStartDate;

    @Column(name = "EMP_CONTRACT_END_DATE")
    private Date empContractEndDate;

    @Column(name = "EMP_CONTRACT_WORKTIME1")
    private Time empContractWorktime1;

    @Column(name = "EMP_CONTRACT_WORKTIME2")
    private Time empContractWorktime2;

    @Column(name = "EMP_CONTRACT_WORKTIME")
    private Integer empContractWorktime;

    @Column(name = "EMP_CONTRACT_ETC")
    private String empContractEtc;

    @Column(name = "EMP_CONTRACT_PROJECT")
    private String empContractProject;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private EmpInfo empInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_COMPANY_CODE", nullable = false)
    private BasicCompany basicCompany;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_NATION_CODE", nullable = true)
    private BasicNation basicNation;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empContract")
    private List<EmpSite> empSiteList;

    public EmpContract() {
    }

    public Integer getEmpContractPk() {
        return empContractPk;
    }

    public void setEmpContractPk(Integer empContractPk) {
        this.empContractPk = empContractPk;
    }

    public Date getEmpContractDate() {
        return empContractDate;
    }

    public void setEmpContractDate(Date empContractDate) {
        this.empContractDate = empContractDate;
    }

    public Date getEmpContractStartDate() {
        return empContractStartDate;
    }

    public void setEmpContractStartDate(Date empContractStartDate) {
        this.empContractStartDate = empContractStartDate;
    }

    public Date getEmpContractEndDate() {
        return empContractEndDate;
    }

    public void setEmpContractEndDate(Date empContractEndDate) {
        this.empContractEndDate = empContractEndDate;
    }

    public Time getEmpContractWorktime1() {
        return empContractWorktime1;
    }

    public void setEmpContractWorktime1(Time empContractWorktime1) {
        this.empContractWorktime1 = empContractWorktime1;
    }

    public Time getEmpContractWorktime2() {
        return empContractWorktime2;
    }

    public void setEmpContractWorktime2(Time empContractWorktime2) {
        this.empContractWorktime2 = empContractWorktime2;
    }

    public Integer getEmpContractWorktime() {
        return empContractWorktime;
    }

    public void setEmpContractWorktime(Integer empContractWorktime) {
        this.empContractWorktime = empContractWorktime;
    }

    public String getEmpContractEtc() {
        return empContractEtc;
    }

    public void setEmpContractEtc(String empContractEtc) {
        this.empContractEtc = empContractEtc;
    }

    public String getEmpContractProject() {
        return empContractProject;
    }

    public void setEmpContractProject(String empContractProject) {
        this.empContractProject = empContractProject;
    }

    public EmpInfo getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }

    public BasicCompany getBasicCompany() {
        return basicCompany;
    }

    public void setBasicCompany(BasicCompany basicCompany) {
        this.basicCompany = basicCompany;
    }

    public BasicNation getBasicNation() {
        return basicNation;
    }

    public void setBasicNation(BasicNation basicNation) {
        this.basicNation = basicNation;
    }

    public List<EmpSite> getEmpSiteList() {
        return empSiteList;
    }

    public void setEmpSiteList(List<EmpSite> empSiteList) {
        this.empSiteList = empSiteList;
    }
}