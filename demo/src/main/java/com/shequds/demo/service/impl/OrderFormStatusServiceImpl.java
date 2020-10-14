package com.shequds.demo.service.impl;

import com.shequds.demo.entity.OrderFormStatus;
import com.shequds.demo.mapper.OrderFormStatusMapper;
import com.shequds.demo.service.IOrderFormStatusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单状态表 服务实现类
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Service
public class OrderFormStatusServiceImpl extends ServiceImpl<OrderFormStatusMapper, OrderFormStatus> implements IOrderFormStatusService {

}
