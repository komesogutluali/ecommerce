package org.ecommerce.services;

import org.ecommerce.models.entity.ItemsCategory;
import org.ecommerce.services.interfaces.ServiceI;

import java.util.List;

public class ItemsCategoryService implements ServiceI<ItemsCategory> {
    @Override
    public int Save(ItemsCategory itemsCategory) {
        return 0;
    }

    @Override
    public int Update(ItemsCategory itemsCategory) {
        return 0;
    }

    @Override
    public int Delete(ItemsCategory itemsCategory) {
        return 0;
    }

    @Override
    public List<ItemsCategory> getAll() {
        return null;
    }
}
