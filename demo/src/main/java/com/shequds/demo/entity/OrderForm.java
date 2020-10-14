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
 * 订单表
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("order_form")
public class OrderForm implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单号
     */
    @TableField("order_number")
    private String orderNumber;

    /**
     * 用户外键
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 商家外键
     */
    @TableField("merchant_id")
    private Integer merchantId;

    /**
     * 状态
     */
    @TableField("order_form_status_id")
    private Integer orderFormStatusId;

    /**
     * 活动id
     */
    @TableField("activity_id")
    private Integer activityId;

    /**
     * 惠券外键
     */
    @TableField("discount_coupon_id")
    private Integer discountCouponId;


}
