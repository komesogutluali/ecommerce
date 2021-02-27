package org.ecommerce.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "categories_brands")
public class CategoriesBrands {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "catbra_id")
    private Integer catbraId;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "brands_id")
    private Integer brandsId;

    public Integer getCatbraId() {
        return this.catbraId;
    }

    public void setCatbraId(Integer catbraId) {
        this.catbraId = catbraId;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBrandsId() {
        return this.brandsId;
    }

    public void setBrandsId(Integer brandsId) {
        this.brandsId = brandsId;
    }
}
