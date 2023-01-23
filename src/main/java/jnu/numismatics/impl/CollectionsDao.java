package jnu.numismatics.impl;

import java.util.List;

public interface CollectionsDao<T, I> {

    I createCollection(String name);

    T readCollection(I id);

    T readCollection(String name);

    List<T> readAllCollection();

    void copyCollection(I from, I to);

    void updateNameCollection(I id, String name);

    void deleteCollection(String name);

    void deleteCollection(I id);
}
