package com.egrina.planet.web.service.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egrina.planet.web.dao.emp.EmpInfoDao;
import com.egrina.planet.web.dao.emp.EmpPassportDao;
import com.egrina.planet.web.entity.emp.EmpPassport;

@Service
public class EmpPassportService {

    @Autowired
    private EmpPassportDao empPassportDao;

    @Autowired
    private EmpInfoDao empInfoDao;

    public List<EmpPassport> findAll() {
        return empPassportDao.findAll();
    }

    public EmpPassport findById(Integer empPassportPk) {
        return empPassportDao.findById(empPassportPk);
    }

    public void delete(Integer empPassportPk) {
        empPassportDao.delete(empPassportPk);
    }

    public EmpPassport save(EmpPassport empPassport) {
        if (empPassport.getEmpPassportPk() != null) {
            // update
            empPassportDao.save(empPassport);
        } else {
            // insert
            // Create New Code
            // 1. get Latest Record from t_emp_info
            EmpPassport latestRecord = empPassportDao.findLatest();
            if (latestRecord != null) {
                System.out.println(latestRecord.getEmpPassportPk());
            } else {
                System.out.println("latestRecord is NULL!!!");
            }

            // 2. get String (empCode) from Record.
            Integer tempEmpPassportPk = latestRecord.getEmpPassportPk();
            tempEmpPassportPk++;
            empPassport.setEmpPassportPk(tempEmpPassportPk);
            empPassportDao.save(empPassport);
        }
        return empPassport;
    }

    public List<EmpPassport> findAllByEmpCode(String empCode) {
        return empPassportDao.findAllByEmpCode(empCode);
    }
}
