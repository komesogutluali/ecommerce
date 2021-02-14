package org.ecommerce.models.dao;


import org.ecommerce.models.dao.interfaces.Dao;
import org.ecommerce.models.entity.Comment;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CommentDao implements Dao<Comment> {

    /*


    @Autowired
    private SessionFactory sessionFactory;
     */
    @Override

    public int Save(Comment comment) {
        return 0;
    }

    @Override
    public int Update(Comment comment) {
        return 0;
    }

    @Override
    public int Delete(Comment comment) {
        return 0;
    }

    @Override
    public List<Comment> getAll() {
        return null;
    }
}
