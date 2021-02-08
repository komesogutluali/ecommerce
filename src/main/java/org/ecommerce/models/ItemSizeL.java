package org.ecommerce.models;

import javax.persistence.*;

@Entity
@Table(name = "item_size_l")
public class ItemSizeL {
    @Id
    @Column(name = "item_size_L_id")
    private Integer itemSizeLId;

    @Column(name = "s30")
    private Integer s30;

    @Column(name = "s31")
    private Integer s31;

    @Column(name = "s32")
    private Integer s32;

    @Column(name = "s33")
    private Integer s33;

    @Column(name = "s34")
    private Integer s34;

    @Column(name = "s35")
    private Integer s35;

    @Column(name = "s36")
    private Integer s36;

    @Column(name = "s37")
    private Integer s37;

    @Column(name = "s38")
    private Integer s38;

    @Column(name = "item_id")
    private Integer itemId;

    public Integer getItemSizeLId() {
        return this.itemSizeLId;
    }

    public void setItemSizeLId(Integer itemSizeLId) {
        this.itemSizeLId = itemSizeLId;
    }

    public Integer getS30() {
        return this.s30;
    }

    public void setS30(Integer s30) {
        this.s30 = s30;
    }

    public Integer getS31() {
        return this.s31;
    }

    public void setS31(Integer s31) {
        this.s31 = s31;
    }

    public Integer getS32() {
        return this.s32;
    }

    public void setS32(Integer s32) {
        this.s32 = s32;
    }

    public Integer getS33() {
        return this.s33;
    }

    public void setS33(Integer s33) {
        this.s33 = s33;
    }

    public Integer getS34() {
        return this.s34;
    }

    public void setS34(Integer s34) {
        this.s34 = s34;
    }

    public Integer getS35() {
        return this.s35;
    }

    public void setS35(Integer s35) {
        this.s35 = s35;
    }

    public Integer getS36() {
        return this.s36;
    }

    public void setS36(Integer s36) {
        this.s36 = s36;
    }

    public Integer getS37() {
        return this.s37;
    }

    public void setS37(Integer s37) {
        this.s37 = s37;
    }

    public Integer getS38() {
        return this.s38;
    }

    public void setS38(Integer s38) {
        this.s38 = s38;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}
