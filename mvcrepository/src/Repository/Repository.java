package Repository;

import java.util.List;

public interface Repository<T> {

    void add(T item);

    void remove(T item);

    void removeById(String id);

    void update(T item);

    List<T> readAll();

    void save();

    T getById(String id);
}
