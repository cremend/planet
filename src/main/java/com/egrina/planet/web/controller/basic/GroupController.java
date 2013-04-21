package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicGroupDao;
import com.egrina.planet.web.entity.basic.BasicGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/ZA/002")
public class GroupController {

    @Autowired
    private BasicGroupDao basicGroupDao;

    @ModelAttribute("groupList")
    public List<BasicGroup> getAllGroupList() {
        return basicGroupDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/002/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("group", new BasicGroup());
        return "za/002/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("group") BasicGroup group, Model model) {
        basicGroupDao.save(group);
        model.addAttribute("groupList", getAllGroupList());
        model.asMap().clear();
        return "redirect:/ZA/002";
    }

    @RequestMapping(value = "/form/{GroupCode}", method = RequestMethod.GET)
    public String form(@PathVariable(value = "GroupCode") Integer groupCode, Model model) {
        model.addAttribute("group", basicGroupDao.findById(groupCode));
        return "za/002/form";
    }

    @RequestMapping(value = "/form/{GroupCode}", method = RequestMethod.POST)
    public String form(@PathVariable(value = "GroupCode") Integer groupCode, @ModelAttribute("group") BasicGroup group, Model model) {
        group.setBasicGroupCode(groupCode);
        basicGroupDao.save(group);
        model.addAttribute("groupList", getAllGroupList());
        model.asMap().clear();
        return "redirect:/ZA/002";
    }

    @RequestMapping(value = "/delete/{GroupCode}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "GroupCode") Integer groupCode, Model model) {
        basicGroupDao.delete(groupCode);
        model.asMap().clear();
        return "redirect:/ZA/002";
    }
}