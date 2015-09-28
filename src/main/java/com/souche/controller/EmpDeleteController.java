package com.souche.controller;

import com.souche.dao.EmpMapperDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by liuqizhe on 15/9/24.
 */
@Controller
public class EmpDeleteController {
    @Resource
    private EmpMapperDao dao ;

    public void setDao(EmpMapperDao dao) {
        this.dao = dao;
    }

    @RequestMapping("/deleteEmp")
    public String execute(@RequestParam(value = "empno", required = false) Integer id) {
        if (id != null) {
            dao.deleteEmp(id);
        }
        return "redirect:/emplist.from" ;
    }
}
