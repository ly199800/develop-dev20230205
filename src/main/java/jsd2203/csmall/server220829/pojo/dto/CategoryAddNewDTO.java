package jsd2203.csmall.server220829.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 添加类别的DTO类
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Data
public class CategoryAddNewDTO implements Serializable {

    /**
     * 类别名称
     */
    @ApiModelProperty(value = "类别名称", required = true, example = "手机")
    private String name;

    /**
     * 父级类别id，如果无父级，则为0
     */
    @ApiModelProperty(value = "父级类别id，如果无父级，则为0", required = true, example = "0")
    private Long parentId;

    /**
     * 关键词列表，各关键词使用英文的逗号分隔
     */
    @ApiModelProperty(value = "关键词列表，各关键词使用英文的逗号分隔", required = true, example = "手机,电话,移动电话")
    private String keywords;

    /**
     * 自定义排序序号
     */
    @ApiModelProperty(value = "自定义排序序号", example = "88")
    private Integer sort;

    /**
     * 图标图片的URL
     */
    @ApiModelProperty(value = "图标图片的URL", example = "http://www.icon.com/phone.png")
    private String icon;

    /**
     * 是否启用，1=启用，0=未启用
     */
    @ApiModelProperty(value = "是否启用，1=启用，0=未启用", required = true, example = "1")
    private Integer enable;

    /**
     * 是否显示在导航栏中，1=启用，0=未启用
     */
    @ApiModelProperty(value = "是否显示在导航栏中，1=启用，0=未启用", required = true, example = "1")
    private Integer isDisplay;

}