package com.shequds.demo.service.impl;

import com.shequds.demo.entity.City;
import com.shequds.demo.mapper.CityMapper;
import com.shequds.demo.service.ICityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zyb
 * @since 2020-10-13
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements ICityService {

}
