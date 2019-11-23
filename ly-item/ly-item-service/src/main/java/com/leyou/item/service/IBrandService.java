package com.leyou.item.service;

import com.leyou.item.common.utils.PageResult;
import com.leyou.item.item.entity.Brand;

/**
 * 品牌的业务逻辑层接口
 */
public interface IBrandService {

    /**
     * 分页查询品牌列表
     * @param page   当前页
     * @param rows   每页显示的函数
     * @param sortBy  排序字段
     * @param desc  降序排序
     * @param search 查询条件
     * @return
     */
  public PageResult<Brand> queryBrandByPage(Integer page, Integer rows, String sortBy, Boolean desc, String search);
}
