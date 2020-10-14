package com.shequds.demo.service.impl;

import com.shequds.demo.entity.OrderForm;
import com.shequds.demo.mapper.OrderFormMapper;
import com.shequds.demo.service.IOrderFormService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Service
public class OrderFormServiceImpl extends ServiceImpl<OrderFormMapper, OrderForm> implements IOrderFormService {

}
