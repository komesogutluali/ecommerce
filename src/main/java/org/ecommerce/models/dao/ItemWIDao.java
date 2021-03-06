package org.ecommerce.models.dao;

import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.ItemWL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ItemWIDao implements Dao<ItemWL> {
    @Autowired
    SessionFactory sessionFactory;
    Session s;
    @Override
    public int Save(ItemWL itemWI) {
        return 0;
    }

    @Override
    public int Update(ItemWL itemWI) {
        return 0;
    }

    @Override
    public int Delete(ItemWL itemWI) {
        return 0;
    }

    @Override
    public List<ItemWL> getAll() {
        return null;
    }

    public int getCount(int item_id)
    {
        s=sessionFactory.openSession();
        int count=(int)s.createQuery("select sum(itemCount) from ItemWL where itemId=:itemId").setParameter("itemId",item_id).uniqueResult();
        s.close();
        return count;
    }
    public List<ItemWL> getWList(int item_id)
    {
        s=sessionFactory.openSession();
        List<ItemWL> itemWLS=s.createQuery("from ItemWL where itemId=:itemId").setParameter("itemId",item_id).list();
        s.close();
        return itemWLS;
    }
    public List<ItemWL> getSizeL(int wsize_id,int item_id)
    {
      s=sessionFactory.openSession();
      List<ItemWL>  itemWLS=s.createQuery("from ItemWL where itemId=:itemId and sizeWId=:sizeWId")
              .setParameter("itemId",item_id).setParameter("sizeWId",wsize_id).list();
      s.close();
      return itemWLS;
    }

}
