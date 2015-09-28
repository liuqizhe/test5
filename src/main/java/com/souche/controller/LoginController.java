package com.souche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liuqizhe on 15/9/28.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login" ;
    }
}
