package org.ecommerce.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "item_body_size")
public class ItemBodySize {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "body_size_id")
    private Integer bodySizeId;

    @Column(name = "body_size_name")
    private String bodySizeName;

    public Integer getBodySizeId() {
        return this.bodySizeId;
    }

    public void setBodySizeId(Integer bodySizeId) {
        this.bodySizeId = bodySizeId;
    }

    public String getBodySizeName() {
        return this.bodySizeName;
    }

    public void setBodySizeName(String bodySizeName) {
        this.bodySizeName = bodySizeName;
    }
}
