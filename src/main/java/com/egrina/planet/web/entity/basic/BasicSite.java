package com.egrina.planet.web.entity.basic;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.egrina.planet.web.entity.emp.*;

@Entity
@Table(name="T_BASIC_SITE")
public class BasicSite {

	@Id
	@GeneratedValue
	@Column(name="BASIC_SITE_CODE")
	private Integer basicSiteCode; 

	@Column(name="BASIC_SITE_NAME")
	private String basicSiteName; 

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BASIC_COMPANY_CODE", nullable=false)
	private BasicCompany basicCompanyCode;	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="basicSite")
	private List<EmpSite> empSiteList;	
	
	public BasicSite(){
		
	}

	public Integer getBasicSiteCode() {
		return basicSiteCode;
	}

	public void setBasicSiteCode(Integer basicSiteCode) {
		this.basicSiteCode = basicSiteCode;
	}

	public String getBasicSiteName() {
		return basicSiteName;
	}

	public void setBasicSiteName(String basicSiteName) {
		this.basicSiteName = basicSiteName;
	}

	public BasicCompany getBasicCompanyCode() {
		return basicCompanyCode;
	}

	public void setBasicCompanyCode(BasicCompany basicCompanyCode) {
		this.basicCompanyCode = basicCompanyCode;
	}

	public List<EmpSite> getEmpSiteList() {
		return empSiteList;
	}

	public void setEmpSiteList(List<EmpSite> empSiteList) {
		this.empSiteList = empSiteList;
	}


}