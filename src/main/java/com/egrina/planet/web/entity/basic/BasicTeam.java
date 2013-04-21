package com.egrina.planet.web.entity.basic;

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

import com.egrina.planet.web.entity.emp.*;

@Entity
@Table(name = "T_BASIC_TEAM")
public class BasicTeam {

    @Id
    @GeneratedValue
    @Column(name = "BASIC_TEAM_CODE")
    private Integer basicTeamCode;

    @Column(name = "BASIC_TEAM_NAME")
    private String basicTeamName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_GROUP_CODE", nullable = false)
    private BasicGroup basicGroup;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "basicTeamCode")
    private List<EmpDuty> empDutyList;

    public BasicTeam() {
    }

    public Integer getBasicTeamCode() {
        return basicTeamCode;
    }

    public void setBasicTeamCode(Integer basicTeamCode) {
        this.basicTeamCode = basicTeamCode;
    }

    public String getBasicTeamName() {
        return basicTeamName;
    }

    public void setBasicTeamName(String basicTeamName) {
        this.basicTeamName = basicTeamName;
    }

    public BasicGroup getBasicGroup() {
        return basicGroup;
    }

    public void setBasicGroup(BasicGroup basicGroup) {
        this.basicGroup = basicGroup;
    }

    public List<EmpDuty> getEmpDutyList() {
        return empDutyList;
    }

    public void setEmpDutyList(List<EmpDuty> empDutyList) {
        this.empDutyList = empDutyList;
    }
}