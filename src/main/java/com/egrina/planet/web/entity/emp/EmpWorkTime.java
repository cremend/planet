package com.egrina.planet.web.entity.emp;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.egrina.planet.web.entity.basic.BasicWorkType;

@Entity
@Table(name = "T_EMP_WORK_TIME")
public class EmpWorkTime {

    @Id
    @GeneratedValue
    @Column(name = "EMP_WORK_TIME_PK")
    private Integer empWorkTimePk;

    @Column(name = "EMP_WORK_TIME_DATE")
    private Date empWorkTimeDate;

    @Column(name = "EMP_WORK_TIME_APPEND")
    private Integer empWorkTimeAppend;

    @Column(name = "EMP_WORK_TIME_CLOSE")
    private Integer empWorkTimeClose;

    @Column(name = "EMP_WORK_TIME_REST")
    private Integer empWorkTimeRest;

    @Column(name = "EMP_WORK_TIME_CONFIRM")
    private boolean empWorkTimeConfirm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private EmpInfo empInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_WORK_TYPE_CODE", nullable = false)
    private BasicWorkType basicWorkType;

    public EmpWorkTime() {
    }

    public Integer getEmpWorkTimePk() {
        return empWorkTimePk;
    }

    public void setEmpWorkTimePk(Integer empWorkTimePk) {
        this.empWorkTimePk = empWorkTimePk;
    }

    public Date getEmpWorkTimeDate() {
        return empWorkTimeDate;
    }

    public void setEmpWorkTimeDate(Date empWorkTimeDate) {
        this.empWorkTimeDate = empWorkTimeDate;
    }

    public Integer getEmpWorkTimeAppend() {
        return empWorkTimeAppend;
    }

    public void setEmpWorkTimeAppend(Integer empWorkTimeAppend) {
        this.empWorkTimeAppend = empWorkTimeAppend;
    }

    public Integer getEmpWorkTimeClose() {
        return empWorkTimeClose;
    }

    public void setEmpWorkTimeClose(Integer empWorkTimeClose) {
        this.empWorkTimeClose = empWorkTimeClose;
    }

    public Integer getEmpWorkTimeRest() {
        return empWorkTimeRest;
    }

    public void setEmpWorkTimeRest(Integer empWorkTimeRest) {
        this.empWorkTimeRest = empWorkTimeRest;
    }

    public boolean isEmpWorkTimeConfirm() {
        return empWorkTimeConfirm;
    }

    public void setEmpWorkTimeConfirm(boolean empWorkTimeConfirm) {
        this.empWorkTimeConfirm = empWorkTimeConfirm;
    }

    public EmpInfo getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }

    public BasicWorkType getBasicWorkType() {
        return basicWorkType;
    }

    public void setBasicWorkType(BasicWorkType basicWorkType) {
        this.basicWorkType = basicWorkType;
    }
}