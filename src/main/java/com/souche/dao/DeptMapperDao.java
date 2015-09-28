package com.souche.dao;

import com.souche.annotation.MyBatisDao;
import com.souche.entity.Dept;
import com.souche.entity.Emp;

import java.util.List;

/**
 * Created by liuqizhe on 15/9/23.
 */
@MyBatisDao
public interface DeptMapperDao {
    public List<Dept> findAll() ;
    public List<Emp> findInfo(int deptno) ;

}
