package com.example.sqlhelperdemoh2.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sqlhelperdemoh2.test.entity.Demo;
import com.example.sqlhelperdemoh2.test.mapper.DemoMapper;
import com.example.sqlhelperdemoh2.test.service.IDemoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hejunlin
 * @since 2020-05-18
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements IDemoService {

}
