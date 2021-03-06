package com.souche.test;

import com.souche.dao.EmpMapperDao;
import com.souche.entity.Emp;
import com.souche.entity.Page;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by liuqizhe on 15/9/23.
 */
public class TestEmpMapperDao {
    public static void main(String[] args) {
        String conf = "applicationContext.xml" ;
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf) ;
        //默认采用MapperDao接口名当做实例Bean的id
        EmpMapperDao dao = ac.getBean("empMapperDao",EmpMapperDao.class) ;
//        List<Emp> list = dao.findAll() ;
//        for (Emp e : list) {
//            System.out.println(e.getEmpno() + " " + e.getEname());
//        }
//        Emp e = dao.findById(1001) ;
//        System.out.println(e.getEname());
        Page page = new Page() ;
        page.setPage(1);

        List<Emp> list = dao.findPage(page) ;
        for(Emp e : list) {
            System.out.println(e.getEmpno()+" "+e.getEname());
        }
    }
}
