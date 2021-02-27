package org.ecommerce.dto;

public class ItemsDto {

    public  Integer itemId;
    public  String itemName;
    public Double itemPrice;
    public Double itemDiscountPrice;
    public String imageName;
    public ItemsDto(Integer itemId, String itemName, Double itemPrice, Double itemDiscountPrice, String imageName) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDiscountPrice = itemDiscountPrice;
        this.imageName = imageName;
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

    public String getItemImageName() {
        return imageName;
    }

    public void setItemImageName(String imageName) {
        this.imageName = imageName;
    }

}
