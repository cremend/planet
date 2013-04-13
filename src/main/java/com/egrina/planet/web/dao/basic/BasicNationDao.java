package com.egrina.planet.web.dao.basic;

import java.util.List;
import com.egrina.planet.web.entity.basic.*;

public interface BasicNationDao {

	public List<BasicNation> findAll();

    public BasicNation findById(Integer basicNationCode);

    public void delete(Integer basicNationCode);

    public BasicNation save(BasicNation basicNation);
}
