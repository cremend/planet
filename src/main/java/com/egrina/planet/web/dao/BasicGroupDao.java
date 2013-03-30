package com.egrina.planet.web.dao;

import java.util.List;
import com.egrina.planet.web.entity.basic.*;

public interface BasicGroupDao {
	public List<BasicGroup> findAll();
	public BasicGroup findById(Integer basicGroupCode);
	public void delete(Integer basicGroupCode);
	public BasicGroup save(BasicGroup basicGroup);
}
