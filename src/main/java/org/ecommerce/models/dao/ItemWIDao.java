package org.ecommerce.models.dao;

import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemWL;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ItemWIDao implements Dao<ItemWL> {
    @Override
    public int Save(ItemWL itemWI) {
        return 0;
    }

    @Override
    public int Update(ItemWL itemWI) {
        return 0;
    }

    @Override
    public int Delete(ItemWL itemWI) {
        return 0;
    }

    @Override
    public List<ItemWL> getAll() {
        return null;
    }
}
