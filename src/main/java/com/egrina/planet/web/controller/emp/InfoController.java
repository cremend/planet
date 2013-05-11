package com.egrina.planet.web.controller.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.egrina.planet.web.entity.emp.EmpInfo;
import com.egrina.planet.web.entity.emp.EmpResidence;
import com.egrina.planet.web.entity.emp.EmpPassport;
import com.egrina.planet.web.service.emp.EmpInfoService;
import com.egrina.planet.web.service.emp.EmpResidenceService;
import com.egrina.planet.web.service.emp.EmpPassportService;

@Controller
@RequestMapping("AA/001")
public class InfoController {

    @Autowired
    private EmpInfoService empInfoService;
    
    @Autowired
    private EmpResidenceService empResidenceService;
    
    @Autowired
    private EmpPassportService empPassportService;
    
    @ModelAttribute("empInfoList")
    public List<EmpInfo> getAllEmpInfoList() {
        return empInfoService.findAll();
    }
    
    @ModelAttribute("empResidenceList")
    public List<EmpResidence> getAllEmpResidenceList() {
        return empResidenceService.findAll();
    }
    
    @ModelAttribute("empPassportList")
    public List<EmpPassport> getAllEmpPassportList() {
        return empPassportService.findAll();
    }
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String Index() {
        return "aa/001/list";
    }
    
    @RequestMapping(value="/form", method = RequestMethod.GET)
    public String formInfo(Model model){
            model.addAttribute("empInfo", new EmpInfo());
            return "aa/001/form";
    }
    
    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String formInfo(@ModelAttribute("empInfo") EmpInfo empInfo, Model model) {
        empInfoService.save(empInfo);
        model.addAttribute("empInfoList", getAllEmpInfoList());
        model.asMap().clear();
        return "redirect:/AA/001";
    }
    
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String formResidence(Model model) {
        model.addAttribute("empResidence", new EmpResidence());
        return "aa/001/form";
    }
    
    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String formResidence(@ModelAttribute("empResidence") EmpResidence empResidence, Model model) {
        empResidenceService.save(empResidence);
        model.addAttribute("empResidence", getAllEmpResidenceList());
        model.asMap().clear();
        return "redirect:/AA/001";
    }
    
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String formPassport(Model model) {
        model.addAttribute("empPassport", new EmpPassport());
        return "aa/001/form";
    }
    
    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String formPassport(@ModelAttribute("empPassport") EmpPassport empPassport, Model model) {
        empPassportService.save(empPassport);
        model.addAttribute("empPassport", getAllEmpPassportList());
        model.asMap().clear();
        return "redirect:/AA/001";
    }
    
    @RequestMapping(value = "/delete/{empCode}", method = RequestMethod.GET)
    public String deleteInfo(@PathVariable(value = "empCode") String empCode, Model model) {
        empInfoService.delete(empCode);
        model.asMap().clear();
        return "redirect:/AA/001";
    }
    
    @RequestMapping(value = "/delete/{empResidencePk}", method = RequestMethod.GET)
    public String deleteResidence(@PathVariable(value = "empResidencePk") Integer empResidencePk, Model model) {
        empResidenceService.delete(empResidencePk);
        model.asMap().clear();
        return "redirect:/AA/001";
    }
    
    @RequestMapping(value = "/delete/{empPassportPk}", method = RequestMethod.GET)
    public String deletePassport(@PathVariable(value = "empPassportPk") Integer empPassportPk, Model model) {
        empPassportService.delete(empPassportPk);
        model.asMap().clear();
        return "redirect:/AA/001";
    }
}
