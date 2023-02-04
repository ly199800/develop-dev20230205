package jsd2203.csmall.server220829.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/***
 * entity,实体类项,用于所有必要相册属性的类
 *
 * */
@Data
public class Album implements Serializable {
    /**
     * 记录id
     */
    private Long id;

    /**
     * 相册名称
     */
    private String name;

    /**
     * 相册简介
     */
    private String description;

    /**
     * 自定义排序序号
     */
    private Integer sort;

    /**
     * 数据创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 数据最后修改时间
     */
    private LocalDateTime gmtModified;
}
