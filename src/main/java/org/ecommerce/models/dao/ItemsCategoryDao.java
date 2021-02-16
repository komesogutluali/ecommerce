package org.ecommerce.models.dao;



import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemsCategory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
@Repository
@Transactional
public class ItemsCategoryDao implements Dao<ItemsCategory> {

    @Autowired
    SessionFactory sessionFactory;
    Session s;
    @Override
    public int Save(ItemsCategory itemsCategory) {
        return 0;
    }

    @Override
    public int Update(ItemsCategory itemsCategory) {
        return 0;
    }

    @Override
    public int Delete(ItemsCategory itemsCategory) {
        return 0;
    }

    @Override
    public List<ItemsCategory> getAll() {
        s=sessionFactory.openSession();

        return s.createQuery("from ItemsCategory").list();
    }

}
