package ru.apzakharov.main;

import java.util.ArrayList;

public class NewYearGift  {
    private ArrayList<Gift> list = new ArrayList<Gift>();
    public void setList(ArrayList<Gift> list) {
        this.list = list;
    }
    public NewYearGift() { }
    public void print()
    {
        double sum = 0;
        StringBuilder s= new StringBuilder();
        for (Gift g: list)
        {
            s.append(g).append("\n");
            sum+=g.price();
        }
        System.out.println(s+"Total price: "+sum);
    }
}
