package org.ecommerce.dto;

import java.util.List;

public class CategorysBrandsDto {
    public Integer brandId;
    public Integer categoryId;
    public String categoryName;
    public List<String> brandNameList;
    public CategorysBrandsDto(Integer brandId, Integer categoryId, String categoryName, List<String> brandNameList) {
        this.brandId = brandId;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.brandNameList = brandNameList;
    }
}
