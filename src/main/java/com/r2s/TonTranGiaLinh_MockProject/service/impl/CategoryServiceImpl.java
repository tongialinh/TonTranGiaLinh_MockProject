package com.r2s.TonTranGiaLinh_MockProject.service.impl;

import com.r2s.TonTranGiaLinh_MockProject.dto.CategoryDTO;
import com.r2s.TonTranGiaLinh_MockProject.entity.Category;
import com.r2s.TonTranGiaLinh_MockProject.repository.CategoryRepository;
import com.r2s.TonTranGiaLinh_MockProject.service.CategoryService;
import com.r2s.TonTranGiaLinh_MockProject.util.PaginationSortingUtils;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.domain.Pageable;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CategoryDTO getById(Long key) {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public List<CategoryDTO> getAll(int pageNo, int pageSize, String sortDir, String sortBy) {
        Pageable pageable = PaginationSortingUtils.getPageable(pageNo,pageSize,sortDir,sortBy);
        List<Category> categories = categoryRepository.findAll(pageable).getContent();
        if(!categories.isEmpty()){
            Type listType = new TypeToken<List<CategoryDTO>>() {}.getType();
            return modelMapper.map(categories,listType);
        }else {
            return Collections.emptyList();
        }
    }

    @Override
    public CategoryDTO create(CategoryDTO type) {
        return null;
    }

    @Override
    public CategoryDTO update(CategoryDTO type) {
        return null;
    }
}
