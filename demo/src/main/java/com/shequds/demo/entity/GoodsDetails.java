package com.shequds.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品详情表
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("goods_details")
public class GoodsDetails implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 商品详情表主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 库存
     */
    @TableField("inventory")
    private Integer inventory;

    /**
     * 价格
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 规格外键
     */
    @TableField("specification_id")
    private Integer specificationId;

    /**
     * 规格值外键
     */
    @TableField("specification_value_id")
    private Integer specificationValueId;

    /**
     * 商家外键
     */
    @TableField("merchant_id")
    private Integer merchantId;


}
