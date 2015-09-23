package com.souche.test;

import com.souche.dao.DeptMapperDao;
import com.souche.entity.Dept;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by liuqizhe on 15/9/23.
 */
public class TestDeptMapperDao {
    public static void main(String[] args) {
        String conf = "applicationContext.xml" ;
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf) ;
        //默认采用MapperDao接口名当做实例Bean的id
        DeptMapperDao dao = ac.getBean("deptMapperDao",DeptMapperDao.class) ;
        List<Dept> list = dao.findAll() ;
        for (Dept d : list){
            System.out.println(d.getDeptno() + " " + d.getDname());
        }
    }
}
