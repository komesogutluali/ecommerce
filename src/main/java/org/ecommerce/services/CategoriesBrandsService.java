package org.ecommerce.services;

import org.ecommerce.dto.CategorysBrandsDto;
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
    @Autowired
    ItemsBrandsDao itemsBrandsDao;
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
        List<CategorysBrandsDto> categorysBrandsDtos =itemsCategories.stream().
                map(c->new CategorysBrandsDto(c.getCategoryId(),c.getCategoryName())).collect(Collectors.toList());

        for (CategorysBrandsDto cbd:categorysBrandsDtos)
        {
            cbd.brands=itemsBrandsDao.getbrandList(cbd.categoryId);
        }
        return categorysBrandsDtos;
    }

}
