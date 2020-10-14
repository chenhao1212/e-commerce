package com.shequds.demo.service.impl;

import com.shequds.demo.entity.UserStatus;
import com.shequds.demo.mapper.UserStatusMapper;
import com.shequds.demo.service.IUserStatusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户状态 服务实现类
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Service
public class UserStatusServiceImpl extends ServiceImpl<UserStatusMapper, UserStatus> implements IUserStatusService {

}
