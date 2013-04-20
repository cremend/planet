package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicWorkTypeDao;
import com.egrina.planet.web.entity.basic.BasicWorkType;
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
@RequestMapping("/ZA/007")
public class WorkTypeController {

    @Autowired
    private BasicWorkTypeDao basicWorkTypeDao;

    @ModelAttribute("workTypeList")
    public List<BasicWorkType> getAllWorkTypeList() {
        return basicWorkTypeDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/007/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("workType", new BasicWorkType());
        return "za/007/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("workType") BasicWorkType workType, Model model) {
        basicWorkTypeDao.save(workType);
        model.addAttribute("workTypeList", getAllWorkTypeList());
        model.asMap().clear();
        return "redirect:/ZA/007";
    }

    @RequestMapping(value = "/form/{WorkTypeCode}", method = RequestMethod.GET)
    public String form(@PathVariable(value = "WorkTypeCode") Integer workTypeCode, Model model) {
        model.addAttribute("workType", basicWorkTypeDao.findById(workTypeCode));
        return "za/007/form";
    }

    @RequestMapping(value = "/form/{WorkTypeCode}", method = RequestMethod.POST)
    public String form(@PathVariable(value = "WorkTypeCode") Integer workTypeCode, @ModelAttribute("workType") BasicWorkType workType, Model model) {
        workType.setBasicWorkTypeCode(workTypeCode);
        basicWorkTypeDao.save(workType);
        model.addAttribute("workTypeList", getAllWorkTypeList());
        model.asMap().clear();
        return "redirect:/ZA/007";
    }

    @RequestMapping(value = "/delete/{WorkTypeCode}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "WorkTypeCode") Integer workTypeCode, Model model) {
        basicWorkTypeDao.delete(workTypeCode);
        model.asMap().clear();
        return "redirect:/ZA/007";
    }

}
