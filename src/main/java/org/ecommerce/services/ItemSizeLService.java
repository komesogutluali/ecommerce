package org.ecommerce.services;

import org.ecommerce.models.entity.ItemSizeL;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemSizeLService implements ServiceI<ItemSizeL> {
    @Override
    public int Save(ItemSizeL itemSizeL) {
        return 0;
    }

    @Override
    public int Update(ItemSizeL itemSizeL) {
        return 0;
    }

    @Override
    public int Delete(ItemSizeL itemSizeL) {
        return 0;
    }

    @Override
    public List<ItemSizeL> getAll() {
        return null;
    }
}
