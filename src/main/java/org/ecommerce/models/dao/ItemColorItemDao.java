package org.ecommerce.models.dao;

import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemColorItem;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ItemColorItemDao implements Dao<ItemColorItem> {
    @Override
    public int Save(ItemColorItem itemColorItem) {
        return 0;
    }

    @Override
    public int Update(ItemColorItem itemColorItem) {
        return 0;
    }

    @Override
    public int Delete(ItemColorItem itemColorItem) {
        return 0;
    }

    @Override
    public List<ItemColorItem> getAll() {
        return null;
    }
}
