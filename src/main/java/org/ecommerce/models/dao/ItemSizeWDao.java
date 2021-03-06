package org.ecommerce.models.dao;


import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemSizeW;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ItemSizeWDao implements Dao<ItemSizeW> {
    @Autowired
    private SessionFactory sessionFactory;
    Session s;
    @Override
    public int Save(ItemSizeW itemSizeW) {
        return 0;
    }

    @Override
    public int Update(ItemSizeW itemSizeW) {
        return 0;
    }

    @Override
    public int Delete(ItemSizeW itemSizeW) {
        return 0;
    }

    @Override
    public List<ItemSizeW> getAll() {
        s=sessionFactory.openSession();
        List<ItemSizeW> itemSizeWS=s.createQuery("from ItemSizeW").list();
        s.close();
        return null;
    }
}
