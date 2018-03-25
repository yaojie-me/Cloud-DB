package com.cloud.database.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MybatisProxy extends SqlSessionFactoryBean {

    Map<Integer,SqlSessionFactory> sqlSessionFactoryMapping = new ConcurrentHashMap<>();

//    ThreadLocal<Long> threadLocal = Thread.currentThread().getThreadGroup().ThreadLocal


}
