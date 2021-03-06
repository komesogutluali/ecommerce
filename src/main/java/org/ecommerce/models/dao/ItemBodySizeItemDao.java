package org.ecommerce.models.dao;

import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemBodySizeItem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ItemBodySizeItemDao implements Dao<ItemBodySizeItem> {
    @Autowired
    SessionFactory sessionFactory;
    Session s;
    @Override
    public int Save(ItemBodySizeItem itemBodySizeItem) {
        return 0;
    }

    @Override
    public int Update(ItemBodySizeItem itemBodySizeItem) {
        return 0;
    }

    @Override
    public int Delete(ItemBodySizeItem itemBodySizeItem) {
        return 0;
    }

    @Override
    public List<ItemBodySizeItem> getAll() {
        return null;
    }

    public int getCount(int item_id)
    {
      s=sessionFactory.openSession();
      int count=(int)s.createQuery("select  sum(itemCount) from ItemBodySizeItem where itemId=:itemId").setParameter("itemId",item_id).uniqueResult();
      s.close();
      return count;
    }
    public List<ItemBodySizeItem> getItemIDW(int item_id)
    {
        s= sessionFactory.openSession();
        List<ItemBodySizeItem> itemBodySizeItems=s.createQuery("from ItemBodySizeItem where itemId=:itemId").
                setParameter("itemId",item_id).list();
        s.close();
        return itemBodySizeItems;
    }

}
