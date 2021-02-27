package org.ecommerce.models.entity;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "item_w_l")
public class ItemWL {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "item_w_I_id")
    private Integer itemWIId;

    @Column(name = "size_w_id")
    private Integer sizeWId;

    @Column(name = "size_I_id")
    private Integer sizeIId;

    @Column(name = "item_count")
    private Integer itemCount;

    @Column(name = "item_id")
    private Integer itemId;

    public Integer getItemWIId() {
        return this.itemWIId;
    }

    public void setItemWIId(Integer itemWIId) {
        this.itemWIId = itemWIId;
    }

    public Integer getSizeWId() {
        return this.sizeWId;
    }

    public void setSizeWId(Integer sizeWId) {
        this.sizeWId = sizeWId;
    }

    public Integer getSizeIId() {
        return this.sizeIId;
    }

    public void setSizeIId(Integer sizeIId) {
        this.sizeIId = sizeIId;
    }

    public Integer getItemCount() {
        return this.itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}
