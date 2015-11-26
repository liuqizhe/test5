package com.souche.controller;

import com.souche.dao.EmpMapperDao;
import com.souche.entity.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by liuqizhe on 15/9/24.
 */
@Controller
public class EmpUpdateController {
    @Resource
    private EmpMapperDao dao ;

    public void setDao(EmpMapperDao dao) {
        this.dao = dao;
    }

    @RequestMapping("/toUpdate")
    //@RequestParam提取名为empno的Integer类型参数，作为输入参数id传入
    public String toUpdate(@RequestParam(value = "empno", required = false) Integer id, Model model) {
        Emp emp = dao.findById(id);
        model.addAttribute("emp",emp) ;
        return "emp_modi" ;
    }

    @RequestMapping("/updateEmp")
    public String update(Emp emp) {
        dao.updateEmp(emp);
        return "redirect:/emplist.from" ;
    }
}
