package com.baixue.poetry.service.impl;

import com.baixue.poetry.model.pojos.Content;
import com.baixue.poetry.mapper.ContentMapper;
import com.baixue.poetry.service.ContentService;
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
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements ContentService {

}
