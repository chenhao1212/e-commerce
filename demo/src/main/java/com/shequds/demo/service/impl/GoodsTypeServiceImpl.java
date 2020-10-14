package com.shequds.demo.service.impl;

import com.shequds.demo.entity.GoodsType;
import com.shequds.demo.mapper.GoodsTypeMapper;
import com.shequds.demo.service.IGoodsTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品类型表 服务实现类
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Service
public class GoodsTypeServiceImpl extends ServiceImpl<GoodsTypeMapper, GoodsType> implements IGoodsTypeService {

}
