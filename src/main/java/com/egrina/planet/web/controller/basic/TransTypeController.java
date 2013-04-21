package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicTransTypeDao;
import com.egrina.planet.web.entity.basic.BasicTransType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/ZA/015")
public class TransTypeController {

    @Autowired
    private BasicTransTypeDao basicTransTypeDao;

    @ModelAttribute("transTypeList")
    public List<BasicTransType> getAllTransTypeList() {
        return basicTransTypeDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/015/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("transType", new BasicTransType());
        return "za/015/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("transType") BasicTransType transType, Model model) {
        basicTransTypeDao.save(transType);
        model.addAttribute("transTypeList", getAllTransTypeList());
        model.asMap().clear();
        return "redirect:/ZA/015";
    }

    @RequestMapping(value = "/form/{TransTypeCode}", method = RequestMethod.GET)
    public String form(@PathVariable(value = "TransTypeCode") Integer transTypeCode, Model model) {
        model.addAttribute("transType", basicTransTypeDao.findById(transTypeCode));
        return "za/015/form";
    }

    @RequestMapping(value = "/form/{TransTypeCode}", method = RequestMethod.POST)
    public String form(@PathVariable(value = "TransTypeCode") Integer transTypeCode, @ModelAttribute("transType") BasicTransType transType, Model model) {
        transType.setBasicTransTypeCode(transTypeCode);
        basicTransTypeDao.save(transType);
        model.addAttribute("transTypeList", getAllTransTypeList());
        model.asMap().clear();
        return "redirect:/ZA/015";
    }

    @RequestMapping(value = "/delete/{TransTypeCode}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "TransTypeCode") Integer transTypeCode, Model model) {
        basicTransTypeDao.delete(transTypeCode);
        model.asMap().clear();
        return "redirect:/ZA/015";
    }
}