package jnu.numismatics.impl;

import jnu.numismatics.entity.NameCoin;

import java.util.List;

public interface NameCoinDao {

    int createNameCoin(NameCoin nameCoin);

    String readNameCoin(int id);

    int readNameCoin(NameCoin nameCoin);

    List<String> readAllNameCoin();

    void updateNameCoin(int id, NameCoin nameCoin);

    void deleteNameCoin(NameCoin nameCoin);
}
