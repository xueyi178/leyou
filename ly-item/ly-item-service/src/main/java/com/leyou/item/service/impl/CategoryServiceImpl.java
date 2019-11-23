package com.leyou.item.service.impl;

import com.leyou.item.common.utils.R;
import com.leyou.item.item.entity.Category;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.List;


/**
 * @ProjectName leyou
 * @ClassName CategoryServiceImpl
 * @Description TODO
 * @Author Lenovo
 * @Date 2019/11/17 15:48
 * @Version 1.0
 */
@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 根据父节点id查询商品类目
     * @param pid
     * @return
     */
    @Override
    public R queryCategoryListByPid(Long pid) {
        Category category = new Category();
        category.setParentId(pid);
        List<Category> select = categoryMapper.select(category);
        if(!CollectionUtils.isEmpty(select)){
            return R.ok().put("data", select);
        }
        return R.error();
    }
}
