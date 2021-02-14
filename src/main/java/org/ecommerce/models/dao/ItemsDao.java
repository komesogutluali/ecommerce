package org.ecommerce.models.dao;


import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.Items;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ItemsDao implements Dao<Items> {

    @Autowired
    SessionFactory sessionFactory;
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

        Session s=sessionFactory.openSession();
        List<Items> itemsList=s.createQuery("from Items").list();
        return itemsList;
    }
}
