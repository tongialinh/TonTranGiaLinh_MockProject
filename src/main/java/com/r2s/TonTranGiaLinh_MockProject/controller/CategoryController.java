package com.r2s.TonTranGiaLinh_MockProject.controller;

import com.r2s.TonTranGiaLinh_MockProject.constant.PaginationConstant;
import com.r2s.TonTranGiaLinh_MockProject.dto.CategoryDTO;
import com.r2s.TonTranGiaLinh_MockProject.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getAllCategories(
            @RequestParam(value = "pageNo", defaultValue = PaginationConstant.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = PaginationConstant.DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam(value = "sortDir", defaultValue = PaginationConstant.DEFAULT_SORT_DIRECTION, required = false) String sortDir,
            @RequestParam(value = "sortBy", defaultValue = PaginationConstant.DEFAULT_SORT_BY, required = false) String sortBy
    ){
        List<CategoryDTO> categoryDTOS = categoryService.getAll(pageNo,pageSize,sortDir,sortBy);
        return new ResponseEntity<>(categoryDTOS, HttpStatus.OK);
    }
}
