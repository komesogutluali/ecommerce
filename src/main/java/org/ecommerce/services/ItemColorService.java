package org.ecommerce.services;

import org.ecommerce.models.entity.ItemColor;
import org.ecommerce.services.interfaces.ServiceI;

import java.util.List;

public class ItemColorService implements ServiceI<ItemColor> {
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
