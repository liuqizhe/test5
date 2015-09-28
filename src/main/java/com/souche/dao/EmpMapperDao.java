package com.souche.dao;

import com.souche.annotation.MyBatisDao;
import com.souche.entity.Emp;
import com.souche.entity.Page;

import java.util.List;

/**
 * Created by liuqizhe on 15/9/23.
 */
@MyBatisDao
public interface EmpMapperDao {
    public List<Emp> findAll() ;
    public Emp findById(int id) ;
    public void saveEmp(Emp emp) ;
    public void deleteEmp(int id) ;
    public void updateEmp(Emp emp) ;
    public List<Emp> findPage(Page page) ;
    public Integer findRows() ;
}
