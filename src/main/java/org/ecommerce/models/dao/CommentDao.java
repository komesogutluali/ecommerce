package org.ecommerce.models.dao;


import org.ecommerce.models.entity.Comment;

import java.util.List;


public class CommentDao implements Dao<Comment>{

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
