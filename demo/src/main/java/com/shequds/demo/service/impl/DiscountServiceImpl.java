package com.shequds.demo.service.impl;

import com.shequds.demo.entity.Discount;
import com.shequds.demo.mapper.DiscountMapper;
import com.shequds.demo.service.IDiscountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 优惠劵表 服务实现类
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Service
public class DiscountServiceImpl extends ServiceImpl<DiscountMapper, Discount> implements IDiscountService {

}
