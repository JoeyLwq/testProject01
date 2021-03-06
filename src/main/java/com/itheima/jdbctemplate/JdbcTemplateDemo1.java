package com.itheima.jdbctemplate;


import com.itheima.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo1 {
    public static void main(String[] args) {

        //1、获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //2、创建对象
        JdbcTemplate jt = ac.getBean("jdbcTemplate",JdbcTemplate.class);

        String sql = "create table count(name varchar(20),age int);";

        //3、执行操作
        jt.execute(sql);
    }
}
