package com.egrina.planet.web.entity.basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_BASIC_NATION")
public class BasicNation {

    @Id
    @GeneratedValue
    @Column(name = "BASIC_NATION_CODE")
    private Integer basicNationCode;

    @Column(name = "BASIC_NATION_NAME")
    private String basicNationName;

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
