package com.egrina.planet.web.dao.basic;

import java.util.List;

import com.egrina.planet.web.entity.basic.BasicTech;

public interface BasicTechDao {
    public List<BasicTech> findAll();

    public BasicTech findById(Integer basicTechCode);

    public void delete(Integer basicTechCode);

    public BasicTech save(BasicTech basicTech);
}
