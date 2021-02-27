package org.ecommerce.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "item_size_l")
public class ItemSizeL {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "item_size_L_id")
    private Integer itemSizeLId;

    @Column(name = "item_size_name")
    private String itemSizeName;

    public Integer getItemSizeLId() {
        return this.itemSizeLId;
    }

    public void setItemSizeLId(Integer itemSizeLId) {
        this.itemSizeLId = itemSizeLId;
    }

    public String getItemSizeName() {
        return this.itemSizeName;
    }

    public void setItemSizeName(String itemSizeName) {
        this.itemSizeName = itemSizeName;
    }
}
