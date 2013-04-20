package com.egrina.planet.web.dao.basic;

import java.util.List;
import com.egrina.planet.web.entity.basic.*;

public interface BasicWorkTypeDao {
    public List<BasicWorkType> findAll();

    public BasicWorkType findById(Integer basicWorkTypeCode);

    public void delete(Integer basicWorkTypeCode);

    public BasicWorkType save(BasicWorkType basicWorkType);
}
