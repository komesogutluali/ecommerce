package org.ecommerce.models.dao;



import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemsCategory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ItemsCategoryDao implements Dao<ItemsCategory> {

    @Override
    public int Save(ItemsCategory itemsCategory) {
        return 0;
    }

    @Override
    public int Update(ItemsCategory itemsCategory) {
        return 0;
    }

    @Override
    public int Delete(ItemsCategory itemsCategory) {
        return 0;
    }

    @Override
    public List<ItemsCategory> getAll() {
        return null;
    }
}
