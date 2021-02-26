package org.ecommerce.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "item_size_w")
public class ItemSizeW {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "tem_size_w_id")
    private Integer temSizeWId;

    @Column(name = "item_size_name")
    private String itemSizeName;

    public Integer getTemSizeWId() {
        return this.temSizeWId;
    }

    public void setTemSizeWId(Integer temSizeWId) {
        this.temSizeWId = temSizeWId;
    }

    public String getItemSizeName() {
        return this.itemSizeName;
    }

    public void setItemSizeName(String itemSizeName) {
        this.itemSizeName = itemSizeName;
    }
}
