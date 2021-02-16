package org.ecommerce.dto;

import org.ecommerce.models.Brand;

import java.util.List;

public class CategorysBrandsDto {
    public Integer categoryId;
    public String categoryName;
    public List<Brand> brands;
    public CategorysBrandsDto(Integer categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
}
