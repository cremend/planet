package com.egrina.planet.web.controller.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.egrina.planet.web.entity.basic.BasicPosition;
import com.egrina.planet.web.entity.emp.EmpInfo;
import com.egrina.planet.web.service.emp.EmpInfoService;

@Controller
@RequestMapping("AA/001")
public class EmpInfoController {

    @Autowired
    private EmpInfoService empInfoService;
    
    @ModelAttribute("empInfoList")
    public List<EmpInfo> getAllEmpInfoList() {
        return empInfoService.findAll();
    }
    
//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public String index() {
//        empInfoService.test();
//        return "aa/001/list";
//    }
//    
    @RequestMapping(value="/form", method = RequestMethod.GET)
    public String addForm(Model model){
            model.addAttribute("empInfo", new EmpInfo());
            return "aa/001/form";
    }
    
    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("empInfo") EmpInfo empInfo, Model model) {
        empInfoService.save(empInfo);
        model.addAttribute("empInfoList", getAllEmpInfoList());
        model.asMap().clear();
        return "redirect:/AA/001";
    }
}
