package org.ecommerce.services;

import org.ecommerce.models.entity.Comment;
import org.ecommerce.services.interfaces.ServiceI;

import java.util.List;

public class CommentService implements ServiceI<Comment> {
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
