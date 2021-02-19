package org.ecommerce.dto;

import org.ecommerce.models.Brand;

import java.util.List;
import java.util.Map;

public class CategorysBrandsDto {
    private Integer categoryId;
    private String categoryName;
    private Map<Integer,String> brands;

    public CategorysBrandsDto(Integer categoryId, String categoryName,Map<Integer,String> brands) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.brands=brands;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Map<Integer,String> getBrands() {
        return brands;
    }

    public void setBrands(Map<Integer,String> brands) {
        this.brands = brands;
    }

}
