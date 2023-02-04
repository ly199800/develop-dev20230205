package jsd2203.csmall.server220829.service.impl;

import jsd2203.csmall.server220829.mapper.AttributeMapper;
import jsd2203.csmall.server220829.pojo.dto.AttributeAddNewDTO;
import jsd2203.csmall.server220829.pojo.entity.Attribute;
import jsd2203.csmall.server220829.pojo.vo.AttributeListItemVO;
import jsd2203.csmall.server220829.service.IAttributeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.util.annotation.Nullable;

import java.util.List;

/**
 * 属性业务实现
 * **/
@Slf4j
@Service
public class AttributeServiceImpl implements IAttributeService {
    @Autowired
    private AttributeMapper attributeMapper;

    public AttributeServiceImpl() {
        log.debug("创建业务逻辑对象：AttributeServiceImpl");
    }

    @Override
    public void addNew(AttributeAddNewDTO attributeAddNewDTO) {


    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<AttributeListItemVO> list() {
        return null;
    }
}
