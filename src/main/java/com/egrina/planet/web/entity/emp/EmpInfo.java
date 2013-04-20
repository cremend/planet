package com.egrina.planet.web.entity.emp;

import java.util.Date;
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
import com.egrina.planet.web.entity.basic.*;

@Entity
@Table(name="T_EMP_INFO")
public class EmpInfo {

	@Id
	@GeneratedValue
	@Column(name="EMP_CODE")
	private String empCode;
	
	@Column(name="EMP_NAME")	
	private String empName;
	
	@Column(name="EMP_GENDER")
	private Integer empGender;
	
	@Column(name="EMP_BIRTH")
	private Date empBirth;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BASIC_ZIP_CODE", nullable=false)
	private BasicZip basicZipCode;
	
	@Column(name="EMP_ADDRESS")
	private String empAddress;
	
	@Column(name="EMP_PHONE")
	private Integer empPhone;
	
	@Column(name="EMP_PHONE2")
	private Integer empPhone2;
	
	@Column(name="EMP_EMAIL")
	private String empEmail;
	
	@Column(name="EMP_EMAIL2")
	private String empEmail2;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpContract> empContractList;	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpSite> empSiteList;	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpWorkTime> empWorkTimeList;	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpPass> empPassList;	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpCharge1> empCharge1List;	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpCharge2> empCharge2List;	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpHoliday> empHolidayList;	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpHolidayApply> empHolidayApplyList;	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpWorkReport> empWorkReportList;	
	
	//追加
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpPosition> empPositionList;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpJoin> empJoinList;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpResidence> empResidenceList;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpPassport> empPassportList;
		
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpDuty> empDutyList;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo")
	private List<EmpEmploy> empEmployList;
	
	//20130309追加	
//	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo1")
//	private List<RelSiteTech> relSiteTechList1;
//
//	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo2")
//	private List<RelSiteTech> relSiteTechList2;
//	
//	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo1")
//	private List<RelWorkTimeReport> relWorkTimeReportList1;
//
//	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo2")
//	private List<RelWorkTimeReport> relWorkTimeReportList2;
//	
//	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo1")
//	private List<RelHolidayApplyReport> relHolidayApplyReportList1;
//
//	@OneToMany(fetch=FetchType.LAZY, mappedBy="empInfo2")
//	private List<RelHolidayApplyReport> relHolidayApplyReportList2;
	
	public EmpInfo(){
		
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpGender() {
		return empGender;
	}

	public void setEmpGender(Integer empGender) {
		this.empGender = empGender;
	}

	public Date getEmpBirth() {
		return empBirth;
	}

	public void setEmpBirth(Date empBirth) {
		this.empBirth = empBirth;
	}

	public BasicZip getBasicZipCode() {
		return basicZipCode;
	}

	public void setBasicZipCode(BasicZip basicZipCode) {
		this.basicZipCode = basicZipCode;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public Integer getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(Integer empPhone) {
		this.empPhone = empPhone;
	}

	public Integer getEmpPhone2() {
		return empPhone2;
	}

	public void setEmpPhone2(Integer empPhone2) {
		this.empPhone2 = empPhone2;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpEmail2() {
		return empEmail2;
	}

	public void setEmpEmail2(String empEmail2) {
		this.empEmail2 = empEmail2;
	}

	public List<EmpContract> getEmpContractList() {
		return empContractList;
	}

	public void setEmpContractList(List<EmpContract> empContractList) {
		this.empContractList = empContractList;
	}

	public List<EmpSite> getEmpSiteList() {
		return empSiteList;
	}

	public void setEmpSiteList(List<EmpSite> empSiteList) {
		this.empSiteList = empSiteList;
	}

	public List<EmpWorkTime> getEmpWorkTimeList() {
		return empWorkTimeList;
	}

	public void setEmpWorkTimeList(List<EmpWorkTime> empWorkTimeList) {
		this.empWorkTimeList = empWorkTimeList;
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

	public List<EmpCharge2> getEmpCharge2List() {
		return empCharge2List;
	}

	public void setEmpCharge2List(List<EmpCharge2> empCharge2List) {
		this.empCharge2List = empCharge2List;
	}

	public List<EmpHoliday> getEmpHolidayList() {
		return empHolidayList;
	}

	public void setEmpHolidayList(List<EmpHoliday> empHolidayList) {
		this.empHolidayList = empHolidayList;
	}

	public List<EmpHolidayApply> getEmpHolidayApplyList() {
		return empHolidayApplyList;
	}

	public void setEmpHolidayApplyList(List<EmpHolidayApply> empHolidayApplyList) {
		this.empHolidayApplyList = empHolidayApplyList;
	}

	public List<EmpWorkReport> getEmpWorkReportList() {
		return empWorkReportList;
	}

	public void setEmpWorkReportList(List<EmpWorkReport> empWorkReportList) {
		this.empWorkReportList = empWorkReportList;
	}

	public List<EmpPosition> getEmpPositionList() {
		return empPositionList;
	}

	public void setEmpPositionList(List<EmpPosition> empPositionList) {
		this.empPositionList = empPositionList;
	}

	public List<EmpJoin> getEmpJoinList() {
		return empJoinList;
	}

	public void setEmpJoinList(List<EmpJoin> empJoinList) {
		this.empJoinList = empJoinList;
	}

	public List<EmpResidence> getEmpResidenceList() {
		return empResidenceList;
	}

	public void setEmpResidenceList(List<EmpResidence> empResidenceList) {
		this.empResidenceList = empResidenceList;
	}

	public List<EmpPassport> getEmpPassportList() {
		return empPassportList;
	}

	public void setEmpPassportList(List<EmpPassport> empPassportList) {
		this.empPassportList = empPassportList;
	}

	public List<EmpDuty> getEmpDutyList() {
		return empDutyList;
	}

	public void setEmpDutyList(List<EmpDuty> empDutyList) {
		this.empDutyList = empDutyList;
	}

	public List<EmpEmploy> getEmpEmployList() {
		return empEmployList;
	}

	public void setEmpEmployList(List<EmpEmploy> empEmployList) {
		this.empEmployList = empEmployList;
	}


	
}
