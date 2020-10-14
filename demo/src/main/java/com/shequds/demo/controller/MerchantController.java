package com.shequds.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shequds.demo.entity.Merchant;
import com.shequds.demo.service.IMerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商家表 前端控制器
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@RestController
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    private IMerchantService iMerchantService;
    @RequestMapping("list")
    public IPage<Merchant> list(Page page, Merchant vo){
        return iMerchantService.select(page,vo);
    }
}

