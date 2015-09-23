package com.souche.controller;

import com.souche.dao.EmpMapperDao;
import com.souche.entity.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liuqizhe on 15/9/23.
 */
@Controller
public class EmpListController {
    @Resource
    private EmpMapperDao dao ;

    public void setDao(EmpMapperDao dao) {
        this.dao = dao;
    }

    @RequestMapping("/emplist")
    public String showList(Model model) {
        List<Emp> list = dao.findAll() ;
        model.addAttribute("emps", list) ;
        return "emp_list" ;
    }
}
