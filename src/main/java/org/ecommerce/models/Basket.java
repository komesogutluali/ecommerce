package org.ecommerce.models;

public class Basket {
    private int item_id;
    private int wsize_id;
    private int lsize_id;
    public Basket(int item_id, int wsize_id, int lsize_id) {
        this.item_id = item_id;
        this.wsize_id = wsize_id;
        this.lsize_id = lsize_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getWsize_id() {
        return wsize_id;
    }

    public void setWsize_id(int wsize_id) {
        this.wsize_id = wsize_id;
    }

    public int getLsize_id() {
        return lsize_id;
    }

    public void setLsize_id(int lsize_id) {
        this.lsize_id = lsize_id;
    }

}
