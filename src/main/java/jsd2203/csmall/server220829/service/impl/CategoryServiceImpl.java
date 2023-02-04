package jsd2203.csmall.server220829.service.impl;

import jsd2203.csmall.server220829.ex.ServiceException;
import jsd2203.csmall.server220829.mapper.CategoryMapper;
import jsd2203.csmall.server220829.pojo.dto.CategoryAddNewDTO;
import jsd2203.csmall.server220829.pojo.entity.Category;
import jsd2203.csmall.server220829.pojo.vo.CategoryDetailVO;
import jsd2203.csmall.server220829.pojo.vo.CategoryListItemVO;
import jsd2203.csmall.server220829.repo.ICategoryRepository;
import jsd2203.csmall.server220829.service.ICategoryService;
import jsd2203.csmall.server220829.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类别业务实现
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;
    @Autowired
    private CategoryMapper categoryMapper;

    public CategoryServiceImpl() {
        log.debug("创建业务逻辑对象：CategoryServiceImpl");
    }



    @Override
    public void addNew(CategoryAddNewDTO categoryAddNewDTO) {



    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<CategoryListItemVO> listByParentId(Long parentId) {
            return categoryMapper.listByParentId(parentId);
    }

}
