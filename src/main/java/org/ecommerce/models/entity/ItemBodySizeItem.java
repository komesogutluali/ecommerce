package org.ecommerce.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "item_body_size_item")
public class ItemBodySizeItem {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "body_size_item_id")
    private Integer bodySizeItemId;

    @Column(name = "body_id")
    private Integer bodyId;

    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "count")
    private Integer count;

    public Integer getBodySizeItemId() {
        return this.bodySizeItemId;
    }

    public void setBodySizeItemId(Integer bodySizeItemId) {
        this.bodySizeItemId = bodySizeItemId;
    }

    public Integer getBodyId() {
        return this.bodyId;
    }

    public void setBodyId(Integer bodyId) {
        this.bodyId = bodyId;
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
