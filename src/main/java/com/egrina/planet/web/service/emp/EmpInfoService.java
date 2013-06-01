package com.egrina.planet.web.service.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egrina.planet.web.dao.basic.BasicZipDao;
import com.egrina.planet.web.dao.emp.EmpInfoDao;
import com.egrina.planet.web.entity.emp.EmpInfo;

@Service
public class EmpInfoService {

    @Autowired
    private EmpInfoDao empInfoDao;
    @Autowired
    private BasicZipDao basicZipDao;

    public List<EmpInfo> findAll() {
        return empInfoDao.findAll();
    }

    public EmpInfo save(EmpInfo empInfo) {
        if (empInfo.getEmpCode() != null) {
            // update
            empInfoDao.save(empInfo);
        } else {
            // insert
            // Create New Code
            // 1. get Latest Record from t_emp_info
            EmpInfo latestRecord = empInfoDao.findLatest();
            if (latestRecord != null) {
                System.out.println(latestRecord.getEmpCode());
            } else {
                System.out.println("latestRecord is NULL!!!");
            }

            // 2. get String (empCode) from Record.
            String tempEmpCode = latestRecord.getEmpCode();
            // 3. get Last 4 digits from String(empCode)
            String tempEmpCode1 = tempEmpCode.substring(4);
            // 4. plus 1 from 4 digits and concat "ASIA" String.
            Integer tempEmpCode2 = Integer.parseInt(tempEmpCode1);
            tempEmpCode2++;
            String tempEmpCode3 = "";
            if (tempEmpCode2 < 10) {
                tempEmpCode3 = "ASIA000".concat(String.valueOf(tempEmpCode2));
            }
            // 5. setEmpCode(newCode) to empInfo Instance.
            empInfo.setEmpCode(tempEmpCode3);
            empInfo.setBasicZipCode(basicZipDao.findById("100-0001"));
            empInfoDao.save(empInfo);
        }
        return empInfo;
    }

    public EmpInfo findById(String empCode) {
        return empInfoDao.findById(empCode);
    }

    public void delete(String empCode) {
        empInfoDao.delete(empCode);
    }

}
