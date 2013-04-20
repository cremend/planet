package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicCompanyDao;
import com.egrina.planet.web.entity.basic.BasicCompany;
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
@RequestMapping("/ZA/005")
public class CompanyController {

    @Autowired
    private BasicCompanyDao basicCompanyDao;

    @ModelAttribute("companyList")
    public List<BasicCompany> getAllCompanyList() {
        return basicCompanyDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/005/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("company", new BasicCompany());
        return "za/005/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("company") BasicCompany company, Model model) {
        basicCompanyDao.save(company);
        model.addAttribute("companyList", getAllCompanyList());
        model.asMap().clear();
        return "redirect:/ZA/005";
    }

    @RequestMapping(value = "/form/{CompanyCode}", method = RequestMethod.GET)
    public String form(@PathVariable(value = "CompanyCode") Integer companyCode, Model model) {
        model.addAttribute("company", basicCompanyDao.findById(companyCode));
        return "za/005/form";
    }

    @RequestMapping(value = "/form/{CompanyCode}", method = RequestMethod.POST)
    public String form(@PathVariable(value = "CompanyCode") Integer companyCode, @ModelAttribute("company") BasicCompany company, Model model) {
        company.setBasicCompanyCode(companyCode);
        basicCompanyDao.save(company);
        model.addAttribute("companyList", getAllCompanyList());
        model.asMap().clear();
        return "redirect:/ZA/005";
    }

    @RequestMapping(value = "/delete/{CompanyCode}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "CompanyCode") Integer companyCode, Model model) {
        basicCompanyDao.delete(companyCode);
        model.asMap().clear();
        return "redirect:/ZA/005";
    }

}
