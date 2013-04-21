package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicEmployDao;
import com.egrina.planet.web.entity.basic.BasicEmploy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/ZA/012")
public class EmployController {

    @Autowired
    private BasicEmployDao basicEmployDao;

    @ModelAttribute("employList")
    public List<BasicEmploy> getAllEmployList() {
        return basicEmployDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/012/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("employ", new BasicEmploy());
        return "za/012/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("employ") BasicEmploy employ, Model model) {
        basicEmployDao.save(employ);
        model.addAttribute("employList", getAllEmployList());
        model.asMap().clear();
        return "redirect:/ZA/012";
    }

    @RequestMapping(value = "/form/{EmployCode}", method = RequestMethod.GET)
    public String form(@PathVariable(value = "EmployCode") Integer employCode, Model model) {
        model.addAttribute("employ", basicEmployDao.findById(employCode));
        return "za/012/form";
    }

    @RequestMapping(value = "/form/{EmployCode}", method = RequestMethod.POST)
    public String form(@PathVariable(value = "EmployCode") Integer employCode, @ModelAttribute("employ") BasicEmploy employ, Model model) {
        employ.setBasicEmployCode(employCode);
        basicEmployDao.save(employ);
        model.addAttribute("employList", getAllEmployList());
        model.asMap().clear();
        return "redirect:/ZA/012";
    }

    @RequestMapping(value = "/delete/{EmployCode}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "EmployCode") Integer employCode, Model model) {
        basicEmployDao.delete(employCode);
        model.asMap().clear();
        return "redirect:/ZA/012";
    }
}