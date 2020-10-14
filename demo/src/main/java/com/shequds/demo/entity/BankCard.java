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
 * 银行卡表
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("bank_card")
public class BankCard implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 卡号
     */
    @TableField("bank_card_number")
    private String bankCardNumber;

    /**
     * 银行名称
     */
    @TableField("bank_name")
    private String bankName;

    @TableField("bank_card_status")
    private Integer bankCardStatus;

    @TableField("user_id")
    private Integer userId;


}
