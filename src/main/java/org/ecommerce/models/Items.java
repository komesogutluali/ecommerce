package org.ecommerce.models;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Items {
    @Id
    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_price")
    private Double itemPrice;

    @Column(name = "item_discount_price")
    private Double itemDiscountPrice;

    @Column(name = "item_small_count")
    private Integer itemSmallCount;

    @Column(name = "item_medium_count")
    private Integer itemMediumCount;

    @Column(name = "item_large_count")
    private Integer itemLargeCount;

    @Column(name = "item_extralarge_count")
    private Integer itemExtralargeCount;

    @Column(name = "item_extraextralarge_count")
    private Integer itemExtraextralargeCount;

    @Column(name = "item_description")
    private String itemDescription;

    @Column(name = "item_image_path")
    private String itemImagePath;

    @Column(name = "item_date")
    private java.sql.Date itemDate;

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

    public Integer getItemSmallCount() {
        return this.itemSmallCount;
    }

    public void setItemSmallCount(Integer itemSmallCount) {
        this.itemSmallCount = itemSmallCount;
    }

    public Integer getItemMediumCount() {
        return this.itemMediumCount;
    }

    public void setItemMediumCount(Integer itemMediumCount) {
        this.itemMediumCount = itemMediumCount;
    }

    public Integer getItemLargeCount() {
        return this.itemLargeCount;
    }

    public void setItemLargeCount(Integer itemLargeCount) {
        this.itemLargeCount = itemLargeCount;
    }

    public Integer getItemExtralargeCount() {
        return this.itemExtralargeCount;
    }

    public void setItemExtralargeCount(Integer itemExtralargeCount) {
        this.itemExtralargeCount = itemExtralargeCount;
    }

    public Integer getItemExtraextralargeCount() {
        return this.itemExtraextralargeCount;
    }

    public void setItemExtraextralargeCount(Integer itemExtraextralargeCount) {
        this.itemExtraextralargeCount = itemExtraextralargeCount;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemImagePath() {
        return this.itemImagePath;
    }

    public void setItemImagePath(String itemImagePath) {
        this.itemImagePath = itemImagePath;
    }

    public java.sql.Date getItemDate() {
        return this.itemDate;
    }

    public void setItemDate(java.sql.Date itemDate) {
        this.itemDate = itemDate;
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
