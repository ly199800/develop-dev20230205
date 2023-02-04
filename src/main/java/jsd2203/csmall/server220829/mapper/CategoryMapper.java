package jsd2203.csmall.server220829.mapper;

import jsd2203.csmall.server220829.pojo.entity.Category;
import jsd2203.csmall.server220829.pojo.vo.CategoryDetailVO;
import jsd2203.csmall.server220829.pojo.vo.CategoryListItemVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper {

    int insert(Category category);
    int deleteById(Long id);
    int deleteByIds(Long...ids);
    int updateById(Category category);

    /**
     * 统计类别的数量
     *
     * @return 类别的数量
     */
    int count();

    /**
     * 根据类别名称统计此名称对应的类别数据的数量
     *
     * @param name 类别名称
     * @return 此名称对应的类别数据的数量
     */
    int countByName(String name);

    /**
     * 根据父级类别统计子级类别的数量
     *
     * @param parentId 父级类别的id
     * @return 子级类别的数量
     */
    int countByParentId(Long parentId);

    /**
     * 根据id查询类别详情
     *
     * @param id 类别的id
     * @return 匹配的类别详情，如果没有匹配的数据，则返回null
     */
    CategoryDetailVO getById(Long id);

    /**
     * 根据父级类别的id查询类别列表
     *
     * @param parentId 父级类别的id
     * @return 类别列表
     */
    List<CategoryListItemVO> listByParentId(Long parentId);

}
