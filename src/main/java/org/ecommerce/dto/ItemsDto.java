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



}
