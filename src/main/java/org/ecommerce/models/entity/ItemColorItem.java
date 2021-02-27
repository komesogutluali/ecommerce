package org.ecommerce.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "item_color_item")
public class ItemColorItem {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "color_item_id")
    private Integer colorItemId;

    @Column(name = "item_color_id")
    private Integer itemColorId;

    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "count")
    private Integer count;

    public Integer getColorItemId() {
        return this.colorItemId;
    }

    public void setColorItemId(Integer colorItemId) {
        this.colorItemId = colorItemId;
    }

    public Integer getItemColorId() {
        return this.itemColorId;
    }

    public void setItemColorId(Integer itemColorId) {
        this.itemColorId = itemColorId;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
