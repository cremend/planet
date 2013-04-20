package com.egrina.planet.web.dao.emp;

import java.util.List;

import com.egrina.planet.web.entity.emp.*;

public interface EmpSiteDao {

    public List<EmpSite> findAll();

    public EmpSite findById(Integer empAssignIdx);

    public void delete(Integer EmpSitePk);

    public EmpSite save(EmpSite empSite);
}
