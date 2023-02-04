package jsd2203.csmall.server220829.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AlbumAddNewDTO {
    /**
     * 相册名
     * */
    @ApiModelProperty(value = "相册名称",required = true)
    private String name;
    /**
     *
     * 相册简介
     * */
    @ApiModelProperty(value = "相册简介",required = false)
    private String description;

}
