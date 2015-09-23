package com.souche.dao;

import com.souche.annotation.MyBatisDao;
import com.souche.entity.Emp;

import java.util.List;

/**
 * Created by liuqizhe on 15/9/23.
 */
@MyBatisDao
public interface EmpMapperDao {
    public List<Emp> findAll() ;
}
