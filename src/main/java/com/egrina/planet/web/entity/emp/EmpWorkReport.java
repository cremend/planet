package com.egrina.planet.web.entity.emp;

import java.sql.Time;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "T_EMP_WORK_REPORT")
public class EmpWorkReport {

    @Id
    @Column(name = "EMP_WORK_REPORT_PK")
    @GeneratedValue
    private Integer empWorkReportPk;

    // @Column(name="EMP_CODE")
    // private String empCode;

    @Column(name = "BASIC_WORK_REPORT_TYPE_CODE")
    private Integer basicWorkReportTypeCode;

    @Column(name = "EMP_WORK_REPORT_DATE1")
    private Date empWorkReportDate1;

    @Column(name = "EMP_WORK_REPORT_DATE2")
    private Date empWorkReportDate2;

    @Column(name = "EMP_WORK_REPORT_CONTENT1")
    private Time empWorkReportContent1;

    @Column(name = "EMP_WORK_REPORT_CONTENT2")
    private Time empWorkReportContent2;

    @Column(name = "EMP_WORK_REPORT_CONTENT3")
    private Time empWorkReportContent3;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_CODE", nullable = false)
    private EmpInfo empInfo;

    public EmpWorkReport() {

    }

    public Integer getEmpWorkReportPk() {
        return empWorkReportPk;
    }

    public void setEmpWorkReportPk(Integer empWorkReportPk) {
        this.empWorkReportPk = empWorkReportPk;
    }

    public Integer getBasicWorkReportTypeCode() {
        return basicWorkReportTypeCode;
    }

    public void setBasicWorkReportTypeCode(Integer basicWorkReportTypeCode) {
        this.basicWorkReportTypeCode = basicWorkReportTypeCode;
    }

    public Date getEmpWorkReportDate1() {
        return empWorkReportDate1;
    }

    public void setEmpWorkReportDate1(Date empWorkReportDate1) {
        this.empWorkReportDate1 = empWorkReportDate1;
    }

    public Date getEmpWorkReportDate2() {
        return empWorkReportDate2;
    }

    public void setEmpWorkReportDate2(Date empWorkReportDate2) {
        this.empWorkReportDate2 = empWorkReportDate2;
    }

    public Time getEmpWorkReportContent1() {
        return empWorkReportContent1;
    }

    public void setEmpWorkReportContent1(Time empWorkReportContent1) {
        this.empWorkReportContent1 = empWorkReportContent1;
    }

    public Time getEmpWorkReportContent2() {
        return empWorkReportContent2;
    }

    public void setEmpWorkReportContent2(Time empWorkReportContent2) {
        this.empWorkReportContent2 = empWorkReportContent2;
    }

    public Time getEmpWorkReportContent3() {
        return empWorkReportContent3;
    }

    public void setEmpWorkReportContent3(Time empWorkReportContent3) {
        this.empWorkReportContent3 = empWorkReportContent3;
    }

    public EmpInfo getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }

}
