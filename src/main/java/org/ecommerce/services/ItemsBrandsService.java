package org.ecommerce.services;

import org.ecommerce.dto.BrandCount;
import org.ecommerce.models.dao.ItemsBrandsDao;
import org.ecommerce.models.dao.ItemsDao;
import org.ecommerce.models.entity.ItemsBrands;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ItemsBrandsService implements ServiceI<ItemsBrands> {
    @Autowired
    ItemsBrandsDao itemsBrandsDao;
    @Autowired
    ItemsDao itemsDao;
    @Override
    public int Save(ItemsBrands itemsBrands) {
        return 0;
    }

    @Override
    public int Update(ItemsBrands itemsBrands) {
        return 0;
    }

    @Override
    public int Delete(ItemsBrands itemsBrands) {
        return 0;
    }

    @Override
    public List<ItemsBrands> getAll() {

        return itemsBrandsDao.getAll();
    }
    public List<BrandCount> getCount()
    {
        return itemsBrandsDao.getCount();
    }
    public  ItemsBrands getBrand(Integer brand_id)
    {
        return itemsBrandsDao.getBrand(brand_id);
    }
}
