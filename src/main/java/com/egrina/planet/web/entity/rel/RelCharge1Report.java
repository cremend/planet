package com.egrina.planet.web.entity.rel;

//import java.util.Date;
//import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.egrina.planet.web.entity.emp.*;

@Entity
@Table(name="T_REL_CHARGE1_REPORT")
public class RelCharge1Report {

	@Id
	@Column(name="REL_CHARGE1_REPORT_PK")
	@GeneratedValue
	private Integer relCharge1ReportPk;
	
	@Column(name="RESULT")
	private boolean result;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMP_CHARGE1_PK", nullable=false)
	private EmpCharge1 empCharge1;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMP_CODE1", referencedColumnName = "EMP_CODE", nullable=false)
	private EmpInfo empInfo1;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMP_CODE2", referencedColumnName = "EMP_CODE", nullable=false)
	private EmpInfo empInfo2;
	
	public RelCharge1Report(){
		
	}

	public EmpCharge1 getEmpCharge1() {
		return empCharge1;
	}

	public void setEmpCharge1(EmpCharge1 empCharge1) {
		this.empCharge1 = empCharge1;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public Integer getRelCharge1ReportPk() {
		return relCharge1ReportPk;
	}

	public void setRelCharge1ReportPk(Integer relCharge1ReportPk) {
		this.relCharge1ReportPk = relCharge1ReportPk;
	}

	public EmpInfo getEmpInfo1() {
		return empInfo1;
	}

	public void setEmpInfo1(EmpInfo empInfo1) {
		this.empInfo1 = empInfo1;
	}

	public EmpInfo getEmpInfo2() {
		return empInfo2;
	}

	public void setEmpInfo2(EmpInfo empInfo2) {
		this.empInfo2 = empInfo2;
	}
	
    
}
