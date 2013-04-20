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
@Table(name = "T_BASIC_POSITION")
public class BasicPosition {

    @Id
    @GeneratedValue
    @Column(name = "BASIC_POSITION_CODE")
    private Integer basicPositionCode;

    @Column(name = "BASIC_POSITION_NAME")
    private String basicPositionName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "basicPosition")
    private List<EmpPosition> EmpPositionList;

    public BasicPosition() {

    }

    public Integer getBasicPositionCode() {
        return basicPositionCode;
    }

    public void setBasicPositionCode(Integer basicPositionCode) {
        this.basicPositionCode = basicPositionCode;
    }

    public String getBasicPositionName() {
        return basicPositionName;
    }

    public void setBasicPositionName(String basicPositionName) {
        this.basicPositionName = basicPositionName;
    }

}
