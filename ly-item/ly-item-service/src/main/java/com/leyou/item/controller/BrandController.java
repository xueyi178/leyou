package com.leyou.item.controller;

import com.leyou.item.common.utils.PageResult;
import com.leyou.item.item.entity.Brand;
import com.leyou.item.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName leyou
 * @ClassName BrandController
 * @Description TODO
 * @Author Lenovo
 * @Date 2019/11/23 13:06
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/brands")
public class BrandController {

    @Autowired
    private IBrandService brandService;

    /**
     * 分页查询品牌列表
     * @param page   当前页
     * @param rows   每页显示的函数
     * @param sortBy  排序字段
     * @param desc  降序排序
     * @param search 查询条件
     * @return
     */
    @GetMapping(value = "/page")
    public ResponseEntity<PageResult<Brand>> queryBrandByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy", required = false) String sortBy,
            @RequestParam(value = "desc", defaultValue = "false")  Boolean desc,
            @RequestParam(value = "search", required = false) String search
            ){
        return ResponseEntity.ok(brandService.queryBrandByPage(page,rows,sortBy,desc,search));
    }
}
