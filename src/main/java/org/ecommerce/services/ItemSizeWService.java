package org.ecommerce.services;

import org.ecommerce.models.entity.ItemSizeW;
import org.ecommerce.services.interfaces.ServiceI;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemSizeWService implements ServiceI<ItemSizeW> {
    @Autowired
    SessionFactory sessionFactory;
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
        return itemSizeWS;
    }
}
