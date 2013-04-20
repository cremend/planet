package com.egrina.planet.web.dao.basic;

import java.util.List;
import com.egrina.planet.web.entity.basic.*;

public interface BasicJobCategoryDao {

    public List<BasicJobCategory> findAll();

    public BasicJobCategory findById(Integer basicJobCategoryCode);

    public void delete(Integer basicGroupCode);

    public BasicJobCategory save(BasicJobCategory basicJobCategory);
}
