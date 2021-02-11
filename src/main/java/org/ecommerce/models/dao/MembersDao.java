package org.ecommerce.models.dao;

import org.ecommerce.models.entity.Members;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("membersDao")
@Transactional
@EnableTransactionManagement
public class MembersDao implements Dao<Members>{

   @Autowired
    SessionFactory sessionFactory;
    @Override
    public int Save(Members members) {

        Members m=new Members();
        m.setMembersEmail("asdsadsad");
        m.setMembersName("sssssss");
        m.setMembersPassword("asdsadsaas");
        m.setMembersNumber("fghgfhghg");
        Session s=sessionFactory.openSession();
        s.save(members);


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
