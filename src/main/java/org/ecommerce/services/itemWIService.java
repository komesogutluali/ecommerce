package org.ecommerce.services;

import org.ecommerce.models.dao.ItemWIDao;
import org.ecommerce.models.entity.ItemWL;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class itemWIService implements ServiceI<ItemWL> {
    @Autowired
    ItemWIDao itemWIDao;

    @Override
    public int Save(ItemWL itemSizeW) {
        return 0;
    }

    @Override
    public int Update(ItemWL itemSizeW) {
        return 0;
    }

    @Override
    public int Delete(ItemWL itemSizeW) {
        return 0;
    }

    @Override
    public List<ItemWL> getAll() {
        return null;
    }
    public List<ItemWL> getWList(int item_id) {
    return itemWIDao.getWList(item_id);
    }
    public List<ItemWL> getSizeL(int wsize_id,int item_id)
    {
       return itemWIDao.getSizeL(wsize_id,item_id);
    }
}
