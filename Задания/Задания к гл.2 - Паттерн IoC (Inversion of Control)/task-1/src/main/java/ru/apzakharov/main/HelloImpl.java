package ru.apzakharov.main;


public class HelloImpl implements Hello{


    private String s;

    public HelloImpl (String hi) { s=hi; }

    @Override
    public void sayHi() { System.out.println(s); }

    public String getS() { return s; }

    public void setS(String s) { this.s = s; }
}

