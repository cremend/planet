package com.egrina.planet.web.entity.rel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.egrina.planet.web.entity.emp.*;
import com.egrina.planet.web.entity.basic.*;

@Entity
@Table(name="T_REL_WORK_SITE_REPORT")
public class RelSiteTech {

	@Id
	@Column(name="REL_SITE_TECH_PK")
	private Integer indexId;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMP_SITE_PK", referencedColumnName = "EMP_SITE_PK", nullable=false)
	private EmpSite empSitePk; 
		
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BASIC_TECH_CODE", nullable=false)
	private BasicTech basicTechCode; 

	public RelSiteTech(){
		
	}

	public EmpSite getEmpSitePk() {
		return empSitePk;
	}

	public void setEmpSitePk(EmpSite empSitePk) {
		this.empSitePk = empSitePk;
	}

	public BasicTech getBasicTechCode() {
		return basicTechCode;
	}

	public void setBasicTechCode(BasicTech basicTechCode) {
		this.basicTechCode = basicTechCode;
	}
	
}
