package org.ecommerce.services;

import org.ecommerce.dto.ItemDetailsDto;
import org.ecommerce.dto.ItemsDto;
import org.ecommerce.models.dao.ItemsDao;
import org.ecommerce.models.entity.Items;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemsService implements ServiceI<Items> {

    @Autowired
    private  ItemsDao itemsDao;
    @Autowired
    private  ItemsBrandsService itemsBrandsService;
    @Autowired
    CommentService commentService;
    @Override
    public int Save(Items items) {
        return 0;
    }

    @Override
    public int Update(Items items) {
        return 0;
    }

    @Override
    public int Delete(Items items) {
        return 0;
    }

    @Override
    public List<Items> getAll() {

        return null;
    }
    public List<ItemsDto> getAllDto() {

        List<ItemsDto> itemsDtos=itemsDao.getAll().stream().map(i->new ItemsDto(i.getItemId(),i.getItemName(),i.getItemPrice(),i.getItemDiscountPrice(),i.getItemImageName())
        ).collect(Collectors.toList());
        return itemsDtos;
    }
    public ItemDetailsDto getItem(int item_id)
    {
        Items items=itemsDao.getItem(item_id);
      return new ItemDetailsDto(items.getItemId(),items.getItemName(),items.getItemPrice(),items.getItemDiscountPrice(),items.getItemImageName(),items.getItemDescription(),itemsBrandsService.getBrand(items.getItemBrandId()).getBrandName(),"asdsdasd");
    }
}
