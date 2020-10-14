package com.shequds.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shequds.demo.entity.Merchant;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * <p>
 * 商家表 服务类
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
public interface IMerchantService extends IService<Merchant> {
    IPage<Merchant> select(Page page, Merchant vo);
}
