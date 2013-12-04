
package com.app.jetcore.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sudarsan
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping(method = RequestMethod.GET)
    public String showAdmin() {
        return "/admin";
    }
}
