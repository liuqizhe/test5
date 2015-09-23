package com.souche.dao;

import com.souche.annotation.MyBatisDao;
import com.souche.entity.Dept;

import java.util.List;

/**
 * Created by liuqizhe on 15/9/23.
 */
@MyBatisDao
public interface DeptMapperDao {
    public List<Dept> findAll() ;
}
