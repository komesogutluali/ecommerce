package org.ecommerce.models.dao;



import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemSizeL;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ItemSizeLDao implements Dao<ItemSizeL> {

    @Override
    public int Save(ItemSizeL itemSizeL) {
        return 0;
    }

    @Override
    public int Update(ItemSizeL itemSizeL) {
        return 0;
    }

    @Override
    public int Delete(ItemSizeL itemSizeL) {
        return 0;
    }

    @Override
    public List<ItemSizeL> getAll() {
        return null;
    }
}
