package com.leyou.item.service;

import com.leyou.item.common.utils.R;

/**
 *Category的业务逻辑层接口
 */
public interface ICategoryService {


    /**
     * 根据父节点id查询商品类目
     * @param pid
     * @return
     */
    public R queryCategoryListByPid(Long pid);
}
