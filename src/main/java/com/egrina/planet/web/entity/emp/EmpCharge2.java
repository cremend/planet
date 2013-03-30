package com.egrina.planet.web.entity.emp;

import java.util.Date;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_EMP_charge2")
public class EmpCharge2 {

	@Id
	@Column(name="EMP_charge2_PK")
	@GeneratedValue
	private Integer empcharge2Pk;
	
	@Column(name="EMP_charge2_TYPE")
	private Integer empcharge2Type;
	
	@Column(name="EMP_charge2_DATE")
	private Date empcharge2Date;
	
	@Column(name="EMP_charge2_CONTENT")
	private String empcharge2Content;
	
	@Column(name="EMP_charge2_AMOUNT")
	private Integer empcharge2Amount;
	
	@Column(name="EMP_charge2_FILE_PATH")
	private String empcharge2FilePath;
	
	@Column(name="EMP_charge2_CONFIRM")
	private boolean empcharge2Confirm;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMP_CODE", nullable=false)
	private EmpInfo empInfo;
	
	public EmpCharge2(){
		
	}

	public Integer getEmpcharge2Pk() {
		return empcharge2Pk;
	}

	public void setEmpcharge2Pk(Integer empcharge2Pk) {
		this.empcharge2Pk = empcharge2Pk;
	}

	public Integer getEmpcharge2Type() {
		return empcharge2Type;
	}

	public void setEmpcharge2Type(Integer empcharge2Type) {
		this.empcharge2Type = empcharge2Type;
	}

	public Date getEmpcharge2Date() {
		return empcharge2Date;
	}

	public void setEmpcharge2Date(Date empcharge2Date) {
		this.empcharge2Date = empcharge2Date;
	}

	public String getEmpcharge2Content() {
		return empcharge2Content;
	}

	public void setEmpcharge2Content(String empcharge2Content) {
		this.empcharge2Content = empcharge2Content;
	}

	public Integer getEmpcharge2Amount() {
		return empcharge2Amount;
	}

	public void setEmpcharge2Amount(Integer empcharge2Amount) {
		this.empcharge2Amount = empcharge2Amount;
	}

	public String getEmpcharge2FilePath() {
		return empcharge2FilePath;
	}

	public void setEmpcharge2FilePath(String empcharge2FilePath) {
		this.empcharge2FilePath = empcharge2FilePath;
	}

	public boolean isEmpcharge2Confirm() {
		return empcharge2Confirm;
	}

	public void setEmpcharge2Confirm(boolean empcharge2Confirm) {
		this.empcharge2Confirm = empcharge2Confirm;
	}

	public EmpInfo getEmpInfo() {
		return empInfo;
	}

	public void setEmpInfo(EmpInfo empInfo) {
		this.empInfo = empInfo;
	}

	
}
