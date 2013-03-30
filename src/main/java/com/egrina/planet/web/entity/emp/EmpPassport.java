package com.egrina.planet.web.entity.emp;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_EMP_PASSPORT")
public class EmpPassport {
	
	@Id
	@Column(name="EMP_PASSPORT_PK")
	private Integer empPassportPk;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMP_CODE", nullable=false)
	private EmpInfo empInfo;
	
	@Column(name="EMP_PASSPORT_NO")
	private String empPassportNo;
	
	@Column(name="EMP_PASSPORT_START_DATE")
	private Calendar empPassportStartDate;
	
	@Column(name="EMP_PASSPORT_END_DATE")
	private Calendar empPassportEndDate;
	
	public EmpPassport(){
		
	}

	public Integer getEmpPassportPk() {
		return empPassportPk;
	}

	public void setEmpPassportPk(Integer empPassportPk) {
		this.empPassportPk = empPassportPk;
	}

	public EmpInfo getEmpInfo() {
		return empInfo;
	}

	public void setEmpInfo(EmpInfo empInfo) {
		this.empInfo = empInfo;
	}

	public String getEmpPassportNo() {
		return empPassportNo;
	}

	public void setEmpPassportNo(String empPassportNo) {
		this.empPassportNo = empPassportNo;
	}

	public Calendar getEmpPassportStartDate() {
		return empPassportStartDate;
	}

	public void setEmpPassportStartDate(Calendar empPassportStartDate) {
		this.empPassportStartDate = empPassportStartDate;
	}

	public Calendar getEmpPassportEndDate() {
		return empPassportEndDate;
	}

	public void setEmpPassportEndDate(Calendar empPassportEndDate) {
		this.empPassportEndDate = empPassportEndDate;
	}

}