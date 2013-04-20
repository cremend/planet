package com.egrina.planet.web.entity.emp;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.egrina.planet.web.entity.basic.*;

@Entity
@Table(name = "T_EMP_POSITION")
public class EmpPosition {

    @Id
    @GeneratedValue
    @Column(name = "EMP_POSITION_PK")
    private Integer EmpPositionPk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private EmpInfo empInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_POSITION_CODE", nullable = false)
    private BasicPosition basicPosition;

    @Column(name = "EMP_POSITION_START_DATE")
    private Calendar empPositionStartDate;

    @Column(name = "EMP_POSITION_END_DATE")
    private Calendar empPositionEndDate;

    public EmpPosition() {

    }

    public Integer getEmpPositionPk() {
        return EmpPositionPk;
    }

    public void setEmpPositionPk(Integer empPositionPk) {
        EmpPositionPk = empPositionPk;
    }

    public BasicPosition getBasicPosition() {
        return basicPosition;
    }

    public void setBasicPosition(BasicPosition basicPosition) {
        this.basicPosition = basicPosition;
    }

    public Calendar getEmpPositionStartDate() {
        return empPositionStartDate;
    }

    public void setEmpPositionStartDate(Calendar empPositionStartDate) {
        this.empPositionStartDate = empPositionStartDate;
    }

    public Calendar getEmpPositionEndDate() {
        return empPositionEndDate;
    }

    public void setEmpPositionEndDate(Calendar empPositionEndDate) {
        this.empPositionEndDate = empPositionEndDate;
    }

    public EmpInfo getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }

}
