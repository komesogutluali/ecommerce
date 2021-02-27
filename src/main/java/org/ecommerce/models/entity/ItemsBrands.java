package org.ecommerce.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "items_brands")
public class ItemsBrands {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "brand_date")
    private java.sql.Date brandDate;

    public Integer getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public java.sql.Date getBrandDate() {
        return this.brandDate;
    }

    public void setBrandDate(java.sql.Date brandDate) {
        this.brandDate = brandDate;
    }
}
