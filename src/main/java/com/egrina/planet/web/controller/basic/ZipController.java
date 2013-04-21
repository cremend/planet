package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicZipDao;
import com.egrina.planet.web.entity.basic.BasicZip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/ZA/008")
public class ZipController {

    @Autowired
    private BasicZipDao basicZipDao;

    @ModelAttribute("zipList")
    public List<BasicZip> getAllZipList() {
        return basicZipDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/008/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("zip", new BasicZip());
        return "za/008/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("zip") BasicZip zip, Model model) {
        basicZipDao.save(zip);
        model.addAttribute("zipList", getAllZipList());
        model.asMap().clear();
        return "redirect:/ZA/008";
    }

    @RequestMapping(value = "/form/{ZipCode}", method = RequestMethod.GET)
    public String form(@PathVariable(value = "ZipCode") Integer zipCode, Model model) {
        model.addAttribute("zip", basicZipDao.findById(zipCode));
        return "za/008/form";
    }

    @RequestMapping(value = "/form/{ZipCode}", method = RequestMethod.POST)
    public String form(@PathVariable(value = "ZipCode") Integer zipCode, @ModelAttribute("zip") BasicZip zip, Model model) {
        zip.setBasicZipCode(zipCode);
        basicZipDao.save(zip);
        model.addAttribute("zipList", getAllZipList());
        model.asMap().clear();
        return "redirect:/ZA/008";
    }

    @RequestMapping(value = "/delete/{ZipCode}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "ZipCode") Integer zipCode, Model model) {
        basicZipDao.delete(zipCode);
        model.asMap().clear();
        return "redirect:/ZA/008";
    }
}