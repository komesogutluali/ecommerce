package org.ecommerce.models.dao;


import org.ecommerce.models.Brand;
import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemsBrands;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@Transactional
public class ItemsBrandsDao implements Dao<ItemsBrands> {
    @Autowired
    private SessionFactory sessionFactory;
    private  Session s;
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
        s=sessionFactory.openSession();
        List<ItemsBrands> itemsBrands=s.createQuery("from ItemsBrands ").list();
        s.close();
        return itemsBrands;
    }

}
