package org.ecommerce.services;

import org.ecommerce.models.entity.Items;
import org.ecommerce.services.interfaces.ServiceI;

import java.util.List;

public class ItemsService implements ServiceI<Items> {
    @Override
    public int Save(Items items) {
        return 0;
    }

    @Override
    public int Update(Items items) {
        return 0;
    }

    @Override
    public int Delete(Items items) {
        return 0;
    }

    @Override
    public List<Items> getAll() {
        return null;
    }
}
