package com.egrina.planet.web.entity.basic;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_BASIC_NATION")
public class BasicNation {

    @Id
    @Column(name = "BASIC_NATION_CODE")
    @GeneratedValue
    private Integer basicNationCode;

    @Column(name = "BASIC_NATION_NAME")
    private String basicNationName;

    // Constructor
    public BasicNation() {
    }

    public Integer getBasicNationCode() {
        return basicNationCode;
    }

    public void setBasicNationCode(Integer basicNationCode) {
        this.basicNationCode = basicNationCode;
    }

    public String getBasicNationName() {
        return basicNationName;
    }

    public void setBasicNationName(String basicNationName) {
        this.basicNationName = basicNationName;
    }

}
