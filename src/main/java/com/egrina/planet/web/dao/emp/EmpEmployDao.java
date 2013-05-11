package com.egrina.planet.web.dao.emp;

import java.util.List;
import com.egrina.planet.web.entity.emp.EmpEmploy;

public interface EmpEmployDao {
    public List<EmpEmploy> findAll();

    public EmpEmploy findById(Integer empEmployPk);

    public void delete(Integer empEmployPk);

    public EmpEmploy save(EmpEmploy empEmploy);
    
    public EmpEmploy findLatest();
}
