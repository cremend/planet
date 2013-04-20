package com.egrina.planet.web.dao.basic;

import java.util.List;

import com.egrina.planet.web.entity.basic.BasicEmploy;

public interface BasicEmployDao {
    public List<BasicEmploy> findAll();

    public BasicEmploy findById(Integer basicEmployCode);

    public void delete(Integer basicEmployCode);

    public BasicEmploy save(BasicEmploy basicEmploy);
}
