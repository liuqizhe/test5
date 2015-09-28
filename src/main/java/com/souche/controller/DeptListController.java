package com.souche.controller;

import com.souche.dao.DeptMapperDao;
import com.souche.entity.Dept;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liuqizhe on 15/9/25.
 */
@Controller
public class DeptListController {
    @Resource
    private DeptMapperDao dao ;

    public void setDao(DeptMapperDao dao) {
        this.dao = dao;
    }

    @RequestMapping("/deptlist")
    public String showList(Model model) {
        List<Dept> list = dao.findAll() ;
        model.addAttribute("depts",list) ;
        return "dept_list" ;
    }
}
