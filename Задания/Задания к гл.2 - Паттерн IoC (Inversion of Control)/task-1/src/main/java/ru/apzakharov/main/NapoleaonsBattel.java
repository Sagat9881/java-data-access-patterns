package ru.apzakharov.main;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
public class NapoleaonsBattel  {
    private List<Battel> list = new ArrayList<>();
    public NapoleaonsBattel() { }
    public void print()
    {
        StringBuilder s= new StringBuilder();
        for (Battel g: list)
        {
            s.append(g).append("\n");
        }
        System.out.println(s);
    }
}
