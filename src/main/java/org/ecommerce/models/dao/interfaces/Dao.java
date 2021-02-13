package org.ecommerce.models.dao.interfaces;

import java.util.List;

public interface Dao<T> {
    int Save(T t);
    int Update(T t);
    int Delete(T t);
    List<T> getAll();
}
