package com.egrina.planet.web.entity.basic;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import javax.persistence.Table;
import com.egrina.planet.web.entity.rel.*;

@Entity
@Table(name="T_BASIC_TECH")
public class BasicTech {

	@Id
	@Column(name="BASIC_TECH_CODE")
	private Integer basicTechCode;
	
	@Column(name="BASIC_TECH_NAME")
	private String basicTechName;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="basicTechCode")
	private List<RelSiteTech> relSiteTechList;
	
	public BasicTech(){
	
	}

	public Integer getBasicTechCode() {
		return basicTechCode;
	}

	public void setBasicTechCode(Integer basicTechCode) {
		this.basicTechCode = basicTechCode;
	}

	public String getBasicTechName() {
		return basicTechName;
	}

	public void setBasicTechName(String basicTechName) {
		this.basicTechName = basicTechName;
	}
	
	
}
