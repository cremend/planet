package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicTechDao;
import com.egrina.planet.web.entity.basic.BasicTech;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/ZA/013")
public class TechController {

    @Autowired
    private BasicTechDao basicTechDao;

    @ModelAttribute("techList")
    public List<BasicTech> getAllTechList() {
        return basicTechDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/013/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("tech", new BasicTech());
        return "za/013/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("tech") BasicTech tech, Model model) {
        basicTechDao.save(tech);
        model.addAttribute("techList", getAllTechList());
        model.asMap().clear();
        return "redirect:/ZA/013";
    }

    @RequestMapping(value = "/form/{TechCode}", method = RequestMethod.GET)
    public String form(@PathVariable(value = "TechCode") Integer techCode, Model model) {
        model.addAttribute("tech", basicTechDao.findById(techCode));
        return "za/013/form";
    }

    @RequestMapping(value = "/form/{TechCode}", method = RequestMethod.POST)
    public String form(@PathVariable(value = "TechCode") Integer techCode, @ModelAttribute("tech") BasicTech tech, Model model) {
        tech.setBasicTechCode(techCode);
        basicTechDao.save(tech);
        model.addAttribute("techList", getAllTechList());
        model.asMap().clear();
        return "redirect:/ZA/013";
    }

    @RequestMapping(value = "/delete/{TechCode}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "TechCode") Integer techCode, Model model) {
        basicTechDao.delete(techCode);
        model.asMap().clear();
        return "redirect:/ZA/013";
    }
}