package com.itheima.service;

import com.itheima.pojo.CheckItem;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Liubg
 */

/**
 * 检查项的接口
 */
public interface CheckItemService {
    /**
     * 查询所有检查项列表
     */
    List<CheckItem> findAll();
}
