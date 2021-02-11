package org.ecommerce.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "items_category")
public class ItemsCategory {
    @Id
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_date")
    private java.sql.Date categoryDate;

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public java.sql.Date getCategoryDate() {
        return this.categoryDate;
    }

    public void setCategoryDate(java.sql.Date categoryDate) {
        this.categoryDate = categoryDate;
    }
}
