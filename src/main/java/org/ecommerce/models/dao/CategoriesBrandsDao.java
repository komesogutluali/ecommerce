package org.ecommerce.models.dao;


import org.ecommerce.dto.CategorysBrandsDto;
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

        Session s=sessionFactory.openSession();
        List<CategoriesBrands> categoriesBrands=s.createQuery("from CategoriesBrands ").list();
        return categoriesBrands;
    }
}