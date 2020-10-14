package com.shequds.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 手机号
     */
    @TableField("telphone")
    private String telphone;

    @TableField("name")
    private String name;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    /**
     * 所在小区外键
     */
    @TableField("plot_id")
    private Integer plotId;

    /**
     * 注册时间
     */
    @TableField("create_time")
    private LocalDate createTime;

    /**
     * 最后一次登陆时间
     */
    @TableField("end_login_time")
    private LocalDate endLoginTime;

    /**
     * 活动状态id
     */
    @TableField("user_status_id")
    private Integer userStatusId;

    @TableField("role")
    private Integer role;


}
