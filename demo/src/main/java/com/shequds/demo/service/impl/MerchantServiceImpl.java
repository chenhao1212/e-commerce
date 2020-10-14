package com.shequds.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shequds.demo.entity.Merchant;
import com.shequds.demo.mapper.MerchantMapper;
import com.shequds.demo.service.IMerchantService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 商家表 服务实现类
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Service
public class MerchantServiceImpl extends ServiceImpl<MerchantMapper, Merchant> implements IMerchantService {


    @Override
    public IPage<Merchant> select(Page page, Merchant vo) {
        return baseMapper.select(page,vo);
    }
}
