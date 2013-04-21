package com.egrina.planet.web.entity.emp;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.egrina.planet.web.entity.basic.*;

@Entity
@Table(name = "T_EMP_SITE")
public class EmpSite {

    @Id
    @GeneratedValue
    @Column(name = "EMP_SITE_PK")
    private Integer empSitePk;

    @Column(name = "EMP_SITE_START_DATE")
    private Date empSiteStartDate;

    @Column(name = "EMP_SITE_END_DATE")
    private Date empSiteEndDate;

    @Column(name = "EMP_SITE_STATION")
    private Date empSiteStation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private EmpInfo empInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_SITE_CODE", nullable = false)
    private BasicSite basicSite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_ROLE_CODE", nullable = false)
    private BasicRole basicRole;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CONTRACT_PK", nullable = false)
    private EmpContract empContract;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_JOB_CATEGORY_CODE", nullable = false)
    private BasicJobCategory basicJobCategory;

    public EmpSite() {
    }

    public Integer getEmpSitePk() {
        return empSitePk;
    }

    public void setEmpSitePk(Integer empSitePk) {
        this.empSitePk = empSitePk;
    }

    public Date getEmpSiteStartDate() {
        return empSiteStartDate;
    }

    public void setEmpSiteStartDate(Date empSiteStartDate) {
        this.empSiteStartDate = empSiteStartDate;
    }

    public Date getEmpSiteEndDate() {
        return empSiteEndDate;
    }

    public void setEmpSiteEndDate(Date empSiteEndDate) {
        this.empSiteEndDate = empSiteEndDate;
    }

    public Date getEmpSiteStation() {
        return empSiteStation;
    }

    public void setEmpSiteStation(Date empSiteStation) {
        this.empSiteStation = empSiteStation;
    }

    public EmpInfo getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }

    public BasicSite getBasicSite() {
        return basicSite;
    }

    public void setBasicSite(BasicSite basicSite) {
        this.basicSite = basicSite;
    }

    public BasicRole getBasicRole() {
        return basicRole;
    }

    public void setBasicRole(BasicRole basicRole) {
        this.basicRole = basicRole;
    }

    public EmpContract getEmpContract() {
        return empContract;
    }

    public void setEmpContract(EmpContract empContract) {
        this.empContract = empContract;
    }

    public BasicJobCategory getBasicJobCategory() {
        return basicJobCategory;
    }

    public void setBasicJobCategory(BasicJobCategory basicJobCategory) {
        this.basicJobCategory = basicJobCategory;
    }
}