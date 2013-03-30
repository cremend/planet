package com.egrina.planet.web.entity.basic;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.egrina.planet.web.entity.emp.*;

@Entity
@Table(name="T_BASIC_COMPANY")
public class BasicCompany {

	@Id
	@Column(name="BASIC_COMPANY_CODE")
	private Integer basicCompanyCode; 

	@Column(name="BASIC_COMPANY_NAME")
	private String basicCompanyName; 

	@OneToMany(fetch=FetchType.LAZY, mappedBy="basicCompanyCode")
	private List<BasicSite> listBasicSite;	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="basicCompany")
	private List<EmpContract> empContractList;	
	
	public BasicCompany(){
		
	}

	public Integer getBasicCompanyCode() {
		return basicCompanyCode;
	}

	public void setBasicCompanyCode(Integer basicCompanyCode) {
		this.basicCompanyCode = basicCompanyCode;
	}

	public String getBasicCompanyName() {
		return basicCompanyName;
	}

	public void setBasicCompanyName(String basicCompanyName) {
		this.basicCompanyName = basicCompanyName;
	}

	public List<BasicSite> getListBasicSite() {
		return listBasicSite;
	}

	public void setListBasicSite(List<BasicSite> listBasicSite) {
		this.listBasicSite = listBasicSite;
	}


}
