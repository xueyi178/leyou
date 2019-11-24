package com.leyou.item.mapper;

import com.leyou.item.item.entity.Brand;
import com.leyou.item.item.entity.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 品牌的通用mapper
 */
@Repository
public interface BrandMapper extends Mapper<Brand> {

    /**
     * 往tb_category_brand添加数据
     * @param cid
     * @param bid
     * @return
     */
    @Insert("INSERT INTO tb_category_brand (category_id, brand_id) VALUES (#{cid},#{bid})")
    int insertCategoryBrand(@Param("cid") Long cid, @Param("bid") Long bid);

    @Select("select * from tb_category where id in (select category_id from tb_category_brand where brand_id = #{bid})")
    List<Category> queryCategoryByBid(Long bid);

    @Delete("delete from tb_category_brand where brand_id = #{bid}")
    int deleteCategoryBrandByBid(Long bid);

    @Select("select * from tb_brand where id in (select brand_id from tb_category_brand where category_id = #{cid})")
    List<Brand> queryBrandByCid(Long cid);
}
