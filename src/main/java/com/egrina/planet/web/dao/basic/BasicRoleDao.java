package com.egrina.planet.web.dao.basic;

import java.util.List;

import com.egrina.planet.web.entity.basic.*;

public interface BasicRoleDao {
    public List<BasicRole> findAll();

    public BasicRole findById(Integer basicRoleCode);

    public void delete(Integer basicRoleCode);

    public BasicRole save(BasicRole basicRole);
}
