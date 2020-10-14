package com.shequds.demo.service.impl;

import com.shequds.demo.entity.Account;
import com.shequds.demo.mapper.AccountMapper;
import com.shequds.demo.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商家账户 服务实现类
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
