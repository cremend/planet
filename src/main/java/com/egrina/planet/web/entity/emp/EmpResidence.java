package com.egrina.planet.web.entity.emp;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.Table;
import com.egrina.planet.web.entity.basic.*;
@Entity
@Table(name="T_EMP_RESIDENCE")
public class EmpResidence {
	
	@Id
	@GeneratedValue
	@Column(name="EMP_RESIDENCE_PK")
	private Integer empResidencePk;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMP_CODE", nullable=false)
	private EmpInfo empInfo;
	
	@Column(name="EMP_RESIDENCE_NO")
	private String empResidenceNo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BASIC_VISA_CODE", nullable=false)
	private BasicVisa basicVisa;
	
	@Column(name="EMP_RESIDENCE_START_DATE")
	private Calendar empResidenceStartDate;
	
	@Column(name="EMP_RESIDENCE_END_DATE")
	private Calendar empResidenceEndDate;
	
	public EmpResidence(){
		
	}

	public Integer getEmpResidencePk() {
		return empResidencePk;
	}

	public void setEmpResidencePk(Integer empResidencePk) {
		this.empResidencePk = empResidencePk;
	}

	public EmpInfo getEmpInfo() {
		return empInfo;
	}

	public void setEmpInfo(EmpInfo empInfo) {
		this.empInfo = empInfo;
	}

	public String getEmpResidenceNo() {
		return empResidenceNo;
	}

	public void setEmpResidenceNo(String empResidenceNo) {
		this.empResidenceNo = empResidenceNo;
	}

	public BasicVisa getBasicVisa() {
		return basicVisa;
	}

	public void setBasicVisa(BasicVisa basicVisa) {
		this.basicVisa = basicVisa;
	}

	public Calendar getEmpResidenceStartDate() {
		return empResidenceStartDate;
	}

	public void setEmpResidenceStartDate(Calendar empResidenceStartDate) {
		this.empResidenceStartDate = empResidenceStartDate;
	}

	public Calendar getEmpResidenceEndDate() {
		return empResidenceEndDate;
	}

	public void setEmpResidenceEndDate(Calendar empResidenceEndDate) {
		this.empResidenceEndDate = empResidenceEndDate;
	}

}