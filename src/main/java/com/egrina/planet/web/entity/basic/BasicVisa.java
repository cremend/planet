package com.egrina.planet.web.entity.basic;

//import java.util.Date;
//import java.util.List;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.egrina.planet.web.entity.emp.*;

@Entity
@Table(name = "T_BASIC_VISA")
public class BasicVisa {

    @Id
    @Column(name = "BASIC_VISA_CODE")
    @GeneratedValue
    private Integer basicVisaCode;

    @Column(name = "BASIC_VISA_NAME")
    private Integer basicVisaName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "basicVisa")
    private List<EmpResidence> empResidenceList;

    // Constructor
    public BasicVisa() {
    }

    // Getters & Setters
    public Integer getBasicVisaCode() {
        return basicVisaCode;
    }

    public void setBasicVisaCode(Integer basicVisaCode) {
        this.basicVisaCode = basicVisaCode;
    }

    public Integer getBasicVisaName() {
        return basicVisaName;
    }

    public void setBasicVisaName(Integer basicVisaName) {
        this.basicVisaName = basicVisaName;
    }

    public List<EmpResidence> getEmpResidenceList() {
        return empResidenceList;
    }

    public void setEmpResidenceList(List<EmpResidence> empResidenceList) {
        this.empResidenceList = empResidenceList;
    }

}
