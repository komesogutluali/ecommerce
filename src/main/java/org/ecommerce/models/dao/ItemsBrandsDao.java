package org.ecommerce.models.dao;


import org.ecommerce.dto.BrandCount;
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
    public List<BrandCount> getCount()
    {
        s=sessionFactory.openSession();
        List<BrandCount> brandCounts=s.createQuery("SELECT new org.ecommerce.dto.BrandCount(ib.brandId,ib.brandName,(COALESCE(sum(ibs.itemCount),0)+COALESCE(sum(wl.itemCount),0))) from Items i " +
                "inner join ItemsBrands as ib on ib.brandId=i.itemBrandId  " +
                "left join ItemBodySizeItem as ibs on ibs.itemId=i.itemId " +
                "left join ItemWL as wl on wl.itemId=i.itemId GROUP by ib.brandId",BrandCount.class).getResultList();
        s.close();
        return brandCounts;
    }
    public  ItemsBrands getBrand(Integer brand_id)
    {
        s=sessionFactory.openSession();
        ItemsBrands itemsBrands= (ItemsBrands) s.createQuery
                ("from ItemsBrands  where brandId=:brandId").setParameter("brandId",brand_id).uniqueResult();
        s.close();
        return itemsBrands;
    }
}
