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
@Table(name="T_BASIC_JOB_CATEGORY")
public class BasicJobCategory {

	@Id
	@Column(name="BASIC_JOB_CATEGORY_CODE")
	@GeneratedValue
	private Integer basicJobCategoryCode;
	
	@Column(name="BASIC_JOB_CATEGORY_NAME")
	private String basicJobCategoryName;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="basicJobCategory")
	private List<EmpSite> empSiteList;	
	
	public BasicJobCategory(){
		
	}

	public Integer getBasicJobCategoryCode() {
		return basicJobCategoryCode;
	}

	public void setBasicJobCategoryCode(Integer basicJobCategoryCode) {
		this.basicJobCategoryCode = basicJobCategoryCode;
	}

	public String getBasicJobCategoryName() {
		return basicJobCategoryName;
	}

	public void setBasicJobCategoryName(String basicJobCategoryName) {
		this.basicJobCategoryName = basicJobCategoryName;
	}

	public List<EmpSite> getEmpSiteList() {
		return empSiteList;
	}

	public void setEmpSiteList(List<EmpSite> empSiteList) {
		this.empSiteList = empSiteList;
	}
	
	
}
