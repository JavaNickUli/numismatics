package jnu.numismatics.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coin {

    private Country country;
    private NameCoin nameCoin;
    private int year;
    private Material material;
    private String img;

    private float weight;
    private float thickness;
    private float diameter;
    private String shape;
    private String herd;

    private Condition condition;
    private Album album;
    private String description;
    private boolean isDuplicate;
    private float price;
}
