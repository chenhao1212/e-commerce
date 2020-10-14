package com.shequds.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shequds.demo.entity.Merchant;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


/**
 * <p>
 * 商家表 Mapper 接口
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
public interface MerchantMapper extends BaseMapper<Merchant> {
    IPage<Merchant> select(Page page, Merchant vo);
}
