package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicNationDao;
import com.egrina.planet.web.entity.basic.BasicNation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/ZA/009")
public class NationController {

    @Autowired
    private BasicNationDao basicNationDao;

    @ModelAttribute("nationList")
    public List<BasicNation> getAllNationList() {
        return basicNationDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/009/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("nation", new BasicNation());
        return "za/009/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("nation") BasicNation nation, Model model) {
        basicNationDao.save(nation);
        model.addAttribute("nationList", getAllNationList());
        model.asMap().clear();
        return "redirect:/ZA/009";
    }

    @RequestMapping(value = "/form/{NationCode}", method = RequestMethod.GET)
    public String form(@PathVariable(value = "NationCode") Integer nationCode, Model model) {
        model.addAttribute("nation", basicNationDao.findById(nationCode));
        return "za/009/form";
    }

    @RequestMapping(value = "/form/{NationCode}", method = RequestMethod.POST)
    public String form(@PathVariable(value = "NationCode") Integer nationCode, @ModelAttribute("nation") BasicNation nation, Model model) {
        nation.setBasicNationCode(nationCode);
        basicNationDao.save(nation);
        model.addAttribute("nationList", getAllNationList());
        model.asMap().clear();
        return "redirect:/ZA/009";
    }

    @RequestMapping(value = "/delete/{NationCode}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "NationCode") Integer nationCode, Model model) {
        basicNationDao.delete(nationCode);
        model.asMap().clear();
        return "redirect:/ZA/009";
    }
}