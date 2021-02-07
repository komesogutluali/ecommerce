package org.ecommerce.models;

import javax.persistence.*;

@Entity
@Table(name = "item_color")
public class ItemColor {
    @Id
    @Column(name = "item_color_id")
    private Integer itemColorId;

    @Column(name = "yellow_count")
    private Integer yellowCount;

    @Column(name = "red_count")
    private Integer redCount;

    @Column(name = "black_count")
    private Integer blackCount;

    @Column(name = "white_count")
    private Integer whiteCount;

    @Column(name = "gri_count")
    private Integer griCount;

    @Column(name = "green_count")
    private Integer greenCount;

    @Column(name = "item_id")
    private Integer itemId;

    public Integer getItemColorId() {
        return this.itemColorId;
    }

    public void setItemColorId(Integer itemColorId) {
        this.itemColorId = itemColorId;
    }

    public Integer getYellowCount() {
        return this.yellowCount;
    }

    public void setYellowCount(Integer yellowCount) {
        this.yellowCount = yellowCount;
    }

    public Integer getRedCount() {
        return this.redCount;
    }

    public void setRedCount(Integer redCount) {
        this.redCount = redCount;
    }

    public Integer getBlackCount() {
        return this.blackCount;
    }

    public void setBlackCount(Integer blackCount) {
        this.blackCount = blackCount;
    }

    public Integer getWhiteCount() {
        return this.whiteCount;
    }

    public void setWhiteCount(Integer whiteCount) {
        this.whiteCount = whiteCount;
    }

    public Integer getGriCount() {
        return this.griCount;
    }

    public void setGriCount(Integer griCount) {
        this.griCount = griCount;
    }

    public Integer getGreenCount() {
        return this.greenCount;
    }

    public void setGreenCount(Integer greenCount) {
        this.greenCount = greenCount;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}
