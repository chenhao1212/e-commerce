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
 * 商家附件表
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("accessory")
public class Accessory implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 商家附件表id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 执照号
     */
    @TableField("license_number")
    private String licenseNumber;

    /**
     * 法人
     */
    @TableField("legal_person")
    private String legalPerson;


}
