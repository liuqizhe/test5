package com.souche.dao;

import com.souche.annotation.MyBatisDao;
import com.souche.entity.User;

/**
 * Created by liuqizhe on 15/9/28.
 */
@MyBatisDao
public interface UserMapperDao {
    public User findByCodeAndPwd(User user) ;
}
