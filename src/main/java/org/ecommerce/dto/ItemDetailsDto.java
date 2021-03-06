package org.ecommerce.dto;

import java.util.HashMap;
import java.util.Map;

public class ItemDetailsDto {
    private   Integer itemId;
    private  String itemName;
    private Double itemPrice;
    private Double itemDiscountPrice;
    private String imageName;
    private String itemDescription;
    private String brandName;
    private String comment_description;
    private Integer itemsType;
    private Map<Integer,String> wSize;

    public ItemDetailsDto(Integer itemId, String itemName, Double itemPrice, Double itemDiscountPrice, String imageName, String itemDescription, String brandName, String comment_description,Integer itemsType) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDiscountPrice = itemDiscountPrice;
        this.imageName = imageName;
        this.itemDescription = itemDescription;
        this.brandName = brandName;
        this.comment_description = comment_description;
        this.itemsType=itemsType;
    }
    public Map<Integer, String> getwSize() {
        return wSize;
    }

    public void setwSize(Map<Integer, String> wSize) {
        this.wSize = wSize;
    }
    public Integer getItemsType() {
        return itemsType;
    }

    public void setItemsType(Integer itemsType) {
        this.itemsType = itemsType;
    }
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getComment_description() {
        return comment_description;
    }

    public void setComment_description(String comment_description) {
        this.comment_description = comment_description;
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
