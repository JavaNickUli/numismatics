package jnu.numismatics.impl;

import jnu.numismatics.entity.Coin;

import java.util.List;

public interface CoinDao<T, I> {

    int createCoin(Coin coin);

    String readCoin(int id);

    int readCoin(Coin coin);

    List<String> readAllCoin();

    void updateCoin(int id, Coin coin);

    void deleteCoin(Coin coin);
}
