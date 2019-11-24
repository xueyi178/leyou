package com.leyou.item.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leyou.item.common.utils.PageResult;
import com.leyou.item.common.utils.R;
import com.leyou.item.item.entity.Brand;
import com.leyou.item.mapper.BrandMapper;
import com.leyou.item.service.IBrandService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ProjectName leyou
 * @ClassName BrandServiceImpl
 * @Description TODO
 * @Author Lenovo
 * @Date 2019/11/23 13:05
 * @Version 1.0
 */
@Service
public class BrandServiceImpl implements IBrandService {

    @Autowired
    private BrandMapper brandMapper;

    /**
     * 分页查询品牌列表
     *
     * @param page   当前页
     * @param rows   每页显示的函数
     * @param sortBy 排序字段
     * @param desc   降序排序
     * @param search 查询条件
     * @return
     */
    @Override
    public PageResult<Brand> queryBrandByPage(Integer page, Integer rows, String sortBy, Boolean desc, String search) {
        // 开始分页
        PageHelper.startPage(page, rows);
        // 过滤
        Example example = new Example(Brand.class);
        if (StringUtils.isNotBlank(search)) {
            example.createCriteria().andLike("name", "%" + search + "%")
                    .orEqualTo("letter", search);
        }
        if (StringUtils.isNotBlank(sortBy)) {
            // 排序
            String orderByClause = sortBy + (desc ? " DESC" : " ASC");
            example.setOrderByClause(orderByClause);
        }
        // 查询
        List<Brand> list = brandMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(list)) {
            Assert.notEmpty(list, "查询失败,请重试");
        }

        PageInfo<Brand> info = new PageInfo<>(list);

        // 返回结果
        return new PageResult<>(info.getTotal(), list);
    }

    /**
     * 添加品牌数据
     *
     * @param brand
     * @param cids
     * @return
     */
    @Override
    @Transactional
    public R saveBrand(Brand brand, List<Long> cids) {
        int falg = brandMapper.insertSelective(brand);
        int saveNum = 0;
        for (Long cid : cids) {
            int falgs = brandMapper.insertCategoryBrand(cid, brand.getId());
            if (falgs > 0) {
                saveNum++;
            }
        }
        if (falg > 0 && cids.size() == saveNum) {
            return R.ok();
        }
        return R.error();
    }
}
