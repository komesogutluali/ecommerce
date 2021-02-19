package org.ecommerce.models;

public class Brand {


    private Integer categoryId;
    private String brandName;
    private Integer brandId;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Brand(String brandName,Integer brandId,Integer categoryId)
    {
        this.brandId=brandId;
        this.brandName=brandName;
        this.categoryId=categoryId;
    }
}
