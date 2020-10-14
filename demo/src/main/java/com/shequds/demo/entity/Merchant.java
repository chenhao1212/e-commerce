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
 * 商家表
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("merchant")
public class Merchant implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商家名称
     */
    @TableField("merchant_name")
    private String merchantName;

    @TableField("pid")
    private Integer pid;

    @TableField("cid")
    private Integer cid;

    @TableField("did")
    private Integer did;

    @TableField("address")
    private String address;

    /**
     * 类型外键
     */
    @TableField("merchant_type_id")
    private Integer merchantTypeId;

    /**
     * 商家状态外键
     */
    @TableField("merchant_status_id")
    private Integer merchantStatusId;

    /**
     * 附件外键
     */
    @TableField("accessory_id")
    private Integer accessoryId;

    /**
     * 账户外键
     */
    @TableField("account_id")
    private Integer accountId;


    @TableField(exist = false)
    private String pname;
    @TableField(exist = false)
    private String cname;
    @TableField(exist = false)
    private String dname;
    @TableField(exist = false)
    private String leixing;
    @TableField(exist = false)
    private String zhuangtai;
    @TableField(exist = false)
    private String zhizhao;
    @TableField(exist = false)
    private String faren;
    @TableField(exist = false)
    private String anname;
    @TableField(exist = false)
    private String kahao;
    @TableField(exist = false)
    private String zhanghao;
    @TableField(exist = false)
    private Double price;

}
