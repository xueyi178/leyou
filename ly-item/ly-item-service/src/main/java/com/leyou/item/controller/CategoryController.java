package com.leyou.item.controller;

import com.leyou.item.common.utils.R;
import com.leyou.item.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName leyou
 * @ClassName CategoryController
 * @Description TODO
 * @Author Lenovo
 * @Date 2019/11/17 15:51
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    /**
     * 根据父节点id查询商品类目
     * @param pid
     * @return
     */
    @GetMapping(value = "/list")
    public R queryCategoryListByPid(@RequestParam("pid") Long pid){
        return categoryService.queryCategoryListByPid(pid);
    }
}
