package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicJobCategoryDao;
import com.egrina.planet.web.entity.basic.BasicJobCategory;
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
@RequestMapping("/ZA/014")
public class JobCategoryController {

    @Autowired
    private BasicJobCategoryDao basicJobCategoryDao;

    @ModelAttribute("jobCategoryList")
    public List<BasicJobCategory> getAllJobCategoryList() {
        return basicJobCategoryDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/014/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("jobCategory", new BasicJobCategory());
        return "za/014/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("jobCategory") BasicJobCategory jobCategory, Model model) {
        basicJobCategoryDao.save(jobCategory);
        model.addAttribute("jobCategoryList", getAllJobCategoryList());
        model.asMap().clear();
        return "redirect:/ZA/014";
    }

    @RequestMapping(value = "/form/{JobCategoryCode}", method = RequestMethod.GET)
    public String form(@PathVariable(value = "JobCategoryCode") Integer jobCategoryCode, Model model) {
        model.addAttribute("jobCategory", basicJobCategoryDao.findById(jobCategoryCode));
        return "za/014/form";
    }

    @RequestMapping(value = "/form/{JobCategoryCode}", method = RequestMethod.POST)
    public String form(@PathVariable(value = "JobCategoryCode") Integer jobCategoryCode, @ModelAttribute("jobCategory") BasicJobCategory jobCategory, Model model) {
        jobCategory.setBasicJobCategoryCode(jobCategoryCode);
        basicJobCategoryDao.save(jobCategory);
        model.addAttribute("jobCategoryList", getAllJobCategoryList());
        model.asMap().clear();
        return "redirect:/ZA/014";
    }

    @RequestMapping(value = "/delete/{JobCategoryCode}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "JobCategoryCode") Integer jobCategoryCode, Model model) {
        basicJobCategoryDao.delete(jobCategoryCode);
        model.asMap().clear();
        return "redirect:/ZA/014";
    }

}
