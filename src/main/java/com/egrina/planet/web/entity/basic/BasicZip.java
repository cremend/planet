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
@Table(name = "T_BASIC_ZIP")
public class BasicZip {

    @Id
    @Column(name = "BASIC_ZIP_CODE")
    private String basicZipCode;

    @Column(name = "BASIC_ZIP_NAME")
    private String basicZipName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "basicZipCode")
    private List<EmpInfo> empInfoList;

    public BasicZip() {
    }

    public String getBasicZipCode() {
        return basicZipCode;
    }

    public void setBasicZipCode(String basicZipCode) {
        this.basicZipCode = basicZipCode;
    }

    public String getBasicZipName() {
        return basicZipName;
    }

    public void setBasicZipName(String basicZipName) {
        this.basicZipName = basicZipName;
    }

    public List<EmpInfo> getEmpInfoList() {
        return empInfoList;
    }

    public void setEmpInfoList(List<EmpInfo> empInfoList) {
        this.empInfoList = empInfoList;
    }
}