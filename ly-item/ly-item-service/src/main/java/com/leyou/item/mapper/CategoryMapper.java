package com.leyou.item.mapper;

import com.leyou.item.item.entity.Category;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * Category的通用mapper
 */
@Repository
public interface CategoryMapper extends Mapper<Category> {

}
