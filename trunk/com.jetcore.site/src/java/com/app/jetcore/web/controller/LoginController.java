/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.jetcore.web.controller;

import com.app.jetcore.context.id.names.ContextIdNames;
import com.app.jetcore.main.domain.service.JetUserService;
import com.app.jetcore.main.domain.sub.JetUser;
import com.app.jetcore.main.utils.AppContext;
import com.app.jetcore.web.forms.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Sudarsan
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public String doLogin(@ModelAttribute LoginForm loginForm) {
        JetUserService jetUserService = (JetUserService) AppContext.APPCONTEXT.getBean(ContextIdNames.JET_USER_SERVICE);
        JetUser jetUser = jetUserService.authenticate(loginForm.getEmail(), loginForm.getPassword());

        if (jetUser == null) {
            return "false";
        } else {
            return "true";
        }



    }
}
