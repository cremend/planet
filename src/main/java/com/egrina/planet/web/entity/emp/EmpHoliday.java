package com.egrina.planet.web.entity.emp;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_EMP_HOLIDAY")
public class EmpHoliday {

    @Id
    @GeneratedValue
    @Column(name = "EMP_HOLIDAY_PK")
    private Integer empHolidayPk;

    @Column(name = "EMP_HOLIDAY_DATE")
    private Date empHolidayDate;

    @Column(name = "EMP_HOLIDAY_CONTENT")
    private String empHolidayContent;

    @Column(name = "EMP_HOLIDAY_USE_DAYS")
    private Integer empHolidayUseDays;

    @Column(name = "EMP_HOLIDAY_ANNUAL_BALANCE")
    private Integer empHolidayAnnualBalance;

    @Column(name = "EMP_HOLIDAY_SUBST_BALANCE")
    private Integer empHolidaySubstBalance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private EmpInfo empInfo;

    public EmpHoliday() {
    }

    public Integer getEmpHolidayPk() {
        return empHolidayPk;
    }

    public void setEmpHolidayPk(Integer empHolidayPk) {
        this.empHolidayPk = empHolidayPk;
    }

    public Date getEmpHolidayDate() {
        return empHolidayDate;
    }

    public void setEmpHolidayDate(Date empHolidayDate) {
        this.empHolidayDate = empHolidayDate;
    }

    public String getEmpHolidayContent() {
        return empHolidayContent;
    }

    public void setEmpHolidayContent(String empHolidayContent) {
        this.empHolidayContent = empHolidayContent;
    }

    public Integer getEmpHolidayUseDays() {
        return empHolidayUseDays;
    }

    public void setEmpHolidayUseDays(Integer empHolidayUseDays) {
        this.empHolidayUseDays = empHolidayUseDays;
    }

    public Integer getEmpHolidayAnnualBalance() {
        return empHolidayAnnualBalance;
    }

    public void setEmpHolidayAnnualBalance(Integer empHolidayAnnualBalance) {
        this.empHolidayAnnualBalance = empHolidayAnnualBalance;
    }

    public Integer getEmpHolidaySubstBalance() {
        return empHolidaySubstBalance;
    }

    public void setEmpHolidaySubstBalance(Integer empHolidaySubstBalance) {
        this.empHolidaySubstBalance = empHolidaySubstBalance;
    }

    public EmpInfo getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }
}