package com.egrina.planet.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: xperad
 * Date: 西暦.13/03/30
 * Time: 21:20
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("")
    public String index() {
        return "test/index";
    }
}