package com.egrina.planet.web.dao.rel;

import java.util.List;

import com.egrina.planet.web.entity.rel.RelSiteTech;

public interface RelSiteTechDao {
    public List<RelSiteTech> findAll();

    public RelSiteTech findById(Integer relSiteTechPk);

    public void delete(Integer relSiteTechPk);

    public RelSiteTech save(RelSiteTech relSiteTech);
}
