package com.shequds.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("goods")
public class Goods implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品名
     */
    @TableField("goods_name")
    private String goodsName;

    /**
     * 类型外键
     */
    @TableField("type_id")
    private Integer typeId;

    /**
     * 品牌
     */
    @TableField("brand")
    private String brand;

    /**
     * 商品外键
     */
    @TableField("merchant_id")
    private Integer merchantId;

    /**
     * 商品详情外键
     */
    @TableField("goods_details_id")
    private Integer goodsDetailsId;


}
