package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicRoleDao;
import com.egrina.planet.web.entity.basic.BasicRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created with IntelliJ IDEA. User: xperad Date: 西暦.13/03/31 Time: 0:37 To
 * change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/ZA/010")
public class RoleController {

    @Autowired
    private BasicRoleDao basicRoleDao;

    @ModelAttribute("roleList")
    public List<BasicRole> getAllRoleList() {
        return basicRoleDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/010/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("role", new BasicRole());
        return "za/010/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("role") BasicRole role, Model model) {
        basicRoleDao.save(role);
        model.addAttribute("roleList", getAllRoleList());
        model.asMap().clear();
        return "redirect:/ZA/010";
    }

    @RequestMapping(value = "/form/{RoleCode}", method = RequestMethod.GET)
    public String form(@PathVariable(value = "RoleCode") Integer roleCode, Model model) {
        model.addAttribute("role", basicRoleDao.findById(roleCode));
        return "za/010/form";
    }

    @RequestMapping(value = "/form/{RoleCode}", method = RequestMethod.POST)
    public String form(@PathVariable(value = "RoleCode") Integer roleCode, @ModelAttribute("role") BasicRole role, Model model) {
        role.setBasicRoleCode(roleCode);
        basicRoleDao.save(role);
        model.addAttribute("roleList", getAllRoleList());
        model.asMap().clear();
        return "redirect:/ZA/010";
    }

    @RequestMapping(value = "/delete/{RoleCode}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "RoleCode") Integer roleCode, Model model) {
        basicRoleDao.delete(roleCode);
        model.asMap().clear();
        return "redirect:/ZA/010";
    }

}
