package com.egrina.planet.web.entity.basic;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.egrina.planet.web.entity.emp.*;

@Entity
@Table(name = "T_BASIC_ROLE")
public class BasicRole {

    @Id
    @GeneratedValue
    @Column(name = "BASIC_ROLE_CODE")
    private Integer basicRoleCode;

    @Column(name = "BASIC_ROLE_NAME")
    private String basicRoleName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "basicRole")
    private List<EmpSite> empSiteList;

    public BasicRole() {
    }

    public Integer getBasicRoleCode() {
        return basicRoleCode;
    }

    public void setBasicRoleCode(Integer basicRoleCode) {
        this.basicRoleCode = basicRoleCode;
    }

    public String getBasicRoleName() {
        return basicRoleName;
    }

    public void setBasicRoleName(String basicRoleName) {
        this.basicRoleName = basicRoleName;
    }

    public List<EmpSite> getEmpSiteList() {
        return empSiteList;
    }

    public void setEmpSiteList(List<EmpSite> empSiteList) {
        this.empSiteList = empSiteList;
    }
}
