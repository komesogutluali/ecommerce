package org.ecommerce.services;

import org.ecommerce.models.dao.ItemSizeLDao;
import org.ecommerce.models.entity.ItemSizeL;
import org.ecommerce.models.entity.ItemWL;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ItemSizeLService implements ServiceI<ItemSizeL> {
    @Autowired
    private ItemSizeLDao itemSizeLDao;
    @Autowired
    private itemWIService itemWIService;
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
    public Map<Integer,String> getSelectedLList(int wsiz_id,int item_id)
    {
        List<ItemSizeL> itemSizeLS= itemSizeLDao.getAll();
        List<ItemWL> itemWIS=itemWIService.getSizeL(wsiz_id,item_id);
        Map<Integer,String> lList=new HashMap<>();
        itemWIS.forEach(iws->lList.put(iws.getSizeIId(),itemSizeLS.stream().filter(iss->iss.getItemSizeLId().equals(iws.getSizeIId())).findFirst().get().getItemSizeName()));
       return lList;
    }
}
