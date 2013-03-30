package com.egrina.planet.web.dao;

import java.util.List;
import com.egrina.planet.web.entity.basic.*;

public interface BasicPositionDao {
	public List<BasicPosition> findAll();
	public BasicPosition findById(Integer basicPositionCode);
	public void delete(Integer basicPositionCode);
	public BasicPosition save(BasicPosition basicPosition);
}
