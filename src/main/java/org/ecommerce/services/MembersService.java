package org.ecommerce.services;

import org.ecommerce.models.dao.MembersDao;
import org.ecommerce.models.entity.Members;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembersService implements ServiceI<Members> {

    @Autowired
    private   MembersDao membersDao;
    @Override
    public int Save(Members members) {
        membersDao.Save(members);
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
