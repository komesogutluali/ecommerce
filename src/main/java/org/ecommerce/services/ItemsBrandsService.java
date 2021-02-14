package org.ecommerce.services;

import org.ecommerce.models.entity.ItemsBrands;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsBrandsService implements ServiceI<ItemsBrands> {
    @Override
    public int Save(ItemsBrands itemsBrands) {
        return 0;
    }

    @Override
    public int Update(ItemsBrands itemsBrands) {
        return 0;
    }

    @Override
    public int Delete(ItemsBrands itemsBrands) {
        return 0;
    }

    @Override
    public List<ItemsBrands> getAll() {
        return null;
    }
}
