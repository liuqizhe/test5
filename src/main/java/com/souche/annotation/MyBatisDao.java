package com.souche.annotation;

import org.springframework.stereotype.Repository;

/**
 * Created by liuqizhe on 15/9/23.
 */
@Repository
public @interface MyBatisDao {
    String value() default "" ;
}
