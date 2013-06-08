package com.egrina.planet.web.dao.basic;

import java.util.List;
import com.egrina.planet.web.entity.basic.*;

public interface BasicZipDao {
    public List<BasicZip> findAll();

    public BasicZip findById(String basicZipCode);

    public void delete(String basicZipCode);

    public BasicZip save(BasicZip basicZip);
}
