package org.ecommerce.models.dao;


import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemsBrands;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ItemsBrandsDao implements Dao<ItemsBrands> {

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
