package ru.apzakharov.main;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class TeddyBear implements Toy {

    private  int size;
    private  String type;
    private double price;


    @Override
    public int size() {
        return size;
    }

    @Override
    public String type() {
        return type;
    }

    @Override
    public double price() {
        return price;
    }
}
