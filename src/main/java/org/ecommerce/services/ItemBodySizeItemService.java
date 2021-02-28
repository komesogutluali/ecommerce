package org.ecommerce.services;

import org.ecommerce.models.entity.ItemBodySizeItem;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ItemBodySizeItemService implements ServiceI<ItemBodySizeItem> {
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
