package org.ecommerce.models.dao;


import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemColor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ItemColorDao implements Dao<ItemColor> {
    @Override
    public int Save(ItemColor itemColor) {
        return 0;
    }

    @Override
    public int Update(ItemColor itemColor) {
        return 0;
    }

    @Override
    public int Delete(ItemColor itemColor) {
        return 0;
    }

    @Override
    public List<ItemColor> getAll() {
        return null;
    }
}
