package org.ecommerce.models.dao;

import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemBodySize;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ItemBodySizeDao implements Dao<ItemBodySize> {
    @Override
    public int Save(ItemBodySize itemBodySize) {
        return 0;
    }

    @Override
    public int Update(ItemBodySize itemBodySize) {
        return 0;
    }

    @Override
    public int Delete(ItemBodySize itemBodySize) {
        return 0;
    }

    @Override
    public List<ItemBodySize> getAll() {
        return null;
    }
}
