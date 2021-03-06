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
@Table(name = "T_BASIC_EMPLOY")
public class BasicEmploy {

    @Id
    @GeneratedValue
    @Column(name = "BASIC_EMPLOY_CODE")
    private Integer basicEmployCode;

    @Column(name = "BASIC_EMPLOY_NAME")
    private String basicEmployName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "basicEmploy")
    private List<EmpEmploy> empEmployList;

    public BasicEmploy() {
    }

    public Integer getBasicEmployCode() {
        return basicEmployCode;
    }

    public void setBasicEmployCode(Integer basicEmployCode) {
        this.basicEmployCode = basicEmployCode;
    }

    public String getBasicEmployName() {
        return basicEmployName;
    }

    public void setBasicEmployName(String basicEmployName) {
        this.basicEmployName = basicEmployName;
    }

    public List<EmpEmploy> getEmpEmployList() {
        return empEmployList;
    }

    public void setEmpEmployList(List<EmpEmploy> empEmployList) {
        this.empEmployList = empEmployList;
    }
}