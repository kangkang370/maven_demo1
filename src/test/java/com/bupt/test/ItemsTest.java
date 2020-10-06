package com.bupt.test;

import com.bupt.dao.ItemsDao;
import com.bupt.domain.Items;
import com.bupt.service.ItemsService;
import com.sun.corba.se.spi.orb.ParserImplBase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

/**
 * @description:
 * @author: 小韩同学
 * @date: 2020/10/5
 */
public class ItemsTest {

    @Test
    public void findById(){
        // 获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // dao测试
        /*// 从容器中拿到所需要的dao的代理对象
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        // 调用方法
        Items items = itemsDao.findById(1);
        System.out.println(items.getName());*/

        // service测试
        ItemsService itemsService = ac.getBean(ItemsService.class);
        // 调用方法
        Items items = itemsService.findById(1);
        System.out.println(items.getName());
    }
}
