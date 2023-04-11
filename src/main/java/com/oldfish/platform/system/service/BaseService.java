package com.oldfish.platform.system.service;

import com.oldfish.platform.system.entity.BaseEntity;

import java.util.List;

public interface BaseService<T extends BaseEntity> {

    T findById(Long id);

    void save(T entity);

    void updateById(T entity);

    void deleteById(Long id);


}
