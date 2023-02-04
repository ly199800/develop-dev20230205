package jsd2203.csmall.server220829.service;

import jsd2203.csmall.server220829.pojo.dto.AttributeAddNewDTO;
import jsd2203.csmall.server220829.pojo.vo.AttributeListItemVO;

import java.util.List;

public interface IAttributeService {
    
    
    /**
     * 添加属性
     *
     * **/

    void addNew(AttributeAddNewDTO attributeAddNewDTO);

    /**
     *
     * 根据id删除属性数据
     * **/
    void deleteById(Long id);
    /**
     * 查询属性列表
     *
     * **/
    List<AttributeListItemVO> list();


}
