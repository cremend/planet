package com.egrina.planet.web.service.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egrina.planet.web.dao.basic.BasicVisaDao;
import com.egrina.planet.web.dao.emp.EmpInfoDao;
import com.egrina.planet.web.dao.emp.EmpResidenceDao;
import com.egrina.planet.web.entity.emp.EmpEmploy;
import com.egrina.planet.web.entity.emp.EmpInfo;
import com.egrina.planet.web.entity.emp.EmpResidence;

@Service
public class EmpResidenceService {

    @Autowired
    private EmpResidenceDao empResidenceDao;
    
    @Autowired
    private EmpInfoDao empInfoDao;
    
    @Autowired
    private BasicVisaDao basicVisaDao;
    
    public List<EmpResidence> findAll(){
        return empResidenceDao.findAll();
    }
    

    public EmpResidence findById(Integer empResidencePk){
        return empResidenceDao.findById(empResidencePk);
    }

    public void delete(Integer empResidencePk){
        empResidenceDao.delete(empResidencePk);
    }

    public EmpResidence save(EmpResidence empResidence){
        if (empResidence.getEmpResidencePk() != null) {
            // update
            empResidenceDao.save(empResidence);
        } else {
            // insert
            // Create New Code
            // 1. get Latest Record from t_emp_info
            EmpResidence latestRecord = empResidenceDao.findLatest();
            if (latestRecord != null) {
                System.out.println(latestRecord.getEmpResidencePk());
            } else {
                System.out.println("latestRecord is NULL!!!");
            }

            // 2. get String (empCode) from Record.
            Integer tempEmpResidencePk = latestRecord.getEmpResidencePk();
            tempEmpResidencePk++;
            empResidence.setEmpResidencePk(tempEmpResidencePk);
            empResidenceDao.save(empResidence);
            // 3. get Last 4 digits from String(empCode)
//            Integer tempEmpResidencePk1 = tempEmpCode.substring(4);
//            // 4. plus 1 from 4 digits and concat "ASIA" String.
//            Integer tempEmpCode2 = Integer.parseInt(tempEmpCode1);
//            tempEmpCode2++;
//            String tempEmpCode3 = "";
//            if (tempEmpCode2 < 10) {
//                tempEmpCode3 = "ASIA000".concat(String.valueOf(tempEmpCode2));
//            }
//            // 5. setEmpCode(newCode) to empInfo Instance.
//            empInfo.setEmpCode(tempEmpCode3);
//            empInfo.setBasicZipCode(basicZipDao.findById(1));
//            empInfoDao.save(empInfo);
        }
        
        return empResidence;
    }
    
    public List<EmpResidence> findAllByEmpCode(String empCode) {
        return empResidenceDao.findAllByEmpCode(empCode);
    }
}
