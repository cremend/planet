package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicDutyDao;
import com.egrina.planet.web.entity.basic.BasicDuty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/ZA/004")
public class DutyController {

    @Autowired
    private BasicDutyDao basicDutyDao;

    @ModelAttribute("dutyList")
    public List<BasicDuty> getAllDutyList() {
        return basicDutyDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/004/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("duty", new BasicDuty());
        return "za/004/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("duty") BasicDuty duty, Model model) {
        basicDutyDao.save(duty);
        model.addAttribute("dutyList", getAllDutyList());
        model.asMap().clear();
        return "redirect:/ZA/004";
    }

    @RequestMapping(value = "/form/{DutyCode}", method = RequestMethod.GET)
    public String form(@PathVariable(value = "DutyCode") Integer dutyCode, Model model) {
        model.addAttribute("duty", basicDutyDao.findById(dutyCode));
        return "za/004/form";
    }

    @RequestMapping(value = "/form/{DutyCode}", method = RequestMethod.POST)
    public String form(@PathVariable(value = "DutyCode") Integer dutyCode, @ModelAttribute("duty") BasicDuty duty, Model model) {
        duty.setBasicDutyCode(dutyCode);
        basicDutyDao.save(duty);
        model.addAttribute("dutyList", getAllDutyList());
        model.asMap().clear();
        return "redirect:/ZA/004";
    }

    @RequestMapping(value = "/delete/{DutyCode}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "DutyCode") Integer dutyCode, Model model) {
        basicDutyDao.delete(dutyCode);
        model.asMap().clear();
        return "redirect:/ZA/004";
    }
}