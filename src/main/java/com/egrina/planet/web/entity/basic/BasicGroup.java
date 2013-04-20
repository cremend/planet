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
@Table(name = "T_BASIC_GROUP")
public class BasicGroup {

    @Id
    @Column(name = "BASIC_GROUP_CODE")
    @GeneratedValue
    private Integer basicGroupCode;

    @Column(name = "BASIC_GROUP_NAME")
    private String basicGroupName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "basicGroupCode")
    private List<BasicTeam> listBasicTeam;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "basicGroupCode")
    private List<EmpDuty> empDutyList;

    public BasicGroup() {

    }

    public Integer getBasicGroupCode() {
        return basicGroupCode;
    }

    public void setBasicGroupCode(Integer basicGroupCode) {
        this.basicGroupCode = basicGroupCode;
    }

    public String getBasicGroupName() {
        return basicGroupName;
    }

    public void setBasicGroupName(String basicGroupName) {
        this.basicGroupName = basicGroupName;
    }

    public List<BasicTeam> getListBasicTeam() {
        return listBasicTeam;
    }

    public void setListBasicTeam(List<BasicTeam> listBasicTeam) {
        this.listBasicTeam = listBasicTeam;
    }

    public List<EmpDuty> getEmpDutyList() {
        return empDutyList;
    }

    public void setEmpDutyList(List<EmpDuty> empDutyList) {
        this.empDutyList = empDutyList;
    }

}
