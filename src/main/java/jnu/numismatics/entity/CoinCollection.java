package jnu.numismatics.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class CoinCollection {

    private String nameCollection;
    private Map<Integer, Coin> coins;
}
