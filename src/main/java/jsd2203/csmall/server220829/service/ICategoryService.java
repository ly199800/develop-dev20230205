package jsd2203.csmall.server220829.service;

import jsd2203.csmall.server220829.pojo.dto.CategoryAddNewDTO;
import jsd2203.csmall.server220829.pojo.vo.CategoryListItemVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 类别业务接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
public interface ICategoryService {

    /**
     * 添加类别
     *
     * @param categoryAddNewDTO 需要添加的类别数据
     */
    @Transactional
    void addNew(CategoryAddNewDTO categoryAddNewDTO);

    /**
     * 根据id删除类别数据
     *
     * @param id 需要删除的类别数据的id
     */
    @Transactional
    void deleteById(Long id);

    /**
     * 根据父级类别的id查询类别列表
     *
     * @param parentId 父级类别的id
     * @return 类别列表
     */
    List<CategoryListItemVO> listByParentId(Long parentId);

}
