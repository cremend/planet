package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicVisaDao;
import com.egrina.planet.web.entity.basic.BasicVisa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/ZA/011")
public class VisaController {

    @Autowired
    private BasicVisaDao basicVisaDao;

    @ModelAttribute("visaList")
    public List<BasicVisa> getAllVisaList() {
        return basicVisaDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/011/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("visa", new BasicVisa());
        return "za/011/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("visa") BasicVisa visa, Model model) {
        basicVisaDao.save(visa);
        model.addAttribute("visaList", getAllVisaList());
        model.asMap().clear();
        return "redirect:/ZA/011";
    }

    @RequestMapping(value = "/form/{VisaCode}", method = RequestMethod.GET)
    public String form(@PathVariable(value = "VisaCode") Integer visaCode, Model model) {
        model.addAttribute("visa", basicVisaDao.findById(visaCode));
        return "za/011/form";
    }

    @RequestMapping(value = "/form/{VisaCode}", method = RequestMethod.POST)
    public String form(@PathVariable(value = "VisaCode") Integer visaCode, @ModelAttribute("visa") BasicVisa visa, Model model) {
        visa.setBasicVisaCode(visaCode);
        basicVisaDao.save(visa);
        model.addAttribute("visaList", getAllVisaList());
        model.asMap().clear();
        return "redirect:/ZA/011";
    }

    @RequestMapping(value = "/delete/{VisaCode}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "VisaCode") Integer visaCode, Model model) {
        basicVisaDao.delete(visaCode);
        model.asMap().clear();
        return "redirect:/ZA/011";
    }
}