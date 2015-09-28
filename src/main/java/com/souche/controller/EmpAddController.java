package com.souche.controller;

import com.souche.dao.EmpMapperDao;
import com.souche.entity.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by liuqizhe on 15/9/24.
 */
@Controller
public class EmpAddController {
    @Resource
    private EmpMapperDao dao ;

    public void setDao(EmpMapperDao dao) {
        this.dao = dao;
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "emp_add" ;
    }

    @RequestMapping("/addEmp")
    public String add(Emp emp) {
        dao.saveEmp(emp);
        return "redirect:/emplist.from" ;
    }
}
