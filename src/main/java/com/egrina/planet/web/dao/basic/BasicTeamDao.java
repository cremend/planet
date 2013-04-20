package com.egrina.planet.web.dao.basic;

import java.util.List;
import com.egrina.planet.web.entity.basic.BasicTeam;

public interface BasicTeamDao {
    public List<BasicTeam> findAll();

    public BasicTeam findById(Integer basicTeamCode);

    public void delete(Integer basicTeamCode);

    public BasicTeam save(BasicTeam basicTeam);
}
