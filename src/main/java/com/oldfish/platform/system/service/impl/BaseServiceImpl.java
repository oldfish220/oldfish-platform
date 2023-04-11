package com.oldfish.platform.system.service.impl;

import com.oldfish.platform.system.dao.BaseDao;
import com.oldfish.platform.system.entity.BaseEntity;
import com.oldfish.platform.system.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public abstract class BaseServiceImpl<D extends BaseDao<T>, T extends BaseEntity> implements BaseService<T> {

    @Autowired
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    protected D dao;

    @Override
    public T findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void save(T entity) {
        if (entity.getIsDeleted() == null) {
            entity.setIsDeleted(0);
        }
        if (entity.getCreatedTime() == null) {
            entity.setCreatedTime(LocalDateTime.now());
        }
        entity.setUpdatedTime(LocalDateTime.now());
        dao.save(entity);
    }

    @Override
    public void updateById(T entity) {
        entity.setUpdatedTime(LocalDateTime.now());
        dao.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        dao.logicDeleteById(id);
    }

}
