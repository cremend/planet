package com.egrina.planet.web.service.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egrina.planet.web.dao.basic.BasicGroupDao;
import com.egrina.planet.web.dao.basic.BasicTeamDao;
import com.egrina.planet.web.dao.emp.EmpAssignDao;
import com.egrina.planet.web.dao.emp.EmpInfoDao;
import com.egrina.planet.web.entity.emp.EmpAssign;

@Service
public class EmpAssignService {

    @Autowired
    private EmpAssignDao empAssignDao;
    @Autowired
    private EmpInfoDao empInfoDao;
    @Autowired
    private BasicGroupDao basicGroupDao;
    @Autowired
    private BasicTeamDao basicTeamDao;
    
    public List<EmpAssign> findAll(){
        return empAssignDao.findAll();
    }

    public EmpAssign findById(Integer empAssignPk){
        return empAssignDao.findById(empAssignPk);
    }

    public void delete(Integer empAssignPk){
        empAssignDao.delete(empAssignPk);
    }

    public EmpAssign save(EmpAssign empAssign){
        if(empAssign.getEmpAssignPk()!=null){
            empAssignDao.save(empAssign);
        }else{
            // insert
            // Create New Code
            // 1. get Latest Record from t_emp_info
            EmpAssign latestRecord = empAssignDao.findLatest();
            if (latestRecord != null) {
                System.out.println(latestRecord.getEmpAssignPk());
            } else {
                System.out.println("latestRecord is NULL!!!");
            }

            // 2. get String (empCode) from Record.
            Integer tempEmpAssignPk = latestRecord.getEmpAssignPk();
            tempEmpAssignPk++;
            empAssign.setEmpAssignPk(tempEmpAssignPk);
            empAssignDao.save(empAssign);
        }
        return empAssign;
    }
}
