package org.ecommerce.dto;

public class ItemsDto {

    public  Integer itemId;
    public  String itemName;
    public Double itemPrice;
    public Double itemDiscountPrice;
    public String itemImagePath;
    public ItemsDto(Integer itemId, String itemName, Double itemPrice, Double itemDiscountPrice, String itemImagePath) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDiscountPrice = itemDiscountPrice;
        this.itemImagePath = itemImagePath;
    }
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Double getItemDiscountPrice() {
        return itemDiscountPrice;
    }

    public void setItemDiscountPrice(Double itemDiscountPrice) {
        this.itemDiscountPrice = itemDiscountPrice;
    }

    public String getItemImagePath() {
        return itemImagePath;
    }

    public void setItemImagePath(String itemImagePath) {
        this.itemImagePath = itemImagePath;
    }





}
