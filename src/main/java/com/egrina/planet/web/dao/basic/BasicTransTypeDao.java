package com.egrina.planet.web.dao.basic;

import java.util.List;

import com.egrina.planet.web.entity.basic.BasicTransType;

public interface BasicTransTypeDao {
    public List<BasicTransType> findAll();

    public BasicTransType findById(Integer basicTransTypeCode);

    public void delete(Integer basicTransTypeCode);

    public BasicTransType save(BasicTransType basicTransType);
}
