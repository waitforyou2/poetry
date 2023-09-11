package com.baixue.poetry.service.impl;

import com.baixue.poetry.model.pojos.User;
import com.baixue.poetry.mapper.UserMapper;
import com.baixue.poetry.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author bzz
 * @since 2023-09-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
