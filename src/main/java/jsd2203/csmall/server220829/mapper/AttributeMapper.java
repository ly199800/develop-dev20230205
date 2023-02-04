package jsd2203.csmall.server220829.mapper;

import jsd2203.csmall.server220829.pojo.entity.Attribute;
import jsd2203.csmall.server220829.pojo.vo.AttributeDetailVO;
import jsd2203.csmall.server220829.pojo.vo.AttributeListItemVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 属性模板
 * */
@Repository
public interface AttributeMapper {
    

    /***
     * 插入数据
     *
     * */
    int insert(Attribute attribute);
    /**
     *
     * 删除数据
     * */
    int deleteById(Long id);
    /**
     *根据若干个属性id，批量删除属性数据
     *
     * @param ids 期望删除的若干个属性数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     * **/
    int deleteByIds(Long ids);
    /**
     * 根据id查询属性详情
     *
     * @param id 属性数据的id
     * @return 匹配的属性详情，如果没有匹配的数据，将返回null
     */
    AttributeDetailVO getById(Long id);
    /**
     * 查询属性列表
     *
     * @return 属性列表的集合
     */
    List<AttributeListItemVO> list();
}
