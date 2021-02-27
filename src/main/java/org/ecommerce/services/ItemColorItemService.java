package org.ecommerce.services;

import org.ecommerce.models.entity.ItemColorItem;
import org.ecommerce.services.interfaces.ServiceI;

import java.util.List;

public class ItemColorItemService implements ServiceI<ItemColorItem> {
    @Override
    public int Save(ItemColorItem itemColorItem) {
        return 0;
    }

    @Override
    public int Update(ItemColorItem itemColorItem) {
        return 0;
    }

    @Override
    public int Delete(ItemColorItem itemColorItem) {
        return 0;
    }

    @Override
    public List<ItemColorItem> getAll() {
        return null;
    }
}
