package jnu.numismatics.impl;

import jnu.numismatics.entity.Material;

import java.util.List;

public interface MaterialDao {

    int createMaterial(Material material);

    String readMaterial(int id);

    int readMaterial(Material material);

    List<String> readAllMaterial();

    void updateMaterial(int id, Material material);

    void deleteMaterial(Material material);
}
