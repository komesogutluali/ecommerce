package org.ecommerce.models.dao;

import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemBodySizeItem;

import java.util.List;

public class ItemBodySizeItemDao implements Dao<ItemBodySizeItem> {
    @Override
    public int Save(ItemBodySizeItem itemBodySizeItem) {
        return 0;
    }

    @Override
    public int Update(ItemBodySizeItem itemBodySizeItem) {
        return 0;
    }

    @Override
    public int Delete(ItemBodySizeItem itemBodySizeItem) {
        return 0;
    }

    @Override
    public List<ItemBodySizeItem> getAll() {
        return null;
    }
}
