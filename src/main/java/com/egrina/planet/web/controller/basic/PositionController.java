package com.egrina.planet.web.controller.basic;

import com.egrina.planet.web.dao.basic.BasicPositionDao;
import com.egrina.planet.web.entity.basic.BasicPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xperad
 * Date: 西暦.13/03/31
 * Time: 0:37
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/ZA/001")
public class PositionController {

    @Autowired
    private BasicPositionDao basicPositionDao;

    @ModelAttribute("positionList")
    public List<BasicPosition> getAllPositionList() {
        return basicPositionDao.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "za/001/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("position", new BasicPosition());
        return "za/001/form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String form(@ModelAttribute("position") BasicPosition position, Model model) {
        basicPositionDao.save(position);
        model.addAttribute("positionList", getAllPositionList());
        model.asMap().clear();
        return "redirect:/ZA/001";
    }

}
