package org.ecommerce.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Items {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_price")
    private Double itemPrice;

    @Column(name = "item_discount_price")
    private Double itemDiscountPrice;

    @Column(name = "item_description")
    private String itemDescription;

    @Column(name = "item_image_name")
    private String itemImageName;

    @Column(name = "item_date")
    private java.sql.Date itemDate;

    @Column(name = "item_type")
    private Integer itemType;

    @Column(name = "item_category_id")
    private Integer itemCategoryId;

    @Column(name = "item_brand_id")
    private Integer itemBrandId;

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return this.itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Double getItemDiscountPrice() {
        return this.itemDiscountPrice;
    }

    public void setItemDiscountPrice(Double itemDiscountPrice) {
        this.itemDiscountPrice = itemDiscountPrice;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemImageName() {
        return this.itemImageName;
    }

    public void setItemImageName(String itemImageName) {
        this.itemImageName = itemImageName;
    }

    public java.sql.Date getItemDate() {
        return this.itemDate;
    }

    public void setItemDate(java.sql.Date itemDate) {
        this.itemDate = itemDate;
    }

    public Integer getItemType() {
        return this.itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public Integer getItemCategoryId() {
        return this.itemCategoryId;
    }

    public void setItemCategoryId(Integer itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }

    public Integer getItemBrandId() {
        return this.itemBrandId;
    }

    public void setItemBrandId(Integer itemBrandId) {
        this.itemBrandId = itemBrandId;
    }
}
