package org.ecommerce.services;

import org.ecommerce.dto.ItemsDto;
import org.ecommerce.models.dao.ItemsDao;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemsService implements ServiceI<ItemsDto> {

    @Autowired
    private  ItemsDao itemsDao;
    @Override
    public int Save(ItemsDto items) {
        return 0;
    }

    @Override
    public int Update(ItemsDto items) {
        return 0;
    }

    @Override
    public int Delete(ItemsDto items) {
        return 0;
    }

    @Override
    public List<ItemsDto> getAll() {

        List<ItemsDto> itemsDtos=itemsDao.getAll().stream().map(i->new ItemsDto(i.getItemId(),i.getItemName(),i.getItemPrice(),i.getItemDiscountPrice(),i.getItemImagePath())).collect(Collectors.toList());
        return itemsDtos;
    }
}
