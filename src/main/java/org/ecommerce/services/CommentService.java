package org.ecommerce.services;

import org.ecommerce.models.entity.Comment;
import org.ecommerce.services.interfaces.ServiceI;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
