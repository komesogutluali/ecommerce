package org.ecommerce.models.dao;

import org.ecommerce.models.Members;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

public class MembersDao implements Dao<Members>{

    @Override
    public int Save(Members members) {

        return 0;
    }

    @Override
    public int Update(Members members) {
        return 0;
    }

    @Override
    public int Delete(Members members) {
        return 0;
    }

    @Override
    public List<Members> getAll() {
        return null;
    }
}
