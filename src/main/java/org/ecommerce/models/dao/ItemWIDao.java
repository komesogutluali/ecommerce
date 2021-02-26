package org.ecommerce.models.dao;

import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemWI;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ItemWIDao implements Dao<ItemWI> {
    @Override
    public int Save(ItemWI itemWI) {
        return 0;
    }

    @Override
    public int Update(ItemWI itemWI) {
        return 0;
    }

    @Override
    public int Delete(ItemWI itemWI) {
        return 0;
    }

    @Override
    public List<ItemWI> getAll() {
        return null;
    }
}
