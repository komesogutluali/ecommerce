package org.ecommerce.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "item_color")
public class ItemColor {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "item_color_id")
    private Integer itemColorId;

    @Column(name = "item_color_name")
    private String itemColorName;

    public Integer getItemColorId() {
        return this.itemColorId;
    }

    public void setItemColorId(Integer itemColorId) {
        this.itemColorId = itemColorId;
    }

    public String getItemColorName() {
        return this.itemColorName;
    }

    public void setItemColorName(String itemColorName) {
        this.itemColorName = itemColorName;
    }
}
