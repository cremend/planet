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
@Table(name = "T_BASIC_DUTY")
public class BasicDuty {

	@Id
	@Column(name = "BASIC_DUTY_CODE")
	private Integer basicDutyCode;

	@Column(name = "BASIC_DUTY_NAME")
	private String basicDutyName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "basicDutyCode")
	private List<EmpDuty> empDutyList;

	public BasicDuty() {

	}

	public Integer getBasicDutyCode() {
		return basicDutyCode;
	}

	public void setBasicDutyCode(Integer basicDutyCode) {
		this.basicDutyCode = basicDutyCode;
	}

	public String getBasicDutyName() {
		return basicDutyName;
	}

	public void setBasicDutyName(String basicDutyName) {
		this.basicDutyName = basicDutyName;
	}

	public List<EmpDuty> getEmpDutyList() {
		return empDutyList;
	}

	public void setEmpDutyList(List<EmpDuty> empDutyList) {
		this.empDutyList = empDutyList;
	}

}
