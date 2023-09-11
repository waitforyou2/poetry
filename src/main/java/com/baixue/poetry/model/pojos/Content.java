package com.baixue.poetry.model.pojos;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author bzz
 * @since 2023-09-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Content implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 具体的内容
     */
    private String content;

    /**
     * 作者名字
     */
    private Integer authorName;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 类型，1是用户发布的诗词，0是系统自带的诗
     */
    private Integer type;


}
