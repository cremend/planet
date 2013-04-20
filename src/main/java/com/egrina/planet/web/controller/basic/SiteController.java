package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicSiteDao;
import com.egrina.planet.web.entity.basic.BasicSite;
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
@RequestMapping("/ZA/006")
public class SiteController {

    @Autowired
    private BasicSiteDao basicSiteDao;

    @ModelAttribute("siteList")
    public List<BasicSite> getAllSiteList() {
        return basicSiteDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/006/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("site", new BasicSite());
        return "za/006/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("site") BasicSite site, Model model) {
        basicSiteDao.save(site);
        model.addAttribute("siteList", getAllSiteList());
        model.asMap().clear();
        return "redirect:/ZA/006";
    }

    @RequestMapping(value = "/form/{SiteCode}", method = RequestMethod.GET)
    public String form(@PathVariable(value = "SiteCode") Integer siteCode, Model model) {
        model.addAttribute("site", basicSiteDao.findById(siteCode));
        return "za/006/form";
    }

    @RequestMapping(value = "/form/{SiteCode}", method = RequestMethod.POST)
    public String form(@PathVariable(value = "SiteCode") Integer siteCode, @ModelAttribute("site") BasicSite site, Model model) {
        site.setBasicSiteCode(siteCode);
        basicSiteDao.save(site);
        model.addAttribute("siteList", getAllSiteList());
        model.asMap().clear();
        return "redirect:/ZA/006";
    }

    @RequestMapping(value = "/delete/{SiteCode}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "SiteCode") Integer siteCode, Model model) {
        basicSiteDao.delete(siteCode);
        model.asMap().clear();
        return "redirect:/ZA/006";
    }

}
