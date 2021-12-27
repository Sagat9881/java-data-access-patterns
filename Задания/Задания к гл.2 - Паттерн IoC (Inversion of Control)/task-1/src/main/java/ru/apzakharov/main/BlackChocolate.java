package ru.apzakharov.main;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class BlackChocolate implements Chocolate {
    private double cacao;
    private String name;
    private double price;

    @Override
    public double cacao() {
        return cacao;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double price() {
        return price;
    }
}
