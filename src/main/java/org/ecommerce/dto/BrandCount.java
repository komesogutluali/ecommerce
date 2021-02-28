package org.ecommerce.dto;

import org.ecommerce.models.Brand;

public class BrandCount {
    public BrandCount(Integer brandId, String brandName, Long brand_count) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brand_count = brand_count;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getBrand_count() {
        return brand_count;
    }

    public void setBrand_count(Long brand_count) {
        this.brand_count = brand_count;
    }

    private Integer brandId;
    private String brandName;
    private Long brand_count;
}
