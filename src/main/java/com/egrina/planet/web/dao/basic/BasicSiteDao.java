package com.egrina.planet.web.dao.basic;

import java.util.List;

import com.egrina.planet.web.entity.basic.*;

public interface BasicSiteDao {
    public List<BasicSite> findAll();

    public BasicSite findById(Integer basicSiteCode);

    public void delete(Integer basicSiteCode);

    public BasicSite save(BasicSite basicSite);
}
