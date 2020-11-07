package com.itheima.dao;

import com.itheima.pojo.CheckItem;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Liubg
 */
/**
 * 检查项持久层接口
 */
public interface CheckItemDao {
    /**
     * 查询所有检查项列表
     */
    List<CheckItem> findAll();
}
