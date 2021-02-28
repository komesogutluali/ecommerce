package org.ecommerce.services;

import org.ecommerce.dto.CategorysBrandsDto;
import org.ecommerce.models.Brand;
import org.ecommerce.models.dao.CategoriesBrandsDao;
import org.ecommerce.models.dao.ItemsBrandsDao;
import org.ecommerce.models.dao.ItemsCategoryDao;
import org.ecommerce.models.entity.CategoriesBrands;
import org.ecommerce.models.entity.ItemsBrands;
import org.ecommerce.models.entity.ItemsCategory;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.stream.Collectors;

@Service
public class CategoriesBrandsService implements ServiceI<CategoriesBrands> {
    @Autowired
    CategoriesBrandsDao categoriesBrandsDao;
    @Autowired
    ItemsCategoryDao itemsCategoryDao;
    @Override
    public int Save(CategoriesBrands categoriesBrands) {
        return 0;
    }

    @Override
    public int Update(CategoriesBrands categoriesBrands) {
        return 0;
    }

    @Override
    public int Delete(CategoriesBrands categoriesBrands) {
        return 0;
    }

    @Override
    public List<CategoriesBrands> getAll() {
        return null;
    }

    public List<CategorysBrandsDto> getCategorysBrands()
    {

        List<ItemsCategory> itemsCategories=itemsCategoryDao.getAll();
        List<Brand> brandList=categoriesBrandsDao.getbrandList(itemsCategories.stream().map(ib->ib.getCategoryId()).collect(Collectors.toList()));
        List<CategorysBrandsDto> categorysBrandsDtos =itemsCategories.stream().
                map(c->new CategorysBrandsDto(c.getCategoryId(),c.getCategoryName(),brandList.stream().filter
                        (b->b.getCategoryId().equals(c.getCategoryId())).collect(Collectors.toMap(Brand::getBrandId,Brand::getBrandName)))).collect(Collectors.toList());
        return categorysBrandsDtos;
    }

}
