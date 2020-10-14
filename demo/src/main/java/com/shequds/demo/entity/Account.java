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
 * 商家账户
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("account")
public class Account implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商家账户名
     */
    @TableField("account_name")
    private String accountName;

    /**
     * 银行卡号
     */
    @TableField("brank_number")
    private String brankNumber;

    /**
     * 商家账户号
     */
    @TableField("account_number")
    private String accountNumber;

    /**
     * 余额
     */
    @TableField("balance")
    private BigDecimal balance;


}
