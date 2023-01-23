package jnu.numismatics.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoinCollection {

    private String nameCollection;
    private Coin[] coins;
}
