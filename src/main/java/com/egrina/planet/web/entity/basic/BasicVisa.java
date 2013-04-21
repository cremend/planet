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
@Table(name = "T_BASIC_VISA")
public class BasicVisa {

    @Id
    @GeneratedValue
    @Column(name = "BASIC_VISA_CODE")
    private Integer basicVisaCode;

    @Column(name = "BASIC_VISA_NAME")
    private String basicVisaName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "basicVisa")
    private List<EmpResidence> empResidenceList;

    public BasicVisa() {
    }

    public Integer getBasicVisaCode() {
        return basicVisaCode;
    }

    public void setBasicVisaCode(Integer basicVisaCode) {
        this.basicVisaCode = basicVisaCode;
    }

    public String getBasicVisaName() {
        return basicVisaName;
    }

    public void setBasicVisaName(String basicVisaName) {
        this.basicVisaName = basicVisaName;
    }

    public List<EmpResidence> getEmpResidenceList() {
        return empResidenceList;
    }

    public void setEmpResidenceList(List<EmpResidence> empResidenceList) {
        this.empResidenceList = empResidenceList;
    }
}