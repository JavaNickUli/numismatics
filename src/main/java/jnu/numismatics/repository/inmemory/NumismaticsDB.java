package jnu.numismatics.repository.inmemory;

import jnu.numismatics.entity.Collections;

import java.util.Map;
import java.util.TreeMap;

public class NumismaticsDB {

    private static Map<Integer, Collections> collections = new TreeMap<>(Map.of(0, new Collections("Base")));

    public static int createCollection(String name) {
        for (int i = 0; i < collections.size(); i++) {
            if (collections.get(i).getNameCollection().equals(name)) return -1;
        }
        collections.put(collections.size(), new Collections(name));
        return collections.size();
    }
}
