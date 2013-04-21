package com.egrina.planet.web.entity.basic;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.egrina.planet.web.entity.emp.*;

@Entity
@Table(name = "T_BASIC_COMPANY")
public class BasicCompany {

    @Id
    @GeneratedValue
    @Column(name = "BASIC_COMPANY_CODE")
    private Integer basicCompanyCode;

    @Column(name = "BASIC_COMPANY_NAME")
    private String basicCompanyName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "basicCompany")
    private List<BasicSite> basicSiteList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "basicCompany")
    private List<EmpContract> empContractList;

    public BasicCompany() {
    }

    public Integer getBasicCompanyCode() {
        return basicCompanyCode;
    }

    public void setBasicCompanyCode(Integer basicCompanyCode) {
        this.basicCompanyCode = basicCompanyCode;
    }

    public String getBasicCompanyName() {
        return basicCompanyName;
    }

    public void setBasicCompanyName(String basicCompanyName) {
        this.basicCompanyName = basicCompanyName;
    }

    public List<BasicSite> getBasicSiteList() {
        return basicSiteList;
    }

    public void setBasicSiteList(List<BasicSite> basicSiteList) {
        this.basicSiteList = basicSiteList;
    }

    public List<EmpContract> getEmpContractList() {
        return empContractList;
    }

    public void setEmpContractList(List<EmpContract> empContractList) {
        this.empContractList = empContractList;
    }
}