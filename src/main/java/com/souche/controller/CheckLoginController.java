package com.souche.controller;

import com.souche.dao.UserMapperDao;
import com.souche.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by liuqizhe on 15/9/28.
 */
@Controller
@RequestMapping("/login")
public class CheckLoginController {
    @Resource
    private UserMapperDao dao ;

    public void setDao(UserMapperDao dao) {
        this.dao = dao;
    }

    @RequestMapping("login")
    public String login(User user,Model model,HttpSession session) {
        //检查验证码
        String scode = (String)session.getAttribute("scode") ;
        System.out.println("用户输入："+user.getCode());
        System.out.println("Session:"+scode);
        if(!user.getCode().equals(scode)) {
            //验证码错误
            model.addAttribute("code_error","验证码错误");
            return "login" ;
        }

        //检查账号和密码
        User userInfo = dao.findByCodeAndPwd(user) ;

        if(userInfo != null) {
            session.setAttribute("user",userInfo.getUsername());
            System.out.println(userInfo.getUsername());
            return "index" ;
        } else {
            model.addAttribute("error", "用户名密码不正确") ;
            return "login" ;
        }


    }
}
