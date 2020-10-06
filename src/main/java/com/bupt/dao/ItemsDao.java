package com.bupt.dao;

import com.bupt.domain.Items;

/**
 * @description:
 * @author: 小韩同学
 * @date: 2020/10/5
 */
public interface ItemsDao {

    public Items findById(Integer id);
}
