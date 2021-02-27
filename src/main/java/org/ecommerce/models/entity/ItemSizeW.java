package org.ecommerce.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "item_size_w")
public class ItemSizeW {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "item_size_w_id")
    private Integer itemSizeWId;

    @Column(name = "item_size_name")
    private String itemSizeName;

    public Integer getItemSizeWId() {
        return this.itemSizeWId;
    }

    public void setItemSizeWId(Integer itemSizeWId) {
        this.itemSizeWId = itemSizeWId;
    }

    public String getItemSizeName() {
        return this.itemSizeName;
    }

    public void setItemSizeName(String itemSizeName) {
        this.itemSizeName = itemSizeName;
    }
}
