package com.egrina.planet.web.dao.basic;

import java.util.List;
import com.egrina.planet.web.entity.basic.*;

public interface BasicZipDao {
	public List<BasicZip> findAll();

    public BasicZip findById(Integer basicZipCode);

    public void delete(Integer basicZipCode);

    public BasicZip save(BasicZip basicZip);
}
