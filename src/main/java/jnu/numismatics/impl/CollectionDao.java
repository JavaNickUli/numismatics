package jnu.numismatics.impl;

import java.util.List;

public interface CollectionDao {

    int createCollection(String name);

    String readCollection(int id);

    int readCollection(String name);

    List<String> readAllCollection();

    void updateCollection(int id, String name);

    void deleteCollection(String name);
}
