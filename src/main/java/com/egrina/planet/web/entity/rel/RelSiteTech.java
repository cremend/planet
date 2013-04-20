package com.egrina.planet.web.entity.rel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.egrina.planet.web.entity.emp.*;
import com.egrina.planet.web.entity.basic.*;

@Entity
@Table(name = "T_REL_SITE_TECH")
public class RelSiteTech {

    @Id
    @Column(name = "REL_SITE_TECH_PK")
    @GeneratedValue
    private Integer relSiteTechPk;
    
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_SITE_PK", referencedColumnName = "EMP_SITE_PK", nullable = false)
    private EmpSite empSitePk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASIC_TECH_CODE", nullable = false)
    private BasicTech basicTechCode;

    public RelSiteTech() {

    }

    
    public Integer getRelSiteTechPk() {
        return relSiteTechPk;
    }


    public void setRelSiteTechPk(Integer relSiteTechPk) {
        this.relSiteTechPk = relSiteTechPk;
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
