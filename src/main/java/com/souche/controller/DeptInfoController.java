package com.souche.controller;

import com.souche.dao.DeptMapperDao;
import com.souche.entity.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liuqizhe on 15/9/25.
 */
@Controller
public class DeptInfoController {
    @Resource
    private DeptMapperDao dao ;

    public void setDao(DeptMapperDao dao) {
        this.dao = dao;
    }

    @RequestMapping("/toInfo")
    public String toInfo(@RequestParam(value = "deptno", required = false) Integer id, Model model) {
        List<Emp> list = dao.findInfo(id) ;
        model.addAttribute("emp", list) ;
        return "dept_info" ;
    }
}
