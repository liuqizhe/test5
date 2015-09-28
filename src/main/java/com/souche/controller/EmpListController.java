package com.souche.controller;

import com.souche.dao.EmpMapperDao;
import com.souche.entity.Emp;
import com.souche.entity.Page;
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
    public String showList(Page page, Model model) {
        List<Emp> list = dao.findPage(page) ;
        //计算总页数
        int totalRows = dao.findRows() ;
        int totalPage = 1 ;
        if(totalRows%page.getPageSize() == 0) {
            totalPage = totalRows%page.getPageSize() ;
        } else {
            totalPage = totalRows%page.getPageSize()+1 ;
        }
        //将总页数放入page对象
        page.setTotalPage(totalPage);
        model.addAttribute("page", page) ;
        model.addAttribute("emps", list) ;
        return "emp_list" ;
    }

}
