package com.shequds.demo.service.impl;

import com.shequds.demo.entity.BankCard;
import com.shequds.demo.mapper.BankCardMapper;
import com.shequds.demo.service.IBankCardService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 银行卡表 服务实现类
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Service
public class BankCardServiceImpl extends ServiceImpl<BankCardMapper, BankCard> implements IBankCardService {

}
