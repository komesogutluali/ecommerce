package org.ecommerce.services;

import org.ecommerce.models.entity.ItemBodySize;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ItemBodySizeService implements ServiceI<ItemBodySize> {
    @Override
    public int Save(ItemBodySize itemBodySize) {
        return 0;
    }

    @Override
    public int Update(ItemBodySize itemBodySize) {
        return 0;
    }

    @Override
    public int Delete(ItemBodySize itemBodySize) {
        return 0;
    }

    @Override
    public List<ItemBodySize> getAll() {
        return null;
    }
}
