package com.egrina.planet.web.dao.basic;

import java.util.List;
import com.egrina.planet.web.entity.basic.*;

public interface BasicDutyDao {
    public List<BasicDuty> findAll();

    public BasicDuty findById(Integer basicDutyCode);

    public void delete(Integer basicGroupCode);

    public BasicDuty save(BasicDuty basicDuty);
}
