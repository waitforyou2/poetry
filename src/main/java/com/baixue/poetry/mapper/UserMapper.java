package com.baixue.poetry.mapper;

import com.baixue.poetry.model.pojos.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author bzz
 * @since 2023-09-10
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
