package org.ecommerce.models.dao;


import org.ecommerce.dto.CategorysBrandsDto;
import org.ecommerce.models.Brand;
import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.CategoriesBrands;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class CategoriesBrandsDao implements Dao<CategoriesBrands> {
    @Autowired
    SessionFactory sessionFactory;
    Session s;
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


        s=sessionFactory.openSession();
        List<CategoriesBrands> categoriesBrands=s.createQuery("from CategoriesBrands ").list();
        s.close();
        return categoriesBrands;
    }
    public List<Brand> getbrandList(List<Integer> categoryList)
    {

        s=sessionFactory.openSession();
        List<Brand> brandList=s.createQuery("select new org.ecommerce.models.Brand(ib.brandName,ib.brandId,cb.categoryId) from " +
                " ItemsBrands as ib inner join CategoriesBrands as cb on ib.brandId=cb.brandsId " +
                "where cb.categoryId  in(:categoryId)",Brand.class).setParameterList("categoryId",categoryList).getResultList();
        s.close();
        return brandList;
    }

}