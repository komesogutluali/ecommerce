package org.ecommerce.services;

import org.ecommerce.models.dao.ItemsCategoryDao;
import org.ecommerce.models.entity.ItemsCategory;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsCategoryService implements ServiceI<ItemsCategory> {
    @Autowired
    ItemsCategoryDao itemsCategoryDao;
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
        return itemsCategoryDao.getAll();
    }
}
