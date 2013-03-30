package com.egrina.planet.web.entity.rel;

import java.util.Date;
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
@Table(name="T_REL_PASS_REPORT")
public class RelPassReport {

	@Id
	@Column(name="REL_PASS_REPORT_PK")
	@GeneratedValue
	private Integer relHolidayApplyReportPk;
	
	@Column(name="RESULT")
	private boolean result;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMP_PASS_PK", nullable=false)
	private EmpPass empPass;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMP_CODE1", referencedColumnName = "EMP_CODE", nullable=false)
	private EmpInfo empInfo1;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMP_CODE2", referencedColumnName = "EMP_CODE", nullable=false)
	private EmpInfo empInfo2;
}
