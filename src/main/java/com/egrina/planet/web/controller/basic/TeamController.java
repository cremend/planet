package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicGroupDao;
import com.egrina.planet.web.dao.basic.BasicTeamDao;
import com.egrina.planet.web.entity.basic.BasicGroup;
import com.egrina.planet.web.entity.basic.BasicTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/ZA/003")
public class TeamController {

    @Autowired
    private BasicTeamDao basicTeamDao;

    @Autowired
    private BasicGroupDao basicGroupDao;

    @ModelAttribute("teamList")
    public List<BasicTeam> getAllTeamList() {
        return basicTeamDao.findAll();
    }

    @ModelAttribute("groupList")
    public List<BasicGroup> getAllGroupList() {
        return basicGroupDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/003/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("team", new BasicTeam());
        return "za/003/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("team") BasicTeam team, Model model) {
        basicTeamDao.save(team);
        model.addAttribute("teamList", getAllTeamList());
        model.asMap().clear();
        return "redirect:/ZA/003";
    }

    @RequestMapping(value = "/form/{TeamCode}", method = RequestMethod.GET)
    public String form(@PathVariable(value = "TeamCode") Integer teamCode, Model model) {
        model.addAttribute("team", basicTeamDao.findById(teamCode));
        return "za/003/form";
    }

    @RequestMapping(value = "/form/{TeamCode}", method = RequestMethod.POST)
    public String form(@PathVariable(value = "TeamCode") Integer teamCode, @ModelAttribute("team") BasicTeam team, Model model) {
        team.setBasicTeamCode(teamCode);
        basicTeamDao.save(team);
        model.addAttribute("teamList", getAllTeamList());
        model.asMap().clear();
        return "redirect:/ZA/003";
    }

    @RequestMapping(value = "/delete/{TeamCode}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "TeamCode") Integer teamCode, Model model) {
        basicTeamDao.delete(teamCode);
        model.asMap().clear();
        return "redirect:/ZA/003";
    }
}