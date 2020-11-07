package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.constant.MessageConstant;
import com.itheima.entity.Result;
import com.itheima.pojo.CheckItem;
import com.itheima.service.CheckItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Liubg
 */

/**
 * 检查项管理
 */
@RestController// @Controller+ResponseBody
@RequestMapping("/checkitem")
public class CheckItemController {

    @Reference //订阅服务
    private CheckItemService checkItemService;

    //查询所有的检查项
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public Result findCheckItemList(){
        try {
            List<CheckItem> list=checkItemService.findAll();
            return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,MessageConstant.QUERY_CHECKGROUP_FAIL);
        }
    }
}
