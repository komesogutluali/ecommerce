package org.ecommerce.services;

import org.ecommerce.models.entity.ItemWL;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class itemWIService implements ServiceI<ItemWL> {
    @Override
    public int Save(ItemWL itemSizeW) {
        return 0;
    }

    @Override
    public int Update(ItemWL itemSizeW) {
        return 0;
    }

    @Override
    public int Delete(ItemWL itemSizeW) {
        return 0;
    }

    @Override
    public List<ItemWL> getAll() {
        return null;
    }
}
