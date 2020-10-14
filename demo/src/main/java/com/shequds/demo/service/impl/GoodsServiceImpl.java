package com.shequds.demo.service.impl;

import com.shequds.demo.entity.Goods;
import com.shequds.demo.mapper.GoodsMapper;
import com.shequds.demo.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
