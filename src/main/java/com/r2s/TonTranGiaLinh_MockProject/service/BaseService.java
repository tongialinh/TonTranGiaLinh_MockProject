package com.r2s.TonTranGiaLinh_MockProject.service;

import java.util.List;

public interface BaseService <T, K> {
    T getById(K key);
    List<T> getAll(int pageNo, int pageSize, String sortDir, String sortBy);
    T create(T type);
    T update(T type);
}