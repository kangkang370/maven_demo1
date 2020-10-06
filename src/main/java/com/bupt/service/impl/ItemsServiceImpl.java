package com.bupt.service.impl;

import com.bupt.dao.ItemsDao;
import com.bupt.domain.Items;
import com.bupt.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @description:
 * @author: 小韩同学
 * @date: 2020/10/5
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
