package org.ecommerce.services.interfaces;

import java.util.List;

public interface ServiceI<T> {
    int Save(T t);
    int Update(T t);
    int Delete(T t);
    List<T> getAll();
}
