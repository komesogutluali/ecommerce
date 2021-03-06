package org.ecommerce.services;

import org.ecommerce.dto.ItemDetailsDto;
import org.ecommerce.dto.ItemsDto;
import org.ecommerce.models.dao.ItemBodySizeItemDao;
import org.ecommerce.models.dao.ItemsDao;
import org.ecommerce.models.entity.ItemBodySizeItem;
import org.ecommerce.models.entity.ItemSizeW;
import org.ecommerce.models.entity.ItemWL;
import org.ecommerce.models.entity.Items;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ItemsService implements ServiceI<Items> {

    @Autowired
    private  ItemsDao itemsDao;
    @Autowired
    private  ItemsBrandsService itemsBrandsService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private ItemBodySizeItemService itemBodySizeItemService;
    @Autowired
    private ItemSizeWService itemSizeWService;
    @Autowired
    private itemWIService itemWIService;
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
    public List<ItemsDto> getAllDto(int category_id,int brand_id) {

        List<ItemsDto> itemsDtos=itemsDao.getAll(category_id,brand_id).stream().map(i->new ItemsDto(i.getItemId(),i.getItemName(),i.getItemPrice(),i.getItemDiscountPrice(),i.getItemImageName())
        ).collect(Collectors.toList());
        return itemsDtos;
    }
    public ItemDetailsDto getItem(int item_id)
    {
        Items items=itemsDao.getItem(item_id);
        List<ItemSizeW> itemSizeWList=itemSizeWService.getAll();
        List<ItemWL> itemWLS= itemWIService.getWList(item_id);
        Map<Integer,String> itemWlsList=new HashMap<Integer,String>();
        itemWLS.forEach(wls->itemWlsList.put(wls.getSizeWId(),itemSizeWList.stream().filter(isw->isw.getItemSizeWId().equals(wls.getSizeWId())).findFirst().get().getItemSizeName()));
        ItemDetailsDto itemDetailsDto=new ItemDetailsDto(items.getItemId(),items.getItemName(),items.getItemPrice(),items.getItemDiscountPrice(),items.getItemImageName(),
                items.getItemDescription(),itemsBrandsService.
                getBrand(items.getItemBrandId()).getBrandName(),"asdsdasd",items.getItemType());
        itemDetailsDto.setwSize(itemWlsList);
        return itemDetailsDto;
    }
    public List<ItemsDto> getBrandAll(int brand_id) {

        List<ItemsDto> itemsDtos=itemsDao.getAll(brand_id).stream().map(i->new ItemsDto(i.getItemId(),i.getItemName(),i.getItemPrice(),i.getItemDiscountPrice(),i.getItemImageName())
        ).collect(Collectors.toList());
        return itemsDtos;
    }
}
