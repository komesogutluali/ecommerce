package org.ecommerce.models.dao;


import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemColor;

import java.util.List;

public class ItemColorDao implements Dao<ItemColor> {
    @Override
    public int Save(ItemColor itemColor) {
        return 0;
    }

    @Override
    public int Update(ItemColor itemColor) {
        return 0;
    }

    @Override
    public int Delete(ItemColor itemColor) {
        return 0;
    }

    @Override
    public List<ItemColor> getAll() {
        return null;
    }
}
