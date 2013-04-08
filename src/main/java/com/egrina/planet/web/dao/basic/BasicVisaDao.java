package com.egrina.planet.web.dao.basic;

import java.util.List;

import com.egrina.planet.web.entity.basic.BasicVisa;

public interface BasicVisaDao {
	public List<BasicVisa> findAll();

    public BasicVisa findById(Integer basicVisaCode);

    public void delete(Integer basicVisaCode);

    public BasicVisa save(BasicVisa basicVisa);
}
