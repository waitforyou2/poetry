package com.baixue.poetry.service.impl;

import com.baixue.poetry.model.pojos.Author;
import com.baixue.poetry.mapper.AuthorMapper;
import com.baixue.poetry.service.AuthorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bzz
 * @since 2023-09-10
 */
@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements AuthorService {

}
