package com.egrina.planet.web.service.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egrina.planet.web.dao.basic.BasicEmployDao;
import com.egrina.planet.web.dao.emp.EmpEmployDao;
import com.egrina.planet.web.dao.emp.EmpInfoDao;
import com.egrina.planet.web.dao.emp.EmpJoinDao;
import com.egrina.planet.web.entity.emp.EmpEmploy;

@Service
public class EmpEmployService {

    @Autowired
    private EmpEmployDao empEmployDao;
    @Autowired
    private EmpInfoDao empInfoDao;
    @Autowired
    private EmpJoinDao empJoinDao;
    @Autowired
    private BasicEmployDao basicEmployDao;
    
    
    public List<EmpEmploy> findAll(){
        return empEmployDao.findAll();
    }

    public EmpEmploy findById(Integer empEmployPk){
        return empEmployDao.findById(empEmployPk);
    }

    public void delete(Integer empEmployPk){
        empEmployDao.delete(empEmployPk);
    }

    public EmpEmploy save(EmpEmploy empEmploy){
        if(empEmploy.getEmpEmployPk()!=null){
            empEmployDao.save(empEmploy);
        }else{
            // insert
            // Create New Code
            // 1. get Latest Record from t_emp_info
            EmpEmploy latestRecord = empEmployDao.findLatest();
            if (latestRecord != null) {
                System.out.println(latestRecord.getEmpEmployPk());
            } else {
                System.out.println("latestRecord is NULL!!!");
            }

            // 2. get String (empCode) from Record.
            Integer tempEmpEmployPk = latestRecord.getEmpEmployPk();
            tempEmpEmployPk++;
            empEmploy.setEmpEmployPk(tempEmpEmployPk);
            empEmployDao.save(empEmploy);
        }
        return empEmploy;
    }
}
