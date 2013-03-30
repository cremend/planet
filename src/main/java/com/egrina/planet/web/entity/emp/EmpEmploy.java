package com.egrina.planet.web.entity.emp;

//import java.util.Date;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.egrina.planet.web.entity.basic.*;

@Entity
@Table(name="T_EMP_EMPLOY")
public class EmpEmploy {
	
	@Id
	@Column(name="EMP_EMPLOY_PK")
	@GeneratedValue
	private Integer empEmployPk;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMP_CODE", nullable=false)
	private EmpInfo empInfo;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMP_EMPLOY_CODE", nullable=false)
	private BasicEmploy basicEmploy;
	
	public EmpEmploy(){
	}

	public Integer getEmpEmployPk() {
		return empEmployPk;
	}

	public void setEmpEmployPk(Integer empEmployPk) {
		this.empEmployPk = empEmployPk;
	}

	public EmpInfo getEmpInfo() {
		return empInfo;
	}

	public void setEmpInfo(EmpInfo empInfo) {
		this.empInfo = empInfo;
	}

	public BasicEmploy getBasicEmploy() {
		return basicEmploy;
	}

	public void setBasicEmploy(BasicEmploy basicEmploy) {
		this.basicEmploy = basicEmploy;
	}

	}
