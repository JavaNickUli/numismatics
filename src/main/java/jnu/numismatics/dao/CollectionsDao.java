package jnu.numismatics.dao;

import jnu.numismatics.entity.Collections;
import jnu.numismatics.repository.inmemory.NumismaticsDB;

import java.util.List;

public class CollectionsDao implements jnu.numismatics.impl.CollectionsDao<Collections, Integer> {

    @Override
    public Integer createCollection(String name) {
        return NumismaticsDB.createCollection(name);
    }

    @Override
    public Collections readCollection(Integer id) {
        return null;
    }

    @Override
    public Collections readCollection(String name) {
        return null;
    }

    @Override
    public List<Collections> readAllCollection() {
        return null;
    }

    @Override
    public void copyCollection(Integer from, Integer to) {

    }

    @Override
    public void updateNameCollection(Integer id, String name) {

    }

    @Override
    public void deleteCollection(String name) {

    }

    @Override
    public void deleteCollection(Integer id) {

    }
}
