package com.shequds.demo.service.impl;

import com.shequds.demo.entity.BankCardStatus;
import com.shequds.demo.mapper.BankCardStatusMapper;
import com.shequds.demo.service.IBankCardStatusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 银行卡状态表 服务实现类
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Service
public class BankCardStatusServiceImpl extends ServiceImpl<BankCardStatusMapper, BankCardStatus> implements IBankCardStatusService {

}
