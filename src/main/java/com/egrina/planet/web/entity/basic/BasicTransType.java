package com.egrina.planet.web.entity.basic;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.egrina.planet.web.entity.emp.*;

@Entity
@Table(name="T_BASIC_TRANS_TYPE")
public class BasicTransType {

	@Id
	@Column(name="BASIC_TRANS_TYPE_CODE")
	@GeneratedValue
	private Integer basicTransTypeCode;
	
	@Column(name="BASIC_TRANS_TYPE_NAME")
	private String basicTransTypeName;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="basicTransType")
	private List<EmpPass> empPassList;	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="basicTransType")
	private List<EmpCharge1> empCharge1List;	
	
	//Constructor
	public BasicTransType(){
	}

	public Integer getBasicTransTypeCode() {
		return basicTransTypeCode;
	}

	public void setBasicTransTypeCode(Integer basicTransTypeCode) {
		this.basicTransTypeCode = basicTransTypeCode;
	}

	public String getBasicTransTypeName() {
		return basicTransTypeName;
	}

	public void setBasicTransTypeName(String basicTransTypeName) {
		this.basicTransTypeName = basicTransTypeName;
	}

	public List<EmpPass> getEmpPassList() {
		return empPassList;
	}

	public void setEmpPassList(List<EmpPass> empPassList) {
		this.empPassList = empPassList;
	}

	public List<EmpCharge1> getEmpCharge1List() {
		return empCharge1List;
	}

	public void setEmpCharge1List(List<EmpCharge1> empCharge1List) {
		this.empCharge1List = empCharge1List;
	}


	
}
