package jsd2203.csmall.server220829.repo.impl;

import jsd2203.csmall.server220829.repo.ICategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class CategoryRepositoryImpl implements ICategoryRepository {

    public CategoryRepositoryImpl() {
        log.debug("创建数据访问对象：CategoryRepositoryImpl");
    }
}
