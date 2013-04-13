package com.egrina.planet.web.dao.basic;

import java.util.List;

import com.egrina.planet.web.entity.basic.*;

public interface BasicCompanyDao {
    public List<BasicCompany> findAll();

    public BasicCompany findById(Integer basicCompanyCode);

    public void delete(Integer basicCompanyCode);

    public BasicCompany save(BasicCompany basicCompany);
}
