package com.egrina.planet.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: xperad
 * Date: 西暦.13/03/30
 * Time: 23:52
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/AB")
public class EmpController {

    @RequestMapping("")
    public String index() {
        return "/ab/index";
    }

}
