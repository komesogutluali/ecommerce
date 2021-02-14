package org.ecommerce.models.dao;


import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemSizeW;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ItemSizeWDao implements Dao<ItemSizeW> {

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
