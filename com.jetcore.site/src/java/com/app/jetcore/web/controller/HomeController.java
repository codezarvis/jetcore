/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.jetcore.web.controller;

import com.app.jetcore.main.utils.JetSpringContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sudarsan
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    
    public HomeController() {
        JetSpringContext.init();
    }
    @RequestMapping(method = RequestMethod.GET)
    public String showHome() {
        return "home";
    }
}
