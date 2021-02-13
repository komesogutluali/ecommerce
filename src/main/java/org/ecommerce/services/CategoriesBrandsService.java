package org.ecommerce.services;

import org.ecommerce.models.entity.CategoriesBrands;
import org.ecommerce.services.interfaces.ServiceI;

import java.util.List;

public class CategoriesBrandsService implements ServiceI<CategoriesBrands> {
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
}
