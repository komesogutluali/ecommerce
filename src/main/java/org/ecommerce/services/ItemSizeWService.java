package org.ecommerce.services;

import org.ecommerce.models.entity.ItemSizeW;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemSizeWService implements ServiceI<ItemSizeW> {
    @Override
    public int Save(ItemSizeW itemSizeW) {
        return 0;
    }

    @Override
    public int Update(ItemSizeW itemSizeW) {
        return 0;
    }

    @Override
    public int Delete(ItemSizeW itemSizeW) {
        return 0;
    }

    @Override
    public List<ItemSizeW> getAll() {
        return null;
    }
}
