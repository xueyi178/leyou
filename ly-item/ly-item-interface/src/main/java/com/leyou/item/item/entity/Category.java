package com.leyou.item.item.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @ProjectName leyou
 * @ClassName Category
 * @Description TODO
 * @Author Lenovo
 * @Date 2019/11/17 15:40
 * @Version 1.0
 */
@Table(name = "tb_category")
@Data
public class Category implements Serializable {
    @Id
    @KeySql(useGeneratedKeys = true)

    /**
     * 主键id
     */
    private Long id;

    /**
     * 类目名称
     */
    private String name;

    //父类目id,顶级类目填0
    private Long parentId;

    //是否为父节点，0为否，1为是
    private Boolean isParent;

    //排序指数，越小越靠前
    private Integer sort;
}
