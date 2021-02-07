package org.ecommerce.models;

import javax.persistence.*;

@Entity
@Table(name = "item_size_l")
public class ItemSizeL {
    @Id
    @Column(name = "item_size_L_id")
    private Integer itemSizeLId;

    @Column(name = "30")
    private Integer 30;

    @Column(name = "31")
    private Integer 31;

    @Column(name = "32")
    private Integer 32;

    @Column(name = "33")
    private Integer 33;

    @Column(name = "34")
    private Integer 34;

    @Column(name = "35")
    private Integer 35;

    @Column(name = "36")
    private Integer 36;

    @Column(name = "37")
    private Integer 37;

    @Column(name = "38")
    private Integer 38;

    @Column(name = "item_id")
    private Integer itemId;

    public Integer getItemSizeLId() {
        return this.itemSizeLId;
    }

    public void setItemSizeLId(Integer itemSizeLId) {
        this.itemSizeLId = itemSizeLId;
    }

    public Integer get30() {
        return this.30;
    }

    public void set30(Integer 30) {
        this.30 = 30;
    }

    public Integer get31() {
        return this.31;
    }

    public void set31(Integer 31) {
        this.31 = 31;
    }

    public Integer get32() {
        return this.32;
    }

    public void set32(Integer 32) {
        this.32 = 32;
    }

    public Integer get33() {
        return this.33;
    }

    public void set33(Integer 33) {
        this.33 = 33;
    }

    public Integer get34() {
        return this.34;
    }

    public void set34(Integer 34) {
        this.34 = 34;
    }

    public Integer get35() {
        return this.35;
    }

    public void set35(Integer 35) {
        this.35 = 35;
    }

    public Integer get36() {
        return this.36;
    }

    public void set36(Integer 36) {
        this.36 = 36;
    }

    public Integer get37() {
        return this.37;
    }

    public void set37(Integer 37) {
        this.37 = 37;
    }

    public Integer get38() {
        return this.38;
    }

    public void set38(Integer 38) {
        this.38 = 38;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}
